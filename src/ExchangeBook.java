import javax.swing.*;

public class ExchangeBook {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JLabel l1 = new JLabel("EXCHANGE BOOK");
        l1.setBounds(140, 30, 150, 30);

        JLabel l2 = new JLabel("Book Name");
        l2.setBounds(50, 90, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 90, 180, 30);

        JLabel l3 = new JLabel("Owner Name");
        l3.setBounds(50, 140, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 140, 180, 30);

        JButton b1 = new JButton("Exchange");
        b1.setBounds(140, 200, 110, 30);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(b1);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}