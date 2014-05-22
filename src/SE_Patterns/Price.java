package SE_Patterns;

abstract class Price {
	abstract double getCharge(int daysRented);

	abstract int getPriceCode();

	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}

class ChildrensPrice extends Price {
	public double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
}

class NewReleasePrice extends Price {
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
	
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
}

class RegularPrice extends Price {
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}

	int getPriceCode() {
		return Movie.REGULAR;
	}
}
