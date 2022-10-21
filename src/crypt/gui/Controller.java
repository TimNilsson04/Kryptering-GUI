package crypt.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame {
    Model model;
    Kryptering_Dekryptering view;

    public Controller(Model m, Kryptering_Dekryptering v) {
        this.model = m;
        this.view = v;
        this.setContentPane(view.getPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        view.setCryptListener(new cryptListener());
    }

    public class cryptListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.msg(view.getmsg());
            model.crypting();
            view.sendcrypt(model.crypt());
        }
    }

    public static void main(String[] args) {
        Model m = new Model();
        Kryptering_Dekryptering v = new Kryptering_Dekryptering();
        Controller thisIsTheProgram = new Controller(m,v);
        thisIsTheProgram.setVisible(true);

    }
}



