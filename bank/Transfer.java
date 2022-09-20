package bank;
import java.sql.*;

public class Transfer extends Menu{
	void transfer() throws SQLException{
		System.out.print("To Transfer Money Enter Recipient's Account Number: ");
		int accE=sc.nextInt();
		System.out.print("Re-Enter Account Number: ");
		int accE1=sc.nextInt();
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select accno,balance from account where accno="+accE);
		if(rs.next()){
			int acc=rs.getInt(1);
			if(accE!=accE1) {
				System.out.println("Error: Account Number Doesn't Match..!!");
			}
			else if(accE==acc && accE!=accountno) {
				System.out.println("Enter Amount to Transfer: ");
				float a=sc.nextFloat();
				System.out.println("Entered Amount is ₹"+a);
				System.out.println("Enter your PIN to confirm your transaction or press 0 to cancel the transaction");
				String pinE=sc.next();
				ResultSet rs1= st.executeQuery("select pin,balance from account where accno="+accountno);
				rs1.next();
				String pin=rs1.getString(1);
				float balanceS=rs1.getFloat(2);
				ResultSet rs2= st.executeQuery("select accno,balance from account where accno="+accE);
				rs2.next();
				float balanceR=rs2.getFloat(2);
				float FinalBalanceS=balanceS-a;
				float FinalBalanceR=balanceR+a;
				if(pinE.equals(pin) && balanceS>=a) {
					st.executeUpdate("update account set balance="+FinalBalanceS+" where accno="+accountno);
					st.executeUpdate("update account set balance="+FinalBalanceR+" where accno="+accE);
					st.executeUpdate("insert into transactions values("+accountno+",'Withdrawl',"+a+","+(FinalBalanceS)+")");
					st.executeUpdate("insert into transactions values("+accE+",'Deposit',"+a+","+(FinalBalanceR)+")");
					System.out.println("Transaction Successful..!!");
				}else if(pinE.equals(pin) && balanceS<a){
					System.out.println("Error: Insufficient Balance..!!");
				}else if(pinE.equals("0")){
					System.out.println("Transaction Cancelled..!!");
				}else{
					System.out.println("Transaction Failed: Incorrect PIN..!!");
				}
			}else if(accE==accountno){
				System.out.println("Error: Can't Transfer to the Same Account..!!");
			}
		}else {
			System.out.println("Error: Account Doesn't Exist..!!");
		}
		System.exit(1);
	
	}
}
