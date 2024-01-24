import java.util.Scanner;

public class Show {
    private static int idCounter = 1;

    private final int id;
    private String name;
    private String date;
    private String time;
    private String description;

    public Show(String name, String date, String time, String description) {
        this.id = idCounter++;
        this.name = name;
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public void createShow() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter show details:");

        System.out.print("Name: ");
        this.name = scanner.nextLine();

        System.out.print("Date: ");
        this.date = scanner.nextLine();

        System.out.print("Time: ");
        this.time = scanner.nextLine();

        System.out.print("Description: ");
        this.description = scanner.nextLine();

        // Simulate database interaction for creating a show
        System.out.println("Show created: " + this);
    }

    public void editShow(Show updatedShow) {
        this.name = updatedShow.getName();
        this.date = updatedShow.getDate();
        this.time = updatedShow.getTime();
        this.description = updatedShow.getDescription();

        // Simulate database interaction for updating a show
        System.out.println("Show updated: " + this);
    }

    public void deleteShow() {
        // Simulate database interaction for deleting a show
        System.out.println("Show deleted: " + this);
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
