package crimeManagementSystemApp.UseCases;

import crimeManagementSystemApp.Dao.CrimeDao;
import crimeManagementSystemApp.Dao.CrimeDaoImpl;
import crimeManagementSystemApp.Exceptions.CrimeException;

public class CountCurrentMonth {

	public static void main(String[] args) {

		CrimeDao dao=new CrimeDaoImpl();
		
		try {
			int res=dao.countCurrentCrime();
			System.out.println("Number of Current Case"+" ->"+" "+res);
		} catch (CrimeException e) {
			
			e.getMessage();
		}

	}

}
