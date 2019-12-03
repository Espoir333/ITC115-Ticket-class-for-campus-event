public class AdvanceTicket extends Ticket {
    
    protected int daysInAdvance;
    private static final int TEN_DAYS_OR_LESS = 10;  // Denotes that 10 days is the max for the smaller discount
    private static final int LAST_DAY_ADVANCE = 1;   // Denotes 1 days is the minimum for the smaller discount
                                                     // I didn't define a max for the larger discount, because in theory
                                                     // they could be on sale for 6 months ahead of time, I guess.
    
    public AdvanceTicket(int ticketIDNumber, int daysInAdvance){
        super(ticketIDNumber);
    
        if (daysInAdvance >= TEN_DAYS_OR_LESS) {
            super.price = price - 20.0;
        }
        
        else if (daysInAdvance < TEN_DAYS_OR_LESS && daysInAdvance >= LAST_DAY_ADVANCE) {
            super.price = price - 10.0;
        }
        
        else {
            super.price = price;
        }
    }
    
    @Override
    public double getPrice() {
        return super.price;
    }
    
    // When I run a test of this, it prints 0 as my advance days. What am I missing??
    public String toString() {
        return String.format("Ticket Details: \nTicket ID: %d\nDays In Advance: %d\nAdvance Price: $%.2f\n", 
                                this.ticketIDNumber, this.daysInAdvance, this.getPrice());
    }
}
