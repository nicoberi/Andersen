import java.util.Objects;

public class Ticket implements Identifiable {
    @NullableWarning(message = "Variable [id] is null in [Ticket]")
    private Integer id;

    private String concertHall;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private double maxAllowedBackpackWeight;
    private double price;

    public Ticket(String id, String concertHall, int eventCode, long time, boolean isPromo, char stadiumSector, double maxAllowedBackpackWeight, double price) {
        setId(Integer.parseInt(id));
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxAllowedBackpackWeight = maxAllowedBackpackWeight;
        this.price = price;
    }

    public Ticket(String concertHall, int eventCode, long time) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
    }

    public Ticket() {}

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id != null ? this.id : -1;
    }

    public void print() {
        System.out.println("Ticket Info: " + this.toString());
    }

    public void updateTime(long newTime) {
        this.time = newTime;
    }

    public void updateStadiumSector(char newSector) {
        this.stadiumSector = newSector;
    }

    public void shared(String method) {
        if ("phone".equalsIgnoreCase(method)) {
            System.out.println("Ticket shared via phone.");
        } else if ("email".equalsIgnoreCase(method)) {
            System.out.println("Ticket shared via email.");
        } else {
            System.out.println("Unknown sharing method.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return eventCode == ticket.eventCode && Objects.equals(id, ticket.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventCode);
    }

    @Override
    public String toString() {
        return "Ticket{id=" + id + ", concertHall='" + concertHall + "', eventCode=" + eventCode + "}";
    }
}
