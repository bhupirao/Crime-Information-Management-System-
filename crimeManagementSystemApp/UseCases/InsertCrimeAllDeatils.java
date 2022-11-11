package crimeManagementSystemApp.UseCases;


import java.util.Scanner;

import crimeManagementSystemApp.Bean.Crime;
import crimeManagementSystemApp.Dao.CrimeDao;
import crimeManagementSystemApp.Dao.CrimeDaoImpl;
import crimeManagementSystemApp.Exceptions.CrimeException;

public class InsertCrimeAllDeatils {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Date of Crime");
		String date=sc.next();

		System.out.println("Enter the place of Crime");
		String place=sc.next();
		
		System.out.println("Enter the Type of Crime");
		String tcrime =sc.next();
		
		System.out.println("Enter the Victim");
		String victim=sc.next();
		sc.nextLine();
		
		System.out.println("Enter the Details of Crime ");
		String descCrime=sc.nextLine();
		
		System.out.println("Enter the Name of Suspected");
		String suspect =sc.next();
		sc.nextLine();
		System.out.println("Enter the Name of Polic Station");
		String policeStation=sc.nextLine();
		System.out.println("Enter the Status of Crime");
		String status =sc.nextLine();
		
		Crime crime= new Crime(date,place,tcrime,victim,descCrime,suspect,policeStation,status);
		
		CrimeDao dao=new CrimeDaoImpl();
		
		try {
			String res=dao.insertCrime(crime);
			System.out.println(res);
		} catch (CrimeException e) {
			e.printStackTrace();
		}
	
		

	}

}
