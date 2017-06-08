package coursepac;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
public class Courses {
	
	public static void main(String[] args){
		Connection con = null;
		Statement stmt =null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		  /*          Update Statement              */
		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost/MCStudentsDB?"+ "user=root&password=password" );
			String x = "UPDATE MCStudents SET Major = ? WHERE StudentID = ?";
			  pstmt = con.prepareStatement("UPDATE MCStudents SET Major = ? WHERE StudentID = ?");
                    		 pstmt.setInt(1, 2);
                    		 pstmt.setInt(2, 10);
                    		 pstmt.executeUpdate();
			/*while(rs.next()){
				System.out.print(rs.getString("FirstName")+"\t");
				System.out.print(rs.getString("LastName")+"\t");
				System.out.println(rs.getString("Major"));
							
			}*/
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{
			//	rs.close();
				pstmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}  
		  /*          Update Statement              */
		  /*          Insert Statement              */
		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost/MCStudentsDB?"+ "user=root&password=password" );
			String x = "Insert into MCStudents(FirstName, LastName) values (?, ?) ";
			  pstmt = con.prepareStatement("Insert into MCStudents(FirstName, LastName) values (?, ?) ");
                    		 pstmt.setString(1, "Willy");
                    		 pstmt.setString(2, "Wilkins");
                    		 pstmt.executeUpdate();
			/*while(rs.next()){
				System.out.print(rs.getString("FirstName")+"\t");
				System.out.print(rs.getString("LastName")+"\t");
				System.out.println(rs.getString("Major"));
							
			}*/
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{
			//	rs.close();
				pstmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		
		  /*          Insert Statement              */
		  /*          Delete Statement              */
		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost/MCStudentsDB?"+ "user=root&password=password" );
			String x = "Delete from MCStudents where FirstName=?";
			  pstmt = con.prepareStatement("Delete from MCStudents where FirstName=? ");
                  		 pstmt.setString(1, "Willy");

                  		 pstmt.executeUpdate();
			/*while(rs.next()){
				System.out.print(rs.getString("FirstName")+"\t");
				System.out.print(rs.getString("LastName")+"\t");
				System.out.println(rs.getString("Major"));
							
			}*/
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{
			//	rs.close();
				pstmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		
		  /*          Delete Statement              */
		/*          Select Statement              */
			try{Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost/MCStudentsDB?"+ "user=root&password=password" );
			System.out.println("Enter the first name: ");
			Scanner sc = new Scanner(System.in);
			String firstIn=sc.nextLine();
			String x = "Insert into MCStudents(FirstName) values (?) ";
			  pstmt = con.prepareStatement("Insert into MCStudents(FirstName) values (?) ");
			pstmt.setString(1, firstIn);
      		pstmt.executeUpdate();
			
      		
		

			}catch(SQLException e){
				e.printStackTrace();
				
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}finally{
				try{
					//rs.close();
					pstmt.close();
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			
			/*          Select Statement              */
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/MCStudentsDB?"+ "user=root&password=password" );
				 stmt= con.createStatement();
				String sql = "Select * from MCStudents";
				rs=stmt.executeQuery(sql);
				while(rs.next()){
					System.out.print(rs.getString("FirstName")+"\t");
					System.out.print(rs.getString("LastName"));
					System.out.println();
								
				}
				
				
			}catch(SQLException e){
				e.printStackTrace();
				
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}finally{
				try{
					rs.close();
					stmt.close();
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			}
		
				}

