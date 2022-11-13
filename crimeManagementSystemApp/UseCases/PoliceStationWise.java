package crimeManagementSystemApp.UseCases;

import java.util.List;
import java.util.Scanner;

import crimeManagementSystemApp.Bean.Crime;
import crimeManagementSystemApp.Dao.CrimeDao;
import crimeManagementSystemApp.Dao.CrimeDaoImpl;
import crimeManagementSystemApp.Exceptions.CrimeException;

public class PoliceStationWise {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter PoliceStation");
		String p=sc.next();
		
		CrimeDao dao=new CrimeDaoImpl();
		
		try {
			List<Crime> li=dao.areaWiseCrime(p);
			System.out.println(li);
		} catch (CrimeException e) {
			
			e.printStackTrace();
		}
	}

}
