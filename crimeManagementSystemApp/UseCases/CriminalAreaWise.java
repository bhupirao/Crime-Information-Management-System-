package crimeManagementSystemApp.UseCases;

import java.util.List;
import java.util.Scanner;


import crimeManagementSystemApp.Bean.Criminal;
import crimeManagementSystemApp.Dao.CriminalDao;
import crimeManagementSystemApp.Dao.CriminalDaoImpl;
import crimeManagementSystemApp.Exceptions.CriminalException;

public class CriminalAreaWise {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Area Wise Criminal ");
		String p=sc.next();
		
		CriminalDao dao=new CriminalDaoImpl();
		
		try {
			List<Criminal> li=dao.searchAreaWise(p);
			System.out.println(li);
		} catch (CriminalException e) {
			
			e.printStackTrace();
		}

	}

}
