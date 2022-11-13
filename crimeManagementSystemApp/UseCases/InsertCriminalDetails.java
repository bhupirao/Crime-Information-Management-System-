package crimeManagementSystemApp.UseCases;

import java.util.Scanner;

import crimeManagementSystemApp.Bean.Criminal;
import crimeManagementSystemApp.Dao.CriminalDao;
import crimeManagementSystemApp.Dao.CriminalDaoImpl;
import crimeManagementSystemApp.Exceptions.CriminalException;

public class InsertCriminalDetails {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Criminal Name");
		String name=sc.next();

		System.out.println("Enter Criminal Age:");
		int age=sc.nextInt();
		
		System.out.println("Enter Criminal Gender");
		String gender =sc.next();
		sc.nextLine();
		System.out.println("Enter Criminal Address");
		String address=sc.nextLine();
		
		System.out.println("Enter Criminal Identification ");
		String identi=sc.nextLine();
		
		System.out.println("Enter Area of Crime ");
		String area =sc.next();
		sc.nextLine();
		System.out.println("Enter Criminal attached Crime");
		String attached=sc.nextLine();
		System.out.println("Enter area of Crime");
		String acrime =sc.nextLine();

		Criminal criminal=new Criminal(name,age,gender,address,identi,area,attached,acrime);
		
		CriminalDao dao=new CriminalDaoImpl();
		
		try {
			String res=dao.insertCriminal(criminal);
			System.out.println(res);
		} catch (CriminalException e) {
			
			e.printStackTrace();
		}
	}

}
