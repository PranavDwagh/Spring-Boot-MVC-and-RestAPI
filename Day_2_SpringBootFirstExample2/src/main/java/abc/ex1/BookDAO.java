package abc.ex1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDAO {
	
	@Autowired
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void addBook(int id, int cost, String name)
	{
		 try {
			Connection con = dataSource.getConnection();
			
			String sql = "insert into book values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			pstmt.setInt(2, cost);
			pstmt.setString(3, name);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	public void getAllBooks()
	{
		try {
		Connection con = dataSource.getConnection();
		
		String sql = "select * from book";
		PreparedStatement pstmt;
		
			pstmt = con.prepareStatement(sql);
		
		     ResultSet set =   pstmt.executeQuery();
		     while(set.next())
		     {
		    	 System.out.println( set.getInt(1)+ "  "+
		    	 set.getInt(2)+ "  "+
		    	 set.getString(3));
		     }
		     
		     
		     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
}
}
