public class User {
    public void printRole() {
        System.out.println("I am a User.");
    }

    public Ticket getTicket() {
        // Логика получения билета
        System.out.println("User is getting a ticket.");
        return new Ticket();
    }
}
