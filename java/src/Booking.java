public class Booking {
    private int bookingNo, adultTickets, childTickets, seniorTickets;
    private double totalPrice;

    private void createOrderHistory(){}
    private void applyPromo(){}

    public int getBookingNo() {
        return bookingNo;
    }

    public void setBookingNo(int bookingNo) {
        this.bookingNo = bookingNo;
    }

    public int getAdultTickets() {
        return adultTickets;
    }

    public void setAdultTickets(int adultTickets) {
        this.adultTickets = adultTickets;
    }

    public int getChildTickets() {
        return childTickets;
    }

    public void setChildTickets(int childTickets) {
        this.childTickets = childTickets;
    }

    public int getSeniorTickets() {
        return seniorTickets;
    }

    public void setSeniorTickets(int seniorTickets) {
        this.seniorTickets = seniorTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
