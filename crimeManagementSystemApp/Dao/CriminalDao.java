package crimeManagementSystemApp.Dao;

import java.util.List;
import crimeManagementSystemApp.Bean.Criminal;
import crimeManagementSystemApp.Exceptions.CriminalException;

public interface CriminalDao {
	
	public String insertCriminal(Criminal criminal)throws CriminalException;
	
	public List<Criminal>  getAllCriminal()throws CriminalException;
 	
	public List<Criminal> searchAreaWise(String area)throws CriminalException;

}
