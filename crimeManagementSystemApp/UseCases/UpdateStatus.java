package crimeManagementSystemApp.UseCases;

import java.util.Scanner;

import crimeManagementSystemApp.Dao.CrimeDao;
import crimeManagementSystemApp.Dao.CrimeDaoImpl;
import crimeManagementSystemApp.Exceptions.CrimeException;

public class UpdateStatus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Victims Name");
		String v=sc.next();
		
		CrimeDao dao=new CrimeDaoImpl();
		
		try {
			String res=dao.updateStatus(v);
			System.out.println(res);
		} catch (CrimeException e) {
			
			e.printStackTrace();
		}

	}

}
