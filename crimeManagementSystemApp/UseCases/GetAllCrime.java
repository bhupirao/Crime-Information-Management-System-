package crimeManagementSystemApp.UseCases;

import java.util.List;

import crimeManagementSystemApp.Bean.Crime;
import crimeManagementSystemApp.Dao.CrimeDao;
import crimeManagementSystemApp.Dao.CrimeDaoImpl;
import crimeManagementSystemApp.Exceptions.CrimeException;

public class GetAllCrime {

	public static void main(String[] args) {
		

		CrimeDao dao=new CrimeDaoImpl();
		try {
			List<Crime> li=dao.getAllCrime();
			li.forEach(c ->System.out.println(c));
		} catch (CrimeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
