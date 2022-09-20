package bank;
import java.sql.*;

public class Balance extends Menu {
	 void balance() throws SQLException {
		
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select * from account where accno="+accountno);
		rs.next();
		String pin=rs.getString(5);
		System.out.println("To Check Your Balance Enter Your PIN: ");
		String pinE=sc.next();
			if(pin.equals(pinE)){
				System.out.println("Name of the Customer: "+rs.getString(2));
				System.out.println("Type of Account: "+rs.getString(3));
				System.out.println("Balance: ₹"+rs.getFloat(4));
	}
}}
