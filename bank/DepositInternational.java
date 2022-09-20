package bank;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DepositInternational extends Menu{
	double balancefinal;
	double balance;
	public void Depositint() throws SQLException {
		System.out.println("International Deposit: ");
		System.out.println("Select Deposit Currency: ");
		System.out.println("1: USD");
		System.out.println("2: EUR");
		System.out.println("3: GBP");
		System.out.println("4: JPY");
		System.out.println("5: CAD");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("USD to INR");
			System.out.print("Enter amount in USD: ");
			double usd=sc.nextInt();
			System.out.println("Entered amount in INR is ₹"+(usd*80));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE=sc.next();
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select pin,balance from account where accno="+accountno);
			rs.next();
			balance=rs.getFloat(2);
			String pin=rs.getString(1);
			balancefinal=rs.getFloat(2)+(usd*80);
				if(pin.equals(pinE)) {
					st.executeUpdate("insert into transactions values("+accountno+",'Deposit',"+(usd*80)+","+(rs.getInt(2)+(usd*80))+")");
					st.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pinE.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else {
						System.out.println("Transaction Failed: Incorrect PIN..!!");
					}
					break;
		case 2:
			System.out.println("EUR to INR");
			System.out.print("Enter amount in EUR: ");
			double eur=sc.nextInt();
			System.out.println("Entered amount in INR is ₹"+(eur*80));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE1=sc.next();
			Statement st1=con.createStatement();
			ResultSet rs1= st1.executeQuery("select pin,balance from account where accno="+accountno);
			rs1.next();
			balance=rs1.getFloat(2);
			String pin1=rs1.getString(1);
			balancefinal=rs1.getFloat(2)+(eur*80);
				if(pin1.equals(pinE1)) {
					st1.executeUpdate("insert into transactions values("+accountno+",'Deposit',"+(eur*80)+","+(rs1.getInt(2)+(eur*80))+")");
					st1.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pinE1.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else {
						System.out.println("Transaction Failed: Incorrect PIN..!!");
					}
					break;
		case 3:
			System.out.println("GBP to INR");
			System.out.print("Enter amount in GBP: ");
			double gbp=sc.nextInt();
			System.out.println("Entered amount in INR is ₹"+(gbp*91));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE2=sc.next();
			Statement st2=con.createStatement();
			ResultSet rs2= st2.executeQuery("select pin,balance from account where accno="+accountno);
			rs2.next();
			balance=rs2.getFloat(2);
			String pin2=rs2.getString(1);
			balancefinal=rs2.getFloat(2)+(gbp*91);
				if(pin2.equals(pinE2)) {
					st2.executeUpdate("insert into transactions values("+accountno+",'Deposit',"+(gbp*91)+","+(rs2.getInt(2)+(gbp*91))+")");
					st2.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pinE2.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else {
						System.out.println("Transaction Failed: Incorrect PIN..!!");
					}
					break;
		case 4:
			System.out.println("JPY to INR");
			System.out.print("Enter amount in JPY: ");
			double jpy=sc.nextInt();
			System.out.println("Entered amount in INR is ₹"+(jpy*0.5));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE3=sc.next();
			Statement st3=con.createStatement();
			ResultSet rs3= st3.executeQuery("select pin,balance from account where accno="+accountno);
			rs3.next();
			balance=rs3.getFloat(2);
			String pin3=rs3.getString(1);
			balancefinal=rs3.getFloat(2)+(jpy*0.5);
				if(pin3.equals(pinE3)) {
					st3.executeUpdate("insert into transactions values("+accountno+",'Deposit',"+(jpy*0.5)+","+(rs3.getInt(2)+(jpy*0.5))+")");
					st3.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pinE3.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else {
						System.out.println("Transaction Failed: Incorrect PIN..!!");
					}
					break;
		case 5:
			System.out.println("CAD to INR");
			System.out.print("Enter amount in CAD: ");
			double cad=sc.nextInt();
			System.out.println("Entered amount in INR is ₹"+(cad*60));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE4=sc.next();
			Statement st4=con.createStatement();
			ResultSet rs4= st4.executeQuery("select pin,balance from account where accno="+accountno);
			rs4.next();
			balance=rs4.getFloat(2);
			String pin4=rs4.getString(1);
			balancefinal=rs4.getFloat(2)+(cad*60);
				if(pin4.equals(pinE4)) {
					st4.executeUpdate("insert into transactions values("+accountno+",'Deposit',"+(cad*60)+","+(rs4.getInt(2)+(cad*60))+")");
					st4.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pinE4.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else {
						System.out.println("Transaction Failed: Incorrect PIN..!!");
					}
					break;
		
		}
	}
}
