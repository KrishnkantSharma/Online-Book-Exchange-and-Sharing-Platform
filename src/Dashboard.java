import javax.swing.*;

public class Dashboard {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JLabel l1 = new JLabel("ONLINE BOOK EXCHANGE");
        l1.setBounds(100, 30, 220, 30);

        JLabel l2 = new JLabel("1. Add Book");
        l2.setBounds(100, 90, 150, 30);

        JLabel l3 = new JLabel("2. View Books");
        l3.setBounds(100, 130, 150, 30);

        JLabel l4 = new JLabel("3. My Books");
        l4.setBounds(100, 170, 150, 30);

        JLabel l5 = new JLabel("4. Exchange Book");
        l5.setBounds(100, 210, 150, 30);

        JLabel l6 = new JLabel("5. Book Details");
        l6.setBounds(100, 250, 150, 30);

        JLabel l7 = new JLabel("6. About");
        l7.setBounds(100, 290, 150, 30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);

        f.setSize(400, 380);
        f.setLayout(null);
        f.setVisible(true);
    }
}