import javax.swing.*;

public class ViewBooks {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JLabel l1 = new JLabel("AVAILABLE BOOKS");
        l1.setBounds(130, 30, 150, 30);

        JLabel l2 = new JLabel("Book 1: Java Programming");
        l2.setBounds(70, 90, 250, 30);

        JLabel l3 = new JLabel("Author: Herbert Schildt");
        l3.setBounds(70, 120, 250, 30);

        JLabel l4 = new JLabel("Book 2: Data Structures");
        l4.setBounds(70, 170, 250, 30);

        JLabel l5 = new JLabel("Author: Mark Allen");
        l5.setBounds(70, 200, 250, 30);

        JLabel l6 = new JLabel("Book 3: Computer Networks");
        l6.setBounds(70, 250, 250, 30);

        JLabel l7 = new JLabel("Author: Andrew");
        l7.setBounds(70, 280, 250, 30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);

        f.setSize(400, 370);
        f.setLayout(null);
        f.setVisible(true);
    }
}