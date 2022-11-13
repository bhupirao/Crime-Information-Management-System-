package crimeManagementSystemApp.UseCases;

import java.util.List;


import crimeManagementSystemApp.Bean.Criminal;
import crimeManagementSystemApp.Dao.CriminalDao;
import crimeManagementSystemApp.Dao.CriminalDaoImpl;
import crimeManagementSystemApp.Exceptions.CriminalException;

public class GetAllCriminal {

	public static void main(String[] args) {
		
		CriminalDao dao=new CriminalDaoImpl();
		try {
			List<Criminal> li=dao.getAllCriminal();
			li.forEach(c ->System.out.println(c));
		} catch (CriminalException e) {
			System.out.println(e.getMessage());
		}

	}

}
