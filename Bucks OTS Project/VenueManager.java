import java.util.Random;
import java.util.Scanner;

/**
 * The VenueManager class represents a venue manager who can manage shows.
 * Inherits from the User class.
 */
public class VenueManager extends Customer {

    // Private attribute specific to VenueManager
    private String venue;

    /**
     * Adds a new show to the venue.
     */
    public void addShow() {
        // Generate a random ID for the new show
        int id = new Random().nextInt();

        // Prompt user for show details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Event/show name:");
        String name = scanner.nextLine();
        System.out.println("Event/show date:");
        String date = scanner.nextLine();
        System.out.println("Event/show time:");
        String time = scanner.nextLine();
        System.out.println("Event/show description:");
        String description = scanner.nextLine();

        // Create a new Show object with the provided details
        Show show = new Show(id, name, date, time, description);

        try {
            // Call the CreateShow method of the Show class to add the show to the database
            show.createShow(show);
            System.out.println("Event/show added.");
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }

    /**
     * Edits an existing show in the venue.
     *
     * @param show The show to be edited
     */
    public void editShow(Show show) {
        // Prompt user for updated show details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Update event/show name:");
        String name = scanner.nextLine();
        System.out.println("Update event/show date:");
        String date = scanner.nextLine();
        System.out.println("Update event/show time:");
        String time = scanner.nextLine();
        System.out.println("Update event/show description:");
        String description = scanner.nextLine();

        // Create a new Show object with the updated details
        Show newShow = new Show(show.Id, name, date, time, description);

        try {
            // Call the EditShow method of the Show class to update the show in the database
            show.editShow(newShow);
            System.out.println("Event/show updated.");
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }

    /**
     * Cancels a show in the venue.
     *
     * @param show The show to be canceled
     */
    public void cancelShow(Show show) {
        try {
            // Call the DeleteShow method of the Show class to delete the show from the database
            show.deleteShow();
            System.out.println("Event/show deleted.");
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}
