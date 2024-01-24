import java.util.List;

/**
 * The Show class represents a show with various attributes.
 */
public class Show {

    // Unique identifier for the show
    public int Id;

    // Name of the show
    public String Name;

    // Date of the show
    public String Date;

    // Time of the show
    public String Time;

    // Description of the show
    public String Description;

    // Reference to the seating chart associated with the show
    public SeatingChart seatingChart;

    // List of predefined show names
    public static final List<String> SHOW_NAMES = List.of("Comedy", "Gaming", "Talk Show", "Reality Show");

    /**
     * Constructor to initialize a show with specified attributes.
     */
    public Show(int id, String name, String date, String time, String description) {
        Id = id;
        Name = name;
        Date = date;
        Time = time;
        Description = description;
    }

    /**
     * View available seats for the show.
     *
     * @return List of available seats
     */
    public List<Seat> viewAvailableSeats() {
        // Retrieve available seats from the associated seating chart
        List<Seat> availableSeats = seatingChart.displayAvailableSeats();
        return availableSeats;
    }

    /**
     * Create a new show in the database and allocate a new seating chart.
     *
     * @param show The show to be created
     */
    public void createShow(Show show) {
        // Execute SQL statement to insert show details into the database
        // Note: This is a placeholder and may need adjustments based on your database setup
        // Statement stmt = // Create a Statement object based on your database connection
        // stmt.execute("INSERT INTO show (ID, name, date, time, description) VALUES (" + show.Id, show.Date, show.Time, show.Description + ")");
        
        // Allocate a new seating chart for the show
        allocateSeatingChart();
    }

    /**
     * Edit the details of an existing show in the database.
     *
     * @param show The updated show details
     */
    public void editShow(Show show) {
        // Execute SQL statement to update show details in the database
        // Note: This is a placeholder and may need adjustments based on your database setup
        // Statement stmt = // Create a Statement object based on your database connection
        // stmt.execute("UPDATE show SET name = " + show.Name + " date = " + show.Date + " time = " + show.Time + " description = " + show.Description + " WHERE ID = " + Id);
    }

    /**
     * Delete the show from the database and its associated seating chart.
     */
    public void deleteShow() {
        // Execute SQL statement to delete show from the database
        // Note: This is a placeholder and may need adjustments based on your database setup
        // Statement stmt = // Create a Statement object based on your database connection
        // stmt.execute("DELETE FROM show WHERE ID = " + Id);
        
        // Delete the associated seating chart
        deleteSeatingChart();
    }

    /**
     * Allocate a new seating chart for the show.
     */
    private void allocateSeatingChart() {
        // Implementation for allocating a new seating chart goes here
    }

    /**
     * Delete the seating chart associated with the show.
     */
    private void deleteSeatingChart() {
        // Implementation for deleting the seating chart goes here
    }
}
