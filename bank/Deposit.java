package bank;
import java.sql.*;

public class Deposit extends Menu{
	double balancefinal;
	double balance;
	public void deposit() throws SQLException{
		System.out.println("Domestic Deposit: ");
		System.out.println("Enter Amount to Deposit: ");
		Float a=sc.nextFloat();
		System.out.println("Entered amount is ₹"+a);
		System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
		String pinE=sc.next();
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select pin,balance from account where accno="+accountno);
		rs.next();
		balance=rs.getFloat(2);
		String pin=rs.getString(1);
		balancefinal=rs.getFloat(2)+a;
			if(pinE.equals(pin)) {
				st.executeUpdate("insert into transactions values("+accountno+",'Deposit',"+a+","+(rs.getInt(2)+a)+")");
				st.executeUpdate("update account set balance="+balancefinal+" where accno="+accountno);
				System.out.println("Your transaction is Successful..!!");
				}else if(pinE.equals("0")){
					System.out.println("Transaction Cancelled..!!");
				}
				else {
					System.out.println("Transaction Failed: Incorrect PIN..!!");
				}
	}
}
