package crimeManagementSystemApp.Bean;

public class Report {
	
	
	private String criminalName;
	private String identification;
	private String descCrime;
	private String nameOfSuspect;
	private String status;
	
	public Report() {
		
	}

	public Report(String criminalName, String identification, String descCrime, String nameOfSuspect, String status) {
		super();
		this.criminalName = criminalName;
		this.identification = identification;
		this.descCrime = descCrime;
		this.nameOfSuspect = nameOfSuspect;
		this.status = status;
	}

	public String getCriminalName() {
		return criminalName;
	}

	public void setCriminalName(String criminalName) {
		this.criminalName = criminalName;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getDescCrime() {
		return descCrime;
	}

	public void setDescCrime(String descCrime) {
		this.descCrime = descCrime;
	}

	public String getNameOfSuspect() {
		return nameOfSuspect;
	}

	public void setNameOfSuspect(String nameOfSuspect) {
		this.nameOfSuspect = nameOfSuspect;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Report [criminalName=" + criminalName + ", identification=" + identification + ", descCrime="
				+ descCrime + ", nameOfSuspect=" + nameOfSuspect + ", status=" + status + "]";
	}
	
	

}
