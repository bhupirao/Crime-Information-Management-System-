package crimeManagementSystemApp.Bean;

import java.util.Date;

public class Crime {
	
	private Date dateOfCrime;
	private String placeOfCrime;
	private String descOfCrime;
	private String Victims;
	private String detailDescOfCrime;
	private String namesOfSuspected;
	
	
	public Crime() {
	
	}


	public Crime(Date dateOfCrime, String placeOfCrime, String descOfCrime, String victims, String detailDescOfCrime,
			String namesOfSuspected) {
		super();
		this.dateOfCrime = dateOfCrime;
		this.placeOfCrime = placeOfCrime;
		this.descOfCrime = descOfCrime;
		Victims = victims;
		this.detailDescOfCrime = detailDescOfCrime;
		this.namesOfSuspected = namesOfSuspected;
	}


	public Date getDateOfCrime() {
		return dateOfCrime;
	}


	public void setDateOfCrime(Date dateOfCrime) {
		this.dateOfCrime = dateOfCrime;
	}


	public String getPlaceOfCrime() {
		return placeOfCrime;
	}


	public void setPlaceOfCrime(String placeOfCrime) {
		this.placeOfCrime = placeOfCrime;
	}


	public String getDescOfCrime() {
		return descOfCrime;
	}


	public void setDescOfCrime(String descOfCrime) {
		this.descOfCrime = descOfCrime;
	}


	public String getVictims() {
		return Victims;
	}


	public void setVictims(String victims) {
		Victims = victims;
	}


	public String getDetailDescOfCrime() {
		return detailDescOfCrime;
	}


	public void setDetailDescOfCrime(String detailDescOfCrime) {
		this.detailDescOfCrime = detailDescOfCrime;
	}


	public String getNamesOfSuspected() {
		return namesOfSuspected;
	}


	public void setNamesOfSuspected(String namesOfSuspected) {
		this.namesOfSuspected = namesOfSuspected;
	}


	@Override
	public String toString() {
		return "Crime [dateOfCrime=" + dateOfCrime + ", placeOfCrime=" + placeOfCrime + ", descOfCrime=" + descOfCrime
				+ ", Victims=" + Victims + ", detailDescOfCrime=" + detailDescOfCrime + ", namesOfSuspected="
				+ namesOfSuspected + "]";
	}

	

}
