/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
    public class TestThreadingAndGUI implements PropertyChangeListener {



    private DummyRunnable runnable;

    public static class DummyRunnable implements Runnable {

        private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

        private String command;

        private JTextArea textarea;
        
        public DummyRunnable(JTextArea TextArea) {
            this.textarea = TextArea;
        }

        public void addPropertyChangeListener(PropertyChangeListener listener) {
            pcs.addPropertyChangeListener(listener);
        }

        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                try {
                    Thread.sleep(((random.nextInt(3)) + 1) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 15; i++) {
                    sb.append((char) ('a' + random.nextInt(26)));
                }
                setCommand(sb.toString());
            }
        }

        public String getCommand() {
            return command;
        }

        private void setCommand(String command) {
            String old = this.command;
            this.command = command;
            pcs.firePropertyChange("command", old, command);
        }
    }

    public void initUI(DummyRunnable runnable) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setSize(600, 600);
        frame.setVisible(true);
        this.runnable = runnable;
        runnable.addPropertyChangeListener(this);
    }

    private void executeCommand() {
        label.setText(runnable.getCommand());
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("command")) {
            // Received new command (outside EDT)
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    // Updating GUI inside EDT
                    executeCommand();
                }
            });
        }
    }

