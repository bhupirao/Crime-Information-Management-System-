package crimeManagementSystemApp.Dao;

import java.util.List;

import crimeManagementSystemApp.Bean.Crime;
import crimeManagementSystemApp.Exceptions.CrimeException;

public interface CrimeDao {
	
	public String insertCrime(Crime crime)throws CrimeException;
	
	public List<Crime> getAllCrime()throws CrimeException;
	
	public String updateStatus(String status)throws CrimeException;
	
	public List<Crime> areaWiseCrime(String policeStation)throws CrimeException;
	
	public int countSolveCase()throws CrimeException;
	
	public int countUnsolveCase()throws CrimeException;
	
	public List<Crime> countCurrentCrime()throws CrimeException;

}
