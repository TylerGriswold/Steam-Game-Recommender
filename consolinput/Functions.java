package consolinput;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Functions {
	
	static final String databasePrefix ="cs366-2201_griswoldtj17";
    static final String netID ="griswoldtj17"; // Please enter your netId
    static final String hostName ="washington.uww.edu";
    static final String databaseURL ="jdbc:mysql://"+hostName+"/"+databasePrefix + "?noAccessToProcedureBodies=true";
    static final String password="tg4880"; // please enter your own password

	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;

	public static void Connection(){

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("databaseURL"+ databaseURL);
			connection = DriverManager.getConnection(databaseURL, netID, password);
			System.out.println("Successfully connected to the database");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of Connection
	
	public static void GameInfoProcedure(String spName, String gameName) {

	try {
		statement = connection.createStatement();
		
		CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
        myCallStmt.setString(1, gameName);
        
        resultSet = myCallStmt.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
		int columns = metaData.getColumnCount();
		
		
		for (int i=1; i<= columns; i++) {
			System.out.print(metaData.getColumnName(i)+"\t");
		}
		System.out.println();
  
        while(resultSet.next()) {
        	for (int i=1; i<= columns; i++) {
				System.out.print(resultSet.getObject(i)+"\t\t");
			}
			System.out.println();
        }

	}
	catch (SQLException e) {
		e.printStackTrace();
	}
} // end of gameName method
	public static void posRevProcedure(String spName, int pos) {

		try {
			statement = connection.createStatement();
			
			CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
	        myCallStmt.setInt(1, pos);
	        
	        resultSet = myCallStmt.executeQuery();
	        ResultSetMetaData metaData = resultSet.getMetaData();
			int columns = metaData.getColumnCount();
			
			
			for (int i=1; i<= columns; i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
	  
	        while(resultSet.next()) {
	        	for (int i=1; i<= columns; i++) {
					System.out.print(resultSet.getObject(i)+"\t\t");
				}
				System.out.println();
	        }

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of gameName method
	public static void LowestPriceAvgPlaytimeProcedure(String spName, int playtime) {

		try {
			statement = connection.createStatement();
			
			CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
	        myCallStmt.setInt(1, playtime);
	        
	        resultSet = myCallStmt.executeQuery();
	        ResultSetMetaData metaData = resultSet.getMetaData();
			int columns = metaData.getColumnCount();
			
			
			for (int i=1; i<= columns; i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
	  
	        while(resultSet.next()) {
	        	for (int i=1; i<= columns; i++) {
					System.out.print(resultSet.getObject(i)+"\t\t");
				}
				System.out.println();
	        }

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of LowestPriceAvgPlaytime method
	
	public static void topAVGProcedure(String spName, int playtime) {

		try {
			statement = connection.createStatement();
			
			CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
	        myCallStmt.setInt(1, playtime);
	        
	        resultSet = myCallStmt.executeQuery();
	        ResultSetMetaData metaData = resultSet.getMetaData();
			int columns = metaData.getColumnCount();
			
			
			for (int i=1; i<= columns; i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
	  
	        while(resultSet.next()) {
	        	for (int i=1; i<= columns; i++) {
					System.out.print(resultSet.getObject(i)+"\t\t");
				}
				System.out.println();
	        }

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of gameName method
	public void priceCheckLProcedure(String spName, double price) {

		try {
			statement = connection.createStatement();
			
			CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
	        myCallStmt.setDouble(1, price);
	        
	        resultSet = myCallStmt.executeQuery();
	        ResultSetMetaData metaData = resultSet.getMetaData();
			int columns = metaData.getColumnCount();
			
			
			for (int i=1; i<= columns; i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
	  
	        while(resultSet.next()) {
	        	for (int i=1; i<= columns; i++) {
					System.out.print(resultSet.getObject(i)+"\t\t");
				}
				System.out.println();
	        }

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of priceCheckL method
	
	public void priceCheckEProcedure(String spName, double price) {

		try {
			statement = connection.createStatement();
			
			CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
	        myCallStmt.setDouble(1, price);
	        
	        resultSet = myCallStmt.executeQuery();
	        ResultSetMetaData metaData = resultSet.getMetaData();
			int columns = metaData.getColumnCount();
			
			
			for (int i=1; i<= columns; i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
	  
	        while(resultSet.next()) {
	        	for (int i=1; i<= columns; i++) {
					System.out.print(resultSet.getObject(i)+"\t\t");
				}
				System.out.println();
	        }

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of priceCheckE method
	
	public void priceCheckGProcedure(String spName, double price) {

		try {
			
			statement = connection.createStatement();
			
			CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
	        myCallStmt.setDouble(1, price);
	        
	        resultSet = myCallStmt.executeQuery();
	        ResultSetMetaData metaData = resultSet.getMetaData();
			int columns = metaData.getColumnCount();
			
			
			for (int i=1; i<= columns; i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
	  
	        while(resultSet.next()) {
	        	for (int i=1; i<= columns; i++) {
					System.out.print(resultSet.getObject(i)+"\t\t");
				}
				System.out.println();
	        }

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of priceCheckG method
	
	public void searchByDevProcedure(String spName, String dev) {

		
		try {
			statement = connection.createStatement();
			
			CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
	        myCallStmt.setString(1, dev);
	        
	        resultSet = myCallStmt.executeQuery();
	        ResultSetMetaData metaData = resultSet.getMetaData();
			int columns = metaData.getColumnCount();
			
			
			for (int i=1; i<= columns; i++) {
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
	  
	        while(resultSet.next()) {
	        	for (int i=1; i<= columns; i++) {
					System.out.print(resultSet.getObject(i)+"\t\t");
				}
				System.out.println();
	        }
	
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of devProcedure method
	public void devPubProcedure(String spName, String dev) {
		
	try {
		statement = connection.createStatement();
		
		CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
        myCallStmt.setString(1, dev);
        
        resultSet = myCallStmt.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
		int columns = metaData.getColumnCount();
		
		
		for (int i=1; i<= columns; i++) {
			System.out.print(metaData.getColumnName(i)+"\t");
		}
		System.out.println();
  
        while(resultSet.next()) {
        	for (int i=1; i<= columns; i++) {
				System.out.print(resultSet.getObject(i)+"\t\t");
			}
			System.out.println();
        }

	}
	catch (SQLException e) {
		e.printStackTrace();
	}
} // end of devProcedure method
	public void BadGameProcedure(String spName, int id) {
		
		try {
			statement = connection.createStatement();
			
			CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
	        myCallStmt.setInt(1, id);

			System.out.println("Your Negative Review has been submitted!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of devProcedure method
	public void LikeGameProcedure(String spName, int id) {
		
		try {
			statement = connection.createStatement();
			
			CallableStatement myCallStmt = connection.prepareCall("{call "+ spName +"(?)}");
	        myCallStmt.setInt(1, id);

			System.out.println("Your Positive Review has been submitted!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	} // end of devProcedure method
}

