package crimeManagementSystemApp.Bean;

import java.util.Date;

public class Crime {
	
	private Date dateOfCrime;
	private String placeOfCrime;
	private String descOfCrime;
	private String victims;
	private String detailDescOfCrime;
	private String namesOfSuspected;
	private String policeStations;
	private String status;
	
	
	
	public Crime() {
	
	}


	public Crime(Date dateOfCrime, String placeOfCrime, String descOfCrime, String victims, String detailDescOfCrime,
			String namesOfSuspected,String policeStations, String status) {
		super();
		this.dateOfCrime = dateOfCrime;
		this.placeOfCrime = placeOfCrime;
		this.descOfCrime = descOfCrime;
		this.victims = victims;
		this.detailDescOfCrime = detailDescOfCrime;
		this.namesOfSuspected = namesOfSuspected;
		this.status=status;
		this.policeStations=policeStations;
		
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
		return victims;
	}


	public void setVictims(String victims) {
		this.victims = victims;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
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


	public String getPoliceStations() {
		return policeStations;
	}


	public void setPoliceStations(String policeStations) {
		this.policeStations = policeStations;
	}


	@Override
	public String toString() {
		return "Crime [dateOfCrime=" + dateOfCrime + ", placeOfCrime=" + placeOfCrime + ", descOfCrime=" + descOfCrime
				+ ", victims=" + victims + ", detailDescOfCrime=" + detailDescOfCrime + ", namesOfSuspected="
				+ namesOfSuspected + ", policeStations=" + policeStations + ", status=" + status + "]";
	}


	


	

	

}
