package crypt.gui;

import javax.swing.*;

class Kryptering_Dekryptering {

    public JPanel panel1;

    public JTextArea msg1;
    public JTextArea msg2;

    public JButton button1;
    public JButton button2;

    public JTextField krypteraDinTextHärTextField;
    public JTextField dekrypteringHärTextField;

    public JTextField dinTextHärTextField;
    public JTextField krypteradeDekrypteradeTextenTextField;


    public Kryptering_Dekryptering() {

    }

    public JPanel getPanel() {

        return panel1;
    }

    public String getmsg() {

        return msg1.getText();
    }

    public void sendcrypt(String c) {

        msg2.setText(c);
    }

    public static void main(String[]args){
        JFrame frame = new JFrame("View");
        frame.setContentPane(new Kryptering_Dekryptering() {}.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public void setCryptListener(Controller.cryptListener cryptListener) {
        button1.addActionListener(cryptListener);
    }
}


