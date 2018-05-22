import java.sql.*;

public class UtenteDao {
	
	Connection myConn;
	Statement myStmt;
	ResultSet myRs;
	String sql;
	
	public UtenteDao() throws SQLException {
		
	    try
	    {
	    	// 0. Load the driver
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    }
	    catch(ClassNotFoundException e)
	    {
	       System.out.println("ClassNotFoundException: ");
	       System.err.println(e.getMessage());
	    }
	    
	     // 1. Get a connection to database
		 myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/campionato?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false","root","root");
		 sql = "select nome from giocatore where giocatore.Nome = 'lorenzo'";
		 
		 try {
			 // 2. Create a statement
			 myStmt = myConn.createStatement();
			 // 3. Execute SQL query
			 myRs = myStmt.executeQuery(sql);
			 while(myRs.next() == true) {
				UtenteDto.setNomeDto(myRs);
			 }
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
