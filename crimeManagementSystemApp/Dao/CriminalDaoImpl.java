package crimeManagementSystemApp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import crimeManagementSystemApp.Bean.Crime;
import crimeManagementSystemApp.Bean.Criminal;
import crimeManagementSystemApp.Exceptions.CrimeException;
import crimeManagementSystemApp.Exceptions.CriminalException;
import crimeManagementSystemApp.Utility.DBUtil;

public class CriminalDaoImpl implements CriminalDao{

	@Override
	public String insertCriminal(Criminal criminal) throws CriminalException {
String message="Not inserted...!";
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("insert into Criminal values(?,?,?,?,?,?,?,?)");
			
			ps.setString(1,criminal.getName());
			ps.setInt(2, criminal.getAge());
			ps.setString(3, criminal.getGender());
			ps.setString(4, criminal.getAddress());
			ps.setString(5, criminal.getIdentification());
			ps.setString(6, criminal.getAreaOfCrime());
			ps.setString(7, criminal.getAttachedCrime());
			ps.setString(8, criminal.getAreaWiseCriminal());
			
		int x=ps.executeUpdate();
		
		if(x>0) {
			message="Criminal added  succesfully..!";
		}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CriminalException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public List<Criminal> getAllCriminal() throws CriminalException {
     
		List<Criminal> li=new ArrayList<>();
		
		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("select * from Criminal");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String n=rs.getString("name");
				int p=rs.getInt("age");
				String g=rs.getString("gender");
				String v=rs.getString("address");
				String i=rs.getString("identification");
				String area=rs.getString("areaOfCrime");
				String attach=rs.getString("attachedCrime");
				String areaWise=rs.getString("areaWiseCrime");
				
				Criminal criminal=new Criminal(n,p,g,v,i,area,attach,areaWise);
				
				li.add(criminal);
				
				
				
			}
		} catch (SQLException e) {
			throw new CriminalException(e.getMessage());
		}
		
		if(li.size()==0) {
			throw new CriminalException("No Record Found");
		}
		
		return li;
	}

	@Override
	public List<Criminal> searchAreaWise(String area) throws CriminalException {
		List<Criminal>li=new ArrayList<>();
		try(Connection conn=DBUtil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("select * from Criminal where areaWiseCrime=?");
			ps.setString(1, area);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				String n=rs.getString("name");
				int p=rs.getInt("age");
				String g=rs.getString("gender");
				String v=rs.getString("address");
				String i=rs.getString("identification");
				String area1=rs.getString("areaOfCrime");
				String attach=rs.getString("attachedCrime");
				String areaWise=rs.getString("areaWiseCrime");
				
				Criminal criminal=new Criminal(n,p,g,v,i,area1,attach,areaWise);
				
				li.add(criminal);
				
			
			}else {
				throw new CriminalException("Not Record found "+area);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CriminalException(e.getMessage());
		}
		
		return li;

}
}
