package lastreport;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.data.category.DefaultCategoryDataset;

public class Lastgraph_main {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
				int id, score;
				String name;
				ResultSet rs;
				
				MySQL mysql = new MySQL();
				
				rs = mysql.selectAll();
				
				try {
					while(rs.next()){
						DefaultCategoryDataset data = new DefaultCategoryDataset();
						id = rs.getInt("id");
						name = rs.getString("name");
						score = rs.getInt("score");
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
		
		Lastgraph lastreport = new Lastgraph();
		lastreport.setBounds(5,5,655,455);
		lastreport.setVisible(true);
	}

}
