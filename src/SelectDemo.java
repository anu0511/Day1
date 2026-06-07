import java.sql.*;

public class SelectDemo {

    public static void main(String[] args)
      {
      try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Anu@1234");

          //Statement st =   con.createStatement();//PreparedStatement i s better than Statement
          PreparedStatement ps = con.prepareStatement("SELECT * FROM employee");

        ResultSet rs =ps.executeQuery();

        while(rs.next()) {
            System.out.println( rs.getInt("id")  +" "+ rs.getString("name") +" "+ rs.getDouble("salary")         );
        }

        } catch (Exception e) {
          e.printStackTrace();
      }

    }

}