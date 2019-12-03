package project;

/**
 *
 * This subclass creates a ticket purchased on the day of the event, providing an ID number
 * and listing its price as full price.
 */
public class SameDayTicket extends Ticket {
    
    public SameDayTicket(int ticketIDNumber){
        super(ticketIDNumber);
        super.price = price;
    }
    
    @Override
    public String toString() {
        return String.format("Ticket Details: \nTicket ID = %d\nSame Day Price: $%.2f\n", 
                                this.ticketIDNumber, this.getPrice());
    }
}
