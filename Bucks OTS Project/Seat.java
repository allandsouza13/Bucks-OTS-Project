/**
 * The Seat class represents a seat with various attributes.
 */
public class Seat {

    // Unique identifier for the seat
    public int Id;

    // Location of the seat
    public String Location;

    // Price of the seat
    public int Price;

    // Type of the seat
    public String Type;

    // Indicates whether the seat is assigned or not
    public boolean Assigned;

    /**
     * Constructor to initialize a seat with specified attributes.
     */
    public Seat(int id, String location, int price, String type, boolean assigned) {
        this.Id = id;
        this.Location = location;
        this.Price = price;
        this.Type = type;
        this.Assigned = assigned;
    }

    // Getters and setters can be added if needed

    // Example getter and setter:
    // public int getId() {
    //     return Id;
    // }
    //
    // public void setId(int id) {
    //     this.Id = id;
    // }

    // Similar getter and setter methods can be added for other fields

    // Additional methods can be added as per the requirements
}
