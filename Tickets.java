public class Ticket {
    
    // This serves as the superclass for the SameDayTicket and AdvanceTicket, but doesn't really get called itself in the test.
  
    double price = 50.00;
    int ticketIDNumber;
    
    // constructor to create a new ticket with unique ID
    // NOTE: I have been using someone else's sample code as a guide. (They could be doing it wrong for all I know)
    // They set the constructor up this way, but I'm not sure I understand why the parameter is set like this.
    // Each ticket is supposed to get a unique ticket ID when the test program runs.
  
    public Ticket (int ticketIDNumber) {
        this.ticketIDNumber = ticketIDNumber;
    }
    
    // getPrice() method to set an initial (full) price
    public double getPrice() {
        return price;
    }
    
    // toString() method to print the ticket information as a String
    // I spent too long trying to figure out String.format, but I think I got it to work how I want.
    public String toString() {
        return String.format("Ticket Details: \nTicket ID = %d\nFull Price: $%.2f\n", 
                                this.ticketIDNumber, this.getPrice());
    }
    
}
