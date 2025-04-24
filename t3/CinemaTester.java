package t3;

public class CinemaTester {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.setTitle("The Shawshank Redemption");
        m1.setDirector("Frank Darabont");
        m1.setGenre("Drama");

        Movie m2 = new Movie();
        m2.setTitle("The Dark Knight");
        m2.setDirector("Christopher Nolan");
        m2.setGenre("Action");

        Cinema cinema = new Cinema();
        cinema.addMovie(m1);
        cinema.addMovie(m2);

        // Book tickets
        cinema.bookTicket(m1, "Alice");
        cinema.bookTicket(m2, "Bob");

        // Print movie and ticket info
        cinema.printMovies();
        cinema.printTickets();

        // Cancel a ticket
        Ticket ticket = new Ticket(m1, "Alice");
        cinema.cancelTicket(ticket);
        cinema.printTickets();
    }
}
