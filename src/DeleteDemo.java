import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
    public static void main(String[] args)
      {
          try {

              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Anu@1234");
            //  PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
              PreparedStatement ps = con.prepareStatement("delete from employee where name=?");

              ps.setString(1,"prabhat");

              int noOfrows =  ps.executeUpdate();
              if(noOfrows>0)     System.out.println("deletion successfull");

          }
          catch(Exception ex){

              ex.printStackTrace();
          }
      }
}