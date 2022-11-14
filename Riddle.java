import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;// scennner definiert
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Riddle {
    public static Integer mynumber  =110; //Reazel zahl definiert
    static JLabel text = new JLabel("Bitte geben sie eine Zahl ein!");//Label erstellen
    static Integer tries = 0; //Wiederholung definieren
    static JTextField textField = new JTextField();//text feld definieren



    public static void main(String[] args) {
        // nextRound();//Wiederholungen im main sollte  ausführen werden
        openuI();
    }
    public static void openuI(){ //Benuzer in Hintergerund stellen
        JFrame frame =new JFrame("Zahl Raten ");// Fenster aufmachen Titel eingeben
        frame.setSize(400,300);// Die Große des Fenster eingeben
        frame.setLocation(100,150);//Ort das Fenster
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//beenden automatisch
        frame.setDefaultLookAndFeelDecorated(true);//steil von Fesnter Deising


        text.setBounds(50,50,350,30);//size das Label


        textField.setBounds(50,100,200,30);//textfeld


        JButton button = new JButton("Raten");// taster
        button.setBounds(50,150,200,30);//Grosse der taster

        button. addActionListener(new ActionListener() {//nach der Taster gedruckt ist ausgeführt wird
            @Override
            public void actionPerformed(ActionEvent e){

                String textFromTextfield = textField.getText();
                Integer number = Integer.parseInt(textFromTextfield);
                guess(number);
            }
        });//Führt funktion aus,wenn a // f den Button geklickt wird
        frame.setLayout(null);//text nach eingabe nicht verschwenden platz machen
        frame.setVisible(true);//zeigen das labal
        frame.add(text);//zeigen
        frame.add(textField);
        frame.add(button);

    }
    /*public static void nextRound() { //wiederholung definiert
        tries++;
            Scanner scanner = new Scanner(System.in);//text eigabe funktion im konsole
            System.out.println("Bitte gebe ein Zahl ein");
        int number = scanner.nextInt();// eingabe definiert
        guess(number);//eingabe ausführen
    }*/
    public static void guess(Integer number) {//funktion der benutzer
        tries++;
        if (number == mynumber) {
            //System.out.println("richtig");
            text.setText("Richtig geraten");
        } else {
            //System.out.println("falsh"+ tries);
            text.setText("Falsch geraten");
            // nextRound();//wenn falsh wieder holen das Progeramm
            textField.setText("");


        }
    }



}