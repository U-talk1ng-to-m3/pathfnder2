import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {




        JFrame window=new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Casper Avda");



        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        uygulama uyg=new uygulama();







        window.add(uyg);
        window.pack();


        window.setLocationRelativeTo(null);
        window.setVisible(true);
        uyg.start_thread();






    }
}