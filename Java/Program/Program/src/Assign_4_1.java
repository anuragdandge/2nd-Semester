import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Assign_4_1 extends JFrame implements ActionListener {

    private Connection connection;
    private java.sql.Statement statement;
    private ResultSet resultSet;

    private JLabel idLabel;
    private JTextField idField;
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel ageLabel;
    private JTextField ageField;
    private JLabel gradeLabel;
    private JTextField gradeField;
    private JButton firstButton;
    private JButton lastButton;
    private JButton nextButton;
    private JButton previousButton;

    public Assign_4_1() {
        super("Student Records");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        idLabel = new JLabel("ID:");

        idField = new JTextField(10);
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        ageLabel = new JLabel("Age:");
        ageField = new JTextField(5);
        gradeLabel = new JLabel("Grade:");
        gradeField = new JTextField(2);
        firstButton = new JButton("First");
        lastButton = new JButton("Last");
        nextButton = new JButton("Next");
        previousButton = new JButton("Previous");

        firstButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstRecord();
            }
        });

        lastButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lastRecord();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nextRecord();
            }
        });

        previousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                previousRecord();
            }
        });

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new GridLayout(5, 2));
        mainPanel.add(idLabel);
        mainPanel.add(idField);
        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(ageLabel);
        mainPanel.add(ageField);
        mainPanel.add(gradeLabel);
        mainPanel.add(gradeField);
        mainPanel.add(firstButton);
        mainPanel.add(lastButton);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);

        Container contentPane = getContentPane();
        contentPane.add(mainPanel, BorderLayout.NORTH);
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);

        connectToDatabase();
        firstRecord();
    }

    private void connectToDatabase() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "Anurag";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);
            // java.sql.Statement statement =
            // con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
            // ResultSet.CONCUR_UPDATABLE);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = ((java.sql.Statement) statement).executeQuery("select * from students");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private void firstRecord() {
        try {
            if (resultSet.first()) {
                resultSet.first();
                displayRecord();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void lastRecord() {
        try {
            if (resultSet.last()) {
                displayRecord();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void nextRecord() {
        try {
            if (resultSet.next()) {
                displayRecord();
            } else {
                resultSet.previous(); // Move the cursor back to the current position

                JOptionPane.showMessageDialog(this, "End of records.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void previousRecord() {
        try {
            if (resultSet.previous()) {

                displayRecord();
            } else {
                resultSet.next(); // Move the cursor back to the current position
                                  // JOptionPane.showMessageDialog(this, "Start of records.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void displayRecord() {
        try {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String grade = resultSet.getString("grade");

            idField.setText(Integer.toString(id));
            nameField.setText(name);
            ageField.setText(Integer.toString(age));
            gradeField.setText(grade);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Assign_4_1 frame = new Assign_4_1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
