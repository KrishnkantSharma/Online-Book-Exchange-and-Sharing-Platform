import javax.swing.*;
import java.sql.*;

public class Register {
    public static void main(String[] args) {

        JFrame f = new JFrame("Register");

        JLabel l1 = new JLabel("REGISTER");
        l1.setBounds(150, 30, 100, 30);

        JLabel l2 = new JLabel("Name");
        l2.setBounds(50, 80, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(150, 80, 180, 30);

        JLabel l3 = new JLabel("Email");
        l3.setBounds(50, 130, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(150, 130, 180, 30);

        JLabel l4 = new JLabel("Username");
        l4.setBounds(50, 180, 100, 30);
        JTextField t3 = new JTextField();
        t3.setBounds(150, 180, 180, 30);

        JLabel l5 = new JLabel("Password");
        l5.setBounds(50, 230, 100, 30);
        JPasswordField t4 = new JPasswordField();
        t4.setBounds(150, 230, 180, 30);

        JButton b1 = new JButton("Register");
        b1.setBounds(140, 290, 100, 30);

        b1.addActionListener(e -> {
            String name     = t1.getText().trim();
            String email    = t2.getText().trim();
            String username = t3.getText().trim();
            String password = new String(t4.getPassword());

            if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Sab fields bharo");
                return;
            }

            String sql = "INSERT INTO users (name, email, username, password) VALUES (?, ?, ?, ?)";

            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, username);
                ps.setString(4, password);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(f, "Registered Successfully");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");

            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(f, "Username already exists");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(f, "DB Error: " + ex.getMessage());
            }
        });

        f.add(l1);
        f.add(l2); f.add(t1);
        f.add(l3); f.add(t2);
        f.add(l4); f.add(t3);
        f.add(l5); f.add(t4);
        f.add(b1);

        f.setSize(400, 420);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}