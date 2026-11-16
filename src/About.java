import javax.swing.*;

public class About {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JLabel l1 = new JLabel("ABOUT PROJECT");
        l1.setBounds(140, 30, 150, 30);

        JLabel l2 = new JLabel("Online Book Exchange");
        l2.setBounds(100, 90, 200, 30);

        JLabel l3 = new JLabel("This project is used to");
        l3.setBounds(100, 130, 200, 30);

        JLabel l4 = new JLabel("share and exchange books.");
        l4.setBounds(100, 170, 200, 30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        f.setSize(400, 280);
        f.setLayout(null);
        f.setVisible(true);
    }
}