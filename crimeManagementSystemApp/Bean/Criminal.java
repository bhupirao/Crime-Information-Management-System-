package crimeManagementSystemApp.Bean;

public class Criminal {
	
	private String name;
	private int age;
	private String gender;
	private String address;
	private String identification;
	private String areaOfCrime;
	private String attachedCrime;
	
	
	public Criminal() {
	
	}


	public Criminal(String name, int age, String gender, String address, String identification, String areaOfCrime,
			String attachedCrime) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.identification = identification;
		this.areaOfCrime = areaOfCrime;
		this.attachedCrime = attachedCrime;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getIdentification() {
		return identification;
	}


	public void setIdentification(String identification) {
		this.identification = identification;
	}


	public String getAreaOfCrime() {
		return areaOfCrime;
	}


	public void setAreaOfCrime(String areaOfCrime) {
		this.areaOfCrime = areaOfCrime;
	}


	public String getAttachedCrime() {
		return attachedCrime;
	}


	public void setAttachedCrime(String attachedCrime) {
		this.attachedCrime = attachedCrime;
	}


	@Override
	public String toString() {
		return "Criminal [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", identification=" + identification + ", areaOfCrime=" + areaOfCrime + ", attachedCrime="
				+ attachedCrime + "]";
	}

	
}
