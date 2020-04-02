package springmvctags;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	LinkedHashMap<String,String> countries;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student() {
		countries=new LinkedHashMap<String, String>();
		countries.put("Brazil", "Brazil");
		countries.put("India", "India");
		countries.put("France", "France");
		countries.put("Germany", "Germany");
		countries.put("USA", "United states of America");
		
		
	}
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
