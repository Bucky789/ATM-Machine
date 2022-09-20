package bank;
import java.sql.*;

public class Transactions extends Menu{
	void transactions() throws SQLException{
		System.out.println("Enter Your PIN for all Transactions: ");
		String pinE=sc.next();
		Statement st=con.createStatement();
		ResultSet rs1=st.executeQuery("select pin from account where accno="+accountno);
		String pin=rs1.getString(1);
		if(pinE.equals(pin)) {
		ResultSet rs= st.executeQuery("select * from Transactions where accno="+accountno);
		ResultSetMetaData rsmd = rs.getMetaData();
		   int columnsNumber = rsmd.getColumnCount();
		   while (rs.next()) {
		       for (int i = 1; i <= columnsNumber; i++) {
		           if (i > 1) System.out.print(",  ");
		           String columnValue = rs.getString(i);
		           System.out.print(rsmd.getColumnName(i)+"-"+columnValue );
		       }
		       System.out.println("");
		   }
		}else {
			System.out.println("Error: Incorrect PIN...!!!");
		}
	}	
}
