package crypt.gui;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Model {


    private  int m;
    private  int k = '(';
    private  String crypt = "";
    private  String crypt1;
    private  String hex = "";
    private  String message1 = "";
    private  String result1 = new String();


    public static void main(String[] args) throws IOException {


       // result1 = chararray(crypt1);

       // System.out.println("Ditt meddelande " + message1);
       // System.out.println("Hex " + crypt1);
       // System.out.println("Krypteringen " + result1);
       // filewriter(result1);

    }
    public void msg(String getmsg){
        message1 = getmsg;
    }

    public String crypt(){
        return result1;
    }

    public void message() throws IOException {

        String message = "";

        int Answer = JOptionPane.showConfirmDialog(null,"Vill du skriva egen text?");

        if(Answer == 0){
            message = JOptionPane.showInputDialog("Skriv din text här");
        }



        FileReader file = new FileReader("src/minfil.txt");

        if(Answer != 0) {
            BufferedReader bufferedreader = new BufferedReader(file);
            String line = "";
            Scanner scanner = new Scanner(bufferedreader);


            while (scanner.hasNextLine()) {
                //System.out.println(scanner.nextLine());
                message = message + scanner.nextLine();
            }

            bufferedreader.close();
        }
         message1 = message;
    }

    public  int encrypt() {

        return (m ^ k);

    }

    public void crypting(){
        int m;

        String custom;

        int Answer = JOptionPane.showConfirmDialog(null,"Vill du skriva egen nyckel??");

        if(Answer == 0){
            custom = JOptionPane.showInputDialog("Skriv din nyckel här");
            k = custom.charAt(0);
        }


        for (int i = 0; i < message1.length(); i++) {
            m = message1.charAt(i);
            hex = Integer.toHexString(encrypt());
            crypt += hex;
        }

        String result = "";

        char[] charArray = crypt.toCharArray();
        for(int i = 0; i < charArray.length; i=i+2) {
            String st = ""+charArray[i]+""+charArray[i+1];
            char ch = (char)Integer.parseInt(st, 16);
            result = result + ch;
        }
        result1= result;

    }

    public void filewriter() throws IOException {

        int Answer = JOptionPane.showConfirmDialog(null,"Vill du skriva ner krypteringen i filen??");

        if(Answer == 0){
            try {

                FileWriter fw
                        = new FileWriter("minfil.txt");
                for (int i = 0; i < result1.length(); i++)
                    fw.write(result1.charAt(i));

                System.out.println("Successfully written");

                fw.close();
            }
            catch (Exception e) {
                e.getStackTrace();
            }
        }

        return ;
    }

   /* public static String chararray(String crypt1){
        String result = "";

        char[] charArray = crypt1.toCharArray();
        for(int i = 0; i < charArray.length; i=i+2) {
            String st = ""+charArray[i]+""+charArray[i+1];
            char ch = (char)Integer.parseInt(st, 16);
            result = result + ch;
        }
        return result;
    }

    */
}