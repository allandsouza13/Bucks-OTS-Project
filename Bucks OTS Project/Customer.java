import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * The Customer class represents a customer with various attributes.
 */
public class Customer {

    // Private attributes accessible by subclasses
    private String firstName;
    private String lastName;
    private String address;

    // Private attributes accessible only within this class
    private String username;
    private String password;

    /**
     * View upcoming shows for the customer.
     *
     * @return List of upcoming shows
     */
    public List<Show> viewUpcomingShows() {
        // Implementation for viewing upcoming shows goes here
        return null;  // Placeholder return value
    }

    /**
     * Login method for customer authentication.
     *
     * @return Status code (403 for authentication failure, 200 for success)
     */
    public int login() {
    // Prompt user for username and password
    Scanner scanner = new Scanner(System.in);
    System.out.println("Name:");
    String enteredName = scanner.nextLine();
    
    System.out.println("Lastname:");
    String enteredLastname = scanner.nextLine();
    
    System.out.println("Phone Number:");
    String enteredPhoneNumber = scanner.nextLine();
    
    System.out.println("Username:");
    String enteredUsername = scanner.nextLine();

    System.out.println("Password:");
    String enteredPassword = scanner.nextLine();

  
        try {
            // Establish database connection (replace with your database details)
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "your_username", "your_password");

            // Prepare SQL statement to check customer credentials
            String sqlQuery = "SELECT * FROM customer WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            statement.setString(1, enteredUsername);
            statement.setString(2, enteredPassword);

            // Execute the query
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // Authentication success
                System.out.println("Login successful");
                return 200;
            } else {
                // Authentication failure
                System.out.println("Authentication failure: Incorrect username or password");
                return 403;
            }
        } catch (SQLException e) {
            // Handle database connection or query errors
            e.printStackTrace();
            return 500;  // Internal server error
        }
    }
}
