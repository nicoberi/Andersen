public class User {
    public void printRole() {
        System.out.println("I am a User.");
    }

    public Ticket getTicket() {

        System.out.println("User is getting a ticket.");
        return new Ticket();
    }
}

