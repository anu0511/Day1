import java.sql.*;

public class InsertDemo {

    public static void main(String[] args)
      {
          try {

              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Anu@1234");
              PreparedStatement ps = con.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
              ps.setInt(1,203);
              ps.setString(2,"Anu");
              ps.setDouble(3,45000);

              int noOfrows =  ps.executeUpdate();
              if(noOfrows>0)     System.out.println("insertion successfull");
          }
          catch(Exception ex){

              ex.printStackTrace();
          }
      }
}