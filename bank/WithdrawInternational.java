package bank;
import java.sql.*;


public class WithdrawInternational extends Menu {
	double balancefinal;
	double balance;
	public void Withdrawint() throws SQLException {
		System.out.println("International Withdrawl: ");
		System.out.println("Select Withdrawl Currency: ");
		System.out.println("1: USD");
		System.out.println("2: EUR");
		System.out.println("3: GBP");
		System.out.println("4: JPY");
		System.out.println("5: CAD");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("INR to USD");
			System.out.print("Enter amount in INR: ");
			double inr=sc.nextInt();
			System.out.println("Entered amount in USD is $"+(inr/80));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE=sc.next();
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select pin,balance from account where accno="+accountno);
			rs.next();
			balance=rs.getFloat(2);
			String pin=rs.getString(1);
			balancefinal=rs.getFloat(2)-inr;
				if(pinE.equals(pin) && balance>=inr) {
					st.executeUpdate("insert into transactions values("+accountno+",'Withdrawl',"+inr+","+(rs.getInt(2)-inr)+")");
					st.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pinE.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else if(pinE.equals(pin)){
						System.out.println("Transaction Failed: Insufficent Balance..!!");
					}
					else {
						System.out.println("Transaction Failed: Incorrect Pin..!!");
					}
					break;
		case 2:
			System.out.println("INR to EUR");
			System.out.print("Enter amount in INR: ");
			double inr1=sc.nextInt();
			System.out.println("Entered amount in EUR is €"+(inr1/80));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE1=sc.next();
			Statement st1=con.createStatement();
			ResultSet rs1= st1.executeQuery("select pin,balance from account where accno="+accountno);
			rs1.next();
			balance=rs1.getFloat(2);
			String pin1=rs1.getString(1);
			balancefinal=rs1.getFloat(2)-inr1;
				if(pin1.equals(pinE1) && balance>=inr1) {
					st1.executeUpdate("insert into transactions values("+accountno+",'Withdrawl',"+inr1+","+(rs1.getInt(2)-inr1)+")");
					st1.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pin1.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else if(pin1.equals(pinE1)){
						System.out.println("Transaction Failed: Insufficent Balance..!!");
					}
					else {
						System.out.println("Transaction Failed: Incorrect Pin..!!");
					}
					break;
		case 3:
			System.out.println("INR to GBP");
			System.out.print("Enter amount in INR: ");
			double inr2=sc.nextInt();
			System.out.println("Entered amount in GBP is £"+(inr2/91));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE2=sc.next();
			Statement st2=con.createStatement();
			ResultSet rs2= st2.executeQuery("select pin,balance from account where accno="+accountno);
			rs2.next();
			balance=rs2.getFloat(2);
			String pin2=rs2.getString(1);
			balancefinal=rs2.getFloat(2)-inr2;
				if(pin2.equals(pinE2) && balance>=inr2) {
					st2.executeUpdate("insert into transactions values("+accountno+",'Withdrawl',"+inr2+","+(rs2.getInt(2)-inr2)+")");
					st2.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pin2.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else if(pin2.equals(pinE2)){
						System.out.println("Transaction Failed: Insufficent Balance..!!");
					}
					else {
						System.out.println("Transaction Failed: Incorrect Pin..!!");
					}
					break;
		case 4:
			System.out.println("INR to JPY");
			System.out.print("Enter amount in INR: ");
			double inr3=sc.nextInt();
			System.out.println("Entered amount in JPY is ¥"+(inr3/0.5));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE3=sc.next();
			Statement st3=con.createStatement();
			ResultSet rs3= st3.executeQuery("select pin,balance from account where accno="+accountno);
			rs3.next();
			balance=rs3.getFloat(2);
			String pin3=rs3.getString(1);
			balancefinal=rs3.getFloat(2)-inr3;
				if(pin3.equals(pinE3) && balance>=inr3) {
					st3.executeUpdate("insert into transactions values("+accountno+",'Withdrawl',"+inr3+","+(rs3.getInt(2)-inr3)+")");
					st3.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pin3.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else if(pin3.equals(pinE3)){
						System.out.println("Transaction Failed: Insufficent Balance..!!");
					}
					else {
						System.out.println("Transaction Failed: Incorrect Pin..!!");
					}
					break;
		case 5:
			System.out.println("INR to CAD");
			System.out.print("Enter amount in INR: ");
			double inr4=sc.nextInt();
			System.out.println("Entered amount in CAD is ca$"+(inr4/60));
			System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
			String pinE4=sc.next();
			Statement st4=con.createStatement();
			ResultSet rs4= st4.executeQuery("select pin,balance from account where accno="+accountno);
			rs4.next();
			balance=rs4.getFloat(2);
			String pin4=rs4.getString(1);
			balancefinal=rs4.getFloat(2)-inr4;
				if(pin4.equals(pinE4) && balance>=inr4) {
					st4.executeUpdate("insert into transactions values("+accountno+",'Withdrawl',"+inr4+","+(rs4.getInt(2)-inr4)+")");
					st4.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
					System.out.println("Your transaction is Successful..!!");
					}else if(pin4.equals("0")){
						System.out.println("Transaction Cancelled..!!");
					}else if(pin4.equals(pinE4)){
						System.out.println("Transaction Failed: Insufficent Balance..!!");
					}
					else {
						System.out.println("Transaction Failed: Incorrect Pin..!!");
					}
					break;
		
		}
	}
}
