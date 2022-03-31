package p2;

public class BookStore {

	// attributes | properties | state | field
	String name;
	String address;
	Book[] books;

	// Behaviors

	void sell(Book book) {
	}

	int getDiscountPercentage(Book book) {

		if (book.genres.equals(Genres.FICTION)) {
			return 25;
		} else {
			return 0;
		}
	}

}
