import javax.swing.*;

public class BookDetails {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JLabel l1 = new JLabel("BOOK DETAILS");
        l1.setBounds(140, 30, 150, 30);

        JLabel l2 = new JLabel("Book Name: Java Programming");
        l2.setBounds(60, 90, 250, 30);

        JLabel l3 = new JLabel("Author: Herbert Schildt");
        l3.setBounds(60, 130, 250, 30);

        JLabel l4 = new JLabel("Category: Programming");
        l4.setBounds(60, 170, 250, 30);

        JLabel l5 = new JLabel("Condition: Good");
        l5.setBounds(60, 210, 250, 30);

        JLabel l6 = new JLabel("Owner: Rahul");
        l6.setBounds(60, 250, 250, 30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);

        f.setSize(400, 330);
        f.setLayout(null);
        f.setVisible(true);
    }
}