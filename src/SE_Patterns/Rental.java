package SE_Patterns;

class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie newmovie, int newdaysRented) {
		_movie = newmovie;
		_daysRented = newdaysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	public int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}

}