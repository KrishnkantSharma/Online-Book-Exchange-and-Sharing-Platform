import javax.swing.*;

public class MyBooks {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JLabel l1 = new JLabel("MY BOOKS");
        l1.setBounds(150, 30, 100, 30);

        JLabel l2 = new JLabel("1. Java Programming");
        l2.setBounds(80, 90, 200, 30);

        JLabel l3 = new JLabel("2. Data Structures");
        l3.setBounds(80, 130, 200, 30);

        JLabel l4 = new JLabel("3. Computer Networks");
        l4.setBounds(80, 170, 200, 30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        f.setSize(400, 280);
        f.setLayout(null);
        f.setVisible(true);
    }
}