import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Add Book");
        frame.setSize(500, 450);
        frame.setLayout(new BorderLayout(10, 10));

        // Heading
        JLabel heading = new JLabel("Add Your Book", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 24));

        // Form Panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(6, 2, 10, 10));

        // Book Name
        formPanel.add(new JLabel("Book Name:"));
        JTextField bookName = new JTextField();
        formPanel.add(bookName);

        // Author
        formPanel.add(new JLabel("Author:"));
        JTextField author = new JTextField();
        formPanel.add(author);

        // Category
        formPanel.add(new JLabel("Category:"));
        JTextField category = new JTextField();
        formPanel.add(category);

        // ISBN
        formPanel.add(new JLabel("ISBN:"));
        JTextField isbn = new JTextField();
        formPanel.add(isbn);

        // Condition
        formPanel.add(new JLabel("Book Condition:"));
        JComboBox<String> condition = new JComboBox<>(
                new String[]{"New", "Good", "Average", "Old"}
        );
        formPanel.add(condition);

        // Availability
        formPanel.add(new JLabel("Available For:"));
        JComboBox<String> availableFor = new JComboBox<>(
                new String[]{"Exchange", "Sharing", "Both"}
        );
        formPanel.add(availableFor);

        // Buttons
        JPanel buttonPanel = new JPanel();

        JButton addButton = new JButton("Add Book");
        JButton clearButton = new JButton("Clear");

        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);

        // Add Book Action
        addButton.addActionListener(e -> {

            String name = bookName.getText();
            String bookAuthor = author.getText();
            String bookCategory = category.getText();
            String bookIsbn = isbn.getText();

            if (name.isEmpty() || bookAuthor.isEmpty()
                    || bookCategory.isEmpty() || bookIsbn.isEmpty()) {

                JOptionPane.showMessageDialog(
                        frame,
                        "Please fill all fields!"
                );

            } else {

                JOptionPane.showMessageDialog(
                        frame,
                        "Book Added Successfully!"
                );
            }
        });

        // Clear Action
        clearButton.addActionListener(e -> {
            bookName.setText("");
            author.setText("");
            category.setText("");
            isbn.setText("");
            condition.setSelectedIndex(0);
            availableFor.setSelectedIndex(0);
        });

        // Add components
        frame.add(heading, BorderLayout.NORTH);
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}