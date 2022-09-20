package bank;
import java.util.*;
import java.sql.*;
import java.util.InputMismatchException;

class Connectionstart{
	static Scanner sc=new Scanner(System.in);
	static Connection con=null;
	public void connectionstart(){

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Drivers not dound");
		}
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			System.out.println("Connection established");
			
		}
		catch(SQLException e) {
			System.out.println("connection failed");
		}
	}
}
public class Menu extends Connectionstart{
	static int accountno;
	static Statement st;
	public static void main(String[] args)throws ClassNotFoundException, SQLException,InputMismatchException 
	{
		
		Connectionstart cs=new Connectionstart();
		cs.connectionstart();
		System.out.println("Welcome to Bucky's Bank");
		System.out.print("Kindly enter account number to continue: ");
		 
		accountno=sc.nextInt();
		Statement st=con.createStatement();
		String sqlquery="Select accno from account where accno=";
		ResultSet rs= st.executeQuery(sqlquery+accountno);
		if(rs.next()) {
			if(rs.getInt(1)==accountno) {
		System.out.println("Select option to continue: ");
		System.out.println("1: Domestic");
		System.out.println("2: International");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Domestic Services: ");
			System.out.println("1: Withdrawl");
			System.out.println("2: Deposit");
			System.out.println("3: Money Transfer");
			System.out.println("4: Check Balance");
			System.out.println("5: PIN Change");
			System.out.println("6: Transactions");
			int a=sc.nextInt();
			switch(a) {
			case 1:
				Withdraw w=new Withdraw();
				w.withdraw();
				break;
			case 2:
				Deposit d=new Deposit();
				d.deposit();
				break;
			case 3:
				Transfer t=new Transfer();
				t.transfer();
			case 4:
				Balance b=new Balance();
				b.balance();
				break;
			case 5:
				Pin p=new Pin();
				p.pin();
				break;
			case 6:
				Transactions tr=new Transactions();
				tr.transactions();
				break;
			}
			break;
		
		case 2:
			System.out.println("International Services");
			System.out.println("1: Withdrawl");
			System.out.println("2: Deposit");
			int b=sc.nextInt();
			switch(b) {
			case 1: 
				WithdrawInternational wi=new WithdrawInternational();
				wi.Withdrawint();
				break;
			case 2:
				DepositInternational di=new DepositInternational();
				di.Depositint();
				break;
			default: 
				System.out.println("Error: Invalid Input...!!!");
				break;
				}
			break;
				
			
		default: 
			System.out.println("Error: Invalid Input...!!!");
			break;
		
		}
		
		//System.out.println("Select options for services: ");
		//System.out.println();
			}

}else {
	System.out.println("Error: Account not found");
}
		}
}	

