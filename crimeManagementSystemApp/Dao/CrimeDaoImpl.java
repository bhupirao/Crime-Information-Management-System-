package crimeManagementSystemApp.Dao;

import java.util.List;

import crimeManagementSystemApp.Bean.Crime;
import crimeManagementSystemApp.Exceptions.CrimeException;

public class CrimeDaoImpl implements CrimeDao{

	@Override
	public String insertCrime(Crime crime) throws CrimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Crime> getAllCrime() throws CrimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStatus(String status) throws CrimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Crime> areaWiseCrime(String policeStation) throws CrimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countSolveCase() throws CrimeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countUnsolveCase() throws CrimeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Crime> countCurrentCrime() throws CrimeException {
		// TODO Auto-generated method stub
		return null;
	}

}
