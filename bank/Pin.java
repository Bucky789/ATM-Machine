package bank;
import java.sql.*;

public class Pin extends Menu{
	void pin() throws SQLException{
		System.out.println("To Change PIN Enter Your Current PIN");
		String pinE=sc.next();
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select pin from account where accno="+accountno);
		rs.next();
		String pin=rs.getString(1);
		if(pinE.equals(pin)) {
			System.out.println("Enter New PIN: ");
			String pinN=sc.next();
			System.out.println("Re-Enter New PIN: ");
			String pinN1=sc.next();
			if(pinN.equals(pinN1)) {
				System.out.println("PIN Changed Succesfully..!!");
				st.executeUpdate("update account set pin="+pinN+" where accno="+accountno);
			}else {
				System.out.println("Error: Entered PIN Doesn't Match..!!");
			}
		}else {
			System.out.println("Error: Incorrect PIN...!!!");
		}
	}
}
