import javax.swing.*;

public class Kryptering_Dekryptering {
    private JPanel panel1;

    private JTextArea msg1;
    private JTextArea msg2;

    private JButton button1;
    private JButton button2;

    private JTextField krypteraDinTextHärTextField;
    private JTextField dekrypteringHärTextField;

    private JTextField dinTextHärTextField;
    private JTextField krypteradeDekrypteradeTextenHärTextField;

    public Kryptering_Dekryptering() {

    }

    public JPanel getPanel() {
        return panel1;
    }

    public String getmessage(){
        return msg1.getText();
    }

    public void sendcrypt(String c) {
        msg2.setText(c);
    }


}

