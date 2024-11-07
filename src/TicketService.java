public class TicketService {
    public static void main(String[] args) {
        // Создание объектов пользователя и администратора
        User user = new User();
        Admin admin = new Admin();

        // Полиморфное поведение для `printRole()`
        user.printRole();
        admin.printRole();

        // Пример работы с билетом
        Ticket ticket = new Ticket("1234", "MainHall", 101, 1680100000L, true, 'A', 5.0, 100.0);
        ticket.print();
        ticket.updateTime(1680200000L);
        ticket.updateStadiumSector('B');

        // Пример передачи билета
        ticket.shared("phone");
        ticket.shared("email");

        // Пример получения билета пользователем и проверки билета администратором
        Ticket userTicket = user.getTicket();
        admin.checkTicket(userTicket);
    }
}
