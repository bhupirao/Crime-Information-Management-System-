package crimeManagementSystemApp.UseCases;

import crimeManagementSystemApp.Dao.CrimeDao;
import crimeManagementSystemApp.Dao.CrimeDaoImpl;
import crimeManagementSystemApp.Exceptions.CrimeException;

public class NotSolvedCase {

	public static void main(String[] args) {
		

		CrimeDao dao=new CrimeDaoImpl();
		
		try {
			int res=dao.countUnsolveCase();
			System.out.println("Number of Not Solved Case"+" ->"+" "+res);
		} catch (CrimeException e) {
			
			e.getMessage();
		}

	}

}
