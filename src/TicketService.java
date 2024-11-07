public class TicketService {
    public static void main(String[] args) {

        User user = new User();
        Admin admin = new Admin();


        user.printRole();
        admin.printRole();


        Ticket ticket = new Ticket("1234", "MainHall", 101, 1680100000L, true, 'A', 5.0, 100.0);
        ticket.print();
        ticket.updateTime(1680200000L);
        ticket.updateStadiumSector('B');


        ticket.shared("phone");
        ticket.shared("email");


        Ticket userTicket = user.getTicket();
        admin.checkTicket(userTicket);
    }
}
