
public class NetflixIsBæ {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Zootopia", 5);
		Movie movie2 = new Movie("Star Wars: The Force Awakens", 4);
		Movie movie3 = new Movie("The 5th Wave", 3);
		Movie movie4 = new Movie("Hunger Games", 2);
		Movie movie5 = new Movie("Toy Story", 1);

		System.out.println(movie1.getTicketPrice());

		Netflix netflix = new Netflix();
		netflix.addMovie(movie1);
		netflix.addMovie(movie2);
		netflix.addMovie(movie3);
		netflix.addMovie(movie4);
		netflix.addMovie(movie5);
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);
		System.out.println(movie4);
		System.out.println(movie5);

		netflix.sortMoviesByRating();

		System.out.println("The best movie is " + netflix.getBestMovie() + "!!!");
		System.out.println("The second best movie is" + netflix.getMovie(1) + "!!!");

	}
}