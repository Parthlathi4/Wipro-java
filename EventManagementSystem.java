import java.util.Scanner;
interface Event {
    void displayDetails();
}
class BaseEvent implements Event {
    private String eventName;
    private String eventDate;

    public BaseEvent(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Date: " + eventDate);
    }
}
class BirthdayEvent extends BaseEvent {
    private String Name;
    private int age;

    public BirthdayEvent(String Name, int age, String eventDate) {
        super("Birthday Party", eventDate);
        this.Name = Name;
        this.age = age;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Celebrant: " + Name);
        System.out.println("Age: " + age);
    }
}
public class EventManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter celebrant's name: ");
        String celebrantName = scanner.nextLine();

        System.out.print("Enter celebrant's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter event date (YYYY-MM-DD): ");
        String eventDate = scanner.nextLine();
        Event birthdayEvent = new BirthdayEvent(celebrantName, age, eventDate);

        System.out.println("\n--- Birthday Event Details ---");
        birthdayEvent.displayDetails();
    }
}
