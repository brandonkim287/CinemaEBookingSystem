
import java.sql.Date;

public class OrderHistory{
    private Date showtime;
    private String movie;
    private double totalCost;
    private int adultTickets, childTickets, seniorTickets;
    
    public Date getShowTime() {
        return showtime;
    }

    public String getMovie() {
        return movie;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getAdultTickets() {
        return adultTickets;
    }

    public int getChildTickets() {
        return childTickets;
    }

    public int getSeniorTickets() {
        return seniorTickets;
    }

    public void setShowtime(Date showtime) {
        this.showtime = showtime;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setAdultTickets(int adultTickets) {
        this.adultTickets = adultTickets;
    }

    public void setChildTickets(int childTickets) {
        this.childTickets = childTickets;
    }

    public void setSeinorTickets(int seniorTickets) {
        this.seniorTickets = seniorTickets;
    }
}