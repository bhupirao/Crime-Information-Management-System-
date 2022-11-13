package crimeManagementSystemApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import crimeManagementSystemApp.Bean.Crime;
import crimeManagementSystemApp.Exceptions.CrimeException;
import crimeManagementSystemApp.Utility.DBUtil;

public class CrimeDaoImpl implements CrimeDao{

	@Override
	public String insertCrime(Crime crime) throws CrimeException {
	
 
		String message="Not inserted...!";
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("insert into Crime values(?,?,?,?,?,?,?,?)");
			
			ps.setString(1,crime.getDateOfCrime());
			ps.setString(2, crime.getPlaceOfCrime());
			ps.setString(3, crime.getDescOfCrime());
			ps.setString(4, crime.getVictims());
			ps.setString(5, crime.getDetailDescOfCrime());
			ps.setString(6, crime.getNamesOfSuspected());
			ps.setString(7, crime.getPoliceStations());
			ps.setString(8, crime.getStatus());
			
		int x=ps.executeUpdate();
		
		if(x>0) {
			message="Insert Crime Report Succesfully..!";
		}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public List<Crime> getAllCrime() throws CrimeException {
		
		List<Crime> li=new ArrayList<>();
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("select * from Crime");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String d=rs.getString("dateOfCrime");
				String p=rs.getString("placeOfCrime");
				String desc=rs.getString("descOfCrime");
				String v=rs.getString("victims");
				String detail=rs.getString("detailDescOfCrime");
				String s=rs.getString("nameOfSuspected");
				String police=rs.getString("policeStation");
				String status=rs.getString("status");
				
				Crime cr=new Crime(d,p,desc,v,detail,s,police,status);
				
				li.add(cr);
				
				
				
			}
		} catch (SQLException e) {
			throw new CrimeException(e.getMessage());
		}
		
		if(li.size()==0) {
			throw new CrimeException("No Record Found");
		}
		
		return li;
	}

	@Override
	public String updateStatus(String victims) throws CrimeException {
		String update="Status Updated Successfully..!";
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps =conn.prepareStatement("update Crime set status='Solved' where victims=?");
			
			ps.setString(1,victims );
			
			int out=ps.executeUpdate();
			if(out>0) {
				update="Updated Sucessfully..!";
			}
			
		} catch (SQLException e) {
			throw new CrimeException(e.getMessage());
		}
		return update;
	}

	@Override
	public List<Crime> areaWiseCrime(String policeStation) throws CrimeException {
		
		List<Crime>li=new ArrayList<>();
		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("select * from Crime where policeStation=?");
			ps.setString(1, policeStation);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				String d=rs.getString("dateOfCrime");
				String p=rs.getString("placeOfCrime");
				String desc=rs.getString("descOfCrime");
				String v=rs.getString("victims");
				String detail=rs.getString("detailDescOfCrime");
				String s=rs.getString("nameOfSuspected");
				String police=rs.getString("policeStation");
				String status=rs.getString("status");
				
				Crime crime=new Crime(d,p,desc,v,detail,s,police,status);
				li.add(crime);
			
			}else {
				throw new CrimeException("Not Record found "+policeStation);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		return li;
	}

	@Override
	public int countSolveCase() throws CrimeException {
		
		int a=0;

		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("select count(*) from Crime where status='Solved' ");
			
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				a=rs.getInt(1);
			}else {
				throw new CrimeException("Not Solved case found ");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		return a;
	}

	@Override
	public int countUnsolveCase() throws CrimeException {
		int a=0;

		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("select count(*) from Crime where status='Not Solved' ");
			
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				a=rs.getInt(1);
			}else {
				throw new CrimeException("Not Solved case found ");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		return a;
	}

	@Override
	public int countCurrentCrime() throws CrimeException {
		int a=0;

		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("select count(*) from Crime where dateOfCrime between '2022-02-01' and '2022-02-27' ");
			
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				a=rs.getInt(1);
			}else {
				throw new CrimeException("Not Solved case found ");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		return a;
	}

}
