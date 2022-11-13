package crimeManagementSystemApp.UseCases;

import crimeManagementSystemApp.Dao.CrimeDao;
import crimeManagementSystemApp.Dao.CrimeDaoImpl;
import crimeManagementSystemApp.Exceptions.CrimeException;

public class CountSolvedCase {

	public static void main(String[] args) {
		
		CrimeDao dao=new CrimeDaoImpl();
		
		try {
			int res=dao.countSolveCase();
			System.out.println("Number of Solved Case"+" ->"+" "+res);
		} catch (CrimeException e) {
			
			e.printStackTrace();
		}

	}

}
