package t3;

public class Ticket {
    private Movie movie;
    private String customerName;
    private boolean isBooked;

    public Ticket(Movie movie, String customerName) {
        this.movie = movie;
        this.customerName = customerName;
        this.isBooked = true;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getCustomerName() {
        return customerName;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void cancelBooking() {
        this.isBooked = false;
    }

    @Override
    public String toString() {
        return "Ticket for " + movie.getTitle() + " booked by " + customerName;
    }
}
