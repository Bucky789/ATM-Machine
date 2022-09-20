package bank;

import java.sql.*;

public class Withdraw extends Menu {
	public void withdraw() throws SQLException {
		double balancefinal;
		double balance;
		System.out.println("Domestic Withdrawl: ");
		System.out.println("Enter Amount to Withdraw: ");
		Float a=sc.nextFloat();
		System.out.println("Entered amount is ₹"+a);
		System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
		String pinE=sc.next();
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select pin,balance from account where accno="+accountno);
		rs.next();
		balance=rs.getFloat(2);
		String pin=rs.getString(1);
		balancefinal=rs.getFloat(2)-a;
			if(pinE.equals(pin) && balance>=a) {
				st.executeUpdate("insert into transactions values("+accountno+",'Withdrawl',"+a+","+(rs.getInt(2)-a)+")");
				st.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
				System.out.println("Your transaction is Successful..!!");
				}else if(pinE.equals("0")){
					System.out.println("Transaction Cancelled..!!");
				}else if(pinE.equals(pin)){
					System.out.println("Transaction Failed: Insufficent Balance..!!");
				}
				else {
					System.out.println("Transaction Failed: Incorrect PIN..!!");
				}
	}
}
