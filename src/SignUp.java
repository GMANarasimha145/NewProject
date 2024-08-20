
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JButton signUpButton;

    public SignUp() {
        setTitle("Sign Up Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        add(usernameLabel);
        add(usernameField);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        add(passwordLabel);
        add(passwordField);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        add(emailLabel);
        add(emailField);

        // Sign Up Button
        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);
        add(new JLabel()); // Empty cell for alignment
        add(signUpButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String email = emailField.getText();

            // Simulate sign-up process
            JOptionPane.showMessageDialog(this, "Signed up successfully!\n" +
                    "Username: " + username + "\n" +
                    "Email: " + email);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SignUp());
    }
}