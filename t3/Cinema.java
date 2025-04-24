package t3;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();

    // Methods for managing movies and ticket bookings
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public boolean removeMovie(Movie movie) {
        return movies.remove(movie);
    }

    // New feature: Limit to only one ticket per movie per customer
public boolean bookTicket(Movie movie, String customerName) {
    for (Ticket ticket : tickets) {
        if (ticket.getMovie().equals(movie) && ticket.getCustomerName().equals(customerName)) {
            System.out.println("Customer already has a ticket for this movie.");
            return false;
        }
    }
    // Proceed to book the ticket
    Ticket ticket = new Ticket(movie, customerName);
    tickets.add(ticket);
    return true;
}


    public boolean cancelTicket(Ticket ticket) {
        if (tickets.contains(ticket) && ticket.isBooked()) {
            ticket.cancelBooking();
            return true;
        }
        return false;
    }

    public void printMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies available.");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    public void printTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked.");
        } else {
            for (Ticket ticket : tickets) {
                System.out.println(ticket);
            }
        }
    }
}
