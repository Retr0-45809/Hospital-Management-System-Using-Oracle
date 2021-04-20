/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Hospital_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");  //Load the driver class
        
        System.out.println("Connecting to a selected database...");
        
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123456789") // Creating a connection object
            ) {
                System.out.println("Connected database successfully...");
                //Statement stmt=con.createStatement();
                //  ResultSet rs=stmt.executeQuery("select * from emloyees");
                //stmt.executeUpdate("update employees set email='abc@gmail.com' where employee_id=101");
                //  while(rs.next())
                //{
                //  System.out.println(rs.getInt(1)+"  " + rs.getString(2)+"    " + rs.getString(3)+rs.getString(4)+rs.getDate(6));
                // }
            }
    }catch(ClassNotFoundException | SQLException e)
   
    { e.toString();}
    }    
}
