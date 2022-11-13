package crimeManagementSystemApp.UseCases;

import java.util.List;
import java.util.Scanner;

import crimeManagementSystemApp.Bean.Crime;
import crimeManagementSystemApp.Bean.Criminal;
import crimeManagementSystemApp.Dao.CrimeDao;
import crimeManagementSystemApp.Dao.CrimeDaoImpl;
import crimeManagementSystemApp.Dao.CriminalDao;
import crimeManagementSystemApp.Dao.CriminalDaoImpl;
import crimeManagementSystemApp.Exceptions.CrimeException;
import crimeManagementSystemApp.Exceptions.CriminalException;

public class MainUserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		

		int i=0;
		int j=0;
		
		System.out.println("Welcome to Crime Management System...!");
		System.out.println("1.Add Crime Report"+"\n"+"2.Add Criminal Record"+"\n"+"3.Exit");
		int ch=sc.nextInt();
			switch(ch) {
			case 1:
			
			do {
				System.out.println("1.Add New Case"+"\n"+"2.Get All Crime Case Report"+"\n"+"3.Update Case Solved or Not."+"\n"+"4.Get Number of Solved Case"
						+"\n"+"5.Get Number of Not Solved Case"+"\n"+"6.Get Current Month Case"+"\n"+"7.Get Area wise case"+"\n"+"8.Exit");
							
						int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Date of Crime");
				String date=sc.next();

				System.out.println("Enter the place of Crime");
				String place=sc.next();
				
				System.out.println("Enter the Type of Crime");
				String tcrime =sc.next();
				
				System.out.println("Enter the Victim");
				String victim=sc.next();
				sc.nextLine();
				
				System.out.println("Enter the Details of Crime ");
				String descCrime=sc.nextLine();
				
				System.out.println("Enter the Name of Suspected");
				String suspect =sc.next();
				sc.nextLine();
				System.out.println("Enter the Name of Polic Station");
				String policeStation=sc.nextLine();
				System.out.println("Enter the Status of Crime");
				String status =sc.nextLine();
				
				Crime crime= new Crime(date,place,tcrime,victim,descCrime,suspect,policeStation,status);
				
				CrimeDao dao1=new CrimeDaoImpl();
				
				try {
					String res=dao1.insertCrime(crime);
					System.out.println(res);
					
				} catch (CrimeException e) {
					e.printStackTrace();
				}
				System.out.println("========================");
				break;
				
			case 2:
				CrimeDao dao2=new CrimeDaoImpl();
				try {
					List<Crime> li=dao2.getAllCrime();
					li.forEach(c ->System.out.println(c));
				} catch (CrimeException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("========================");
				break;
			case 3:

				System.out.println("Victims Name");
				String v=sc.next();
				
				CrimeDao dao3=new CrimeDaoImpl();
				
				try {
					String res=dao3.updateStatus(v);
					System.out.println(res);
				} catch (CrimeException e) {
					
					e.printStackTrace();
				}
				System.out.println("========================");
				break;
				
			case 4:
				CrimeDao dao4=new CrimeDaoImpl();
				
				try {
					int res=dao4.countSolveCase();
					System.out.println("Number of Solved Case"+" ->"+" "+res);
				} catch (CrimeException e) {
					
					e.printStackTrace();
				}
				System.out.println("========================");
				break;

			case 5:

				CrimeDao dao5=new CrimeDaoImpl();
				
				try {
					int res=dao5.countUnsolveCase();
					System.out.println("Number of Not Solved Case"+" ->"+" "+res);
				} catch (CrimeException e) {
					
					e.getMessage();
				}
				System.out.println("========================");
				break;
			case 6:
				CrimeDao dao6=new CrimeDaoImpl();
				
				try {
					int res=dao6.countCurrentCrime();
					System.out.println("Number of Current Case"+" ->"+" "+res);
				} catch (CrimeException e) {
					
					e.getMessage();
				}
				System.out.println("========================");
				break;
			case 7:

				System.out.println("Enter PoliceStation");
				String p=sc.next();
				
				CrimeDao dao7=new CrimeDaoImpl();
				
				try {
					List<Crime> li=dao7.areaWiseCrime(p);
					System.out.println(li);
				} catch (CrimeException e) {
					
					e.printStackTrace();
				}
				System.out.println("========================");
				break;
			
			case 8:
				System.out.println("1.Add Crime Report"+"\n"+"2.Add Criminal Record"+"\n"+"3.Exit");
				int c=sc.nextInt();
				System.out.println("========================");
				break;
			default:
				System.out.println("ThankYou...!");
			
			
			i++;
			}
			}
			
			while(i<2);
			
		break;
			case 2:	
				do {
					System.out.println("1.Add New Criminal"+"\n"+"2.Get All Criminal Detail"+"\n"+"3.Get Criminal Area Wise."+"\n"+"4.Exit");
							int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter Criminal Name");
					String name=sc.next();

					System.out.println("Enter Criminal Age:");
					int age=sc.nextInt();
					
					System.out.println("Enter Criminal Gender");
					String gender =sc.next();
					sc.nextLine();
					System.out.println("Enter Criminal Address");
					String address=sc.nextLine();
					
					System.out.println("Enter Criminal Identification ");
					String identi=sc.nextLine();
					
					System.out.println("Enter Area of Crime ");
					String area =sc.next();
					sc.nextLine();
					System.out.println("Enter Criminal attached Crime");
					String attached=sc.nextLine();
					System.out.println("Enter area of Crime");
					String acrime =sc.nextLine();

					Criminal criminal=new Criminal(name,age,gender,address,identi,area,attached,acrime);
					
					CriminalDao dao1=new CriminalDaoImpl();
					
					try {
						String res=dao1.insertCriminal(criminal);
						System.out.println(res);
					} catch (CriminalException e) {
						
						e.printStackTrace();
					}
					System.out.println("========================");
					break;
					
				case 2:
					CriminalDao dao2=new CriminalDaoImpl();
					try {
						List<Criminal> li=dao2.getAllCriminal();
						li.forEach(c ->System.out.println(c));
					} catch (CriminalException e) {
						System.out.println(e.getMessage());
					}
					System.out.println("========================");
					break;
				case 3:

					System.out.println("Enter Area Wise Criminal ");
					String p=sc.next();
					
					CriminalDao dao3=new CriminalDaoImpl();
					
					try {
						List<Criminal> li=dao3.searchAreaWise(p);
						System.out.println(li);
					} catch (CriminalException e) {
						
						e.printStackTrace();
					}
					System.out.println("========================");
					break;
				case 4:
					System.out.println("1.Add Crime Report"+"\n"+"2.Add Criminal Record"+"\n"+"3.Exit");
					int  c=sc.nextInt();
					System.out.println("========================");
					break;
				default:
					System.out.println("ThankYou...!");	
					
				}
				j++;
				}
				
				while(j<2);
				break;
	
			case 3:
				System.out.println("ThankYou for Visiting");
				System.out.println("========================");
				break;
				default :
					break;
	}
			
		
		
		
	}

}
