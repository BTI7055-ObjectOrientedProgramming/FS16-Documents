package topic01;

import topic01.Country.France;

public class Passport<T extends Country> {

	private T country;

	public Passport(T country) {
		this.country = country;
	}
	
	public T getCountry() {
		return this.country;
	}
	
	public String getLanguage() {
		return this.country.getLanguage();
	}

	public static void main(String[] args) {
		France france = new France();
		Passport<France> passport = new Passport<>(france);
		France country = passport.getCountry();
		
		// the following line produces a compilation error
		Passport<String> pp = new Passport<>("France");
	}
}
