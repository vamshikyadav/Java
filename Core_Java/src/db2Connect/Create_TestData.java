package db2Connect;

import java.sql.*;


public class Create_TestData {
	
	
    
    /*Below is the update code*/

	public static void main(String[] args) {
		//Connect DB2		
		
		
		
		
	    String url = "jdbc:db2://qadb2a.corp.dol.private.gdol:50000/GDLQA" ;
	    String user = "aa1202";
	    String password = "";	                                                        
	    Connection con = null;
	    Statement stmt = null;
	    
	    
	    // Below are the looping variables
	    int i;
	    int[] SCHEDULE_TYPE= {915,916,917,918,919,920,921,922,923,924,925,926,927,928,932,933,934,935,936,937}; 
	   
	   // Below is the try and catch to connect and check the JDBC connection	    
	    try 
	    {                                                                        
	      // Load the DB2 driver	    	 
	      Class.forName("com.ibm.db2.jcc.DB2Driver");                            
	      System.out.println("**** Loaded the JDBC driver successfully");
	      // Create the connection using the IBM Data Server Driver for JDBC and SQLJ
	      con = DriverManager.getConnection (url, user, password);   
	      System.out.println("**** You have successfully connected to the database");
	      // Commit changes manually
	      con.setAutoCommit(false);
	      System.out.println("**** Created a JDBC connection to the data source");

	      // Create the Statement
	      stmt = con.createStatement();                                           
	      //Below is the loop to update data into the DB2 QA
	      
	      for(i=0;i<33;i++){
	    	  String sql = "INSERT INTO GdlQA.CIAPPT VALUES" +  "(3500,  '" + SCHEDULE_TYPE[i] + "',  '2019-05-02',  400, 02035665"+ i +", 'TestVK', 'Test','6786785421', ' ', '4383', '2019-04-24', '', 'POSITIVE RECRUITMENTS 3')";
	    	  stmt.executeUpdate(sql);
	    	  System.out.println("Inserted" + "02035665"+ i +" records into the table...");
	    	  }
	    }
	    
	    catch (ClassNotFoundException e)
	    {
	      System.err.println("Could not load JDBC driver");
	      System.out.println("Exception: " + e);
	      e.printStackTrace();
	    }

	    catch(SQLException ex)                                                    
	    {
	      System.err.println("SQLException information");
	      while(ex!=null) {
	        System.err.println ("Error msg: " + ex.getMessage());
	        System.err.println ("SQLSTATE: " + ex.getSQLState());
	        System.err.println ("Error code: " + ex.getErrorCode());
	        ex.printStackTrace();
	        ex = ex.getNextException(); // For drivers that support chained exceptions
	      }
	    }

	}

}
