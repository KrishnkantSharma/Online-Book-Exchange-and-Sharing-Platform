import javax.swing.*;

public class AddBook {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JLabel l1 = new JLabel("ADD BOOK");
        l1.setBounds(150, 30, 100, 30);

        JLabel l2 = new JLabel("Book Name");
        l2.setBounds(50, 80, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 80, 180, 30);

        JLabel l3 = new JLabel("Author");
        l3.setBounds(50, 120, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 120, 180, 30);

        JLabel l4 = new JLabel("Category");
        l4.setBounds(50, 160, 100, 30);

        JTextField t3 = new JTextField();
        t3.setBounds(150, 160, 180, 30);

        JLabel l5 = new JLabel("Condition");
        l5.setBounds(50, 200, 100, 30);

        JTextField t4 = new JTextField();
        t4.setBounds(150, 200, 180, 30);

        JButton b1 = new JButton("Add Book");
        b1.setBounds(140, 250, 110, 30);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(l4);
        f.add(t3);
        f.add(l5);
        f.add(t4);
        f.add(b1);

        f.setSize(400, 350);
        f.setLayout(null);
        f.setVisible(true);
    }
}