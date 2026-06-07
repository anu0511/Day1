import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
    public static void main(String[] args)
      {
          try {

              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Anu@1234");
            //  PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
              PreparedStatement ps = con.prepareStatement("update employee set salary=? where name=?");
              ps.setDouble(1,30000);
              ps.setString(2,"Prabhat");

              int noOfrows =  ps.executeUpdate();
              if(noOfrows>0)     System.out.println("updation successfull");

          }
          catch(Exception ex){
              ex.printStackTrace();
          }
      }
}