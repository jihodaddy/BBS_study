package sec03.brd01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {

	private DataSource dataSource;
	Connection con;
	PreparedStatement pstmt;
	
	public BoardDAO() {
		try {
			Context init = new InitialContext();
			dataSource = (DataSource) init.lookup("java:comp/env/jdbc/mysql");
			System.out.println("DB 연결 성공");			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public List<ArticlesVO> selectAllArticles(){
	
		List<ArticlesVO> articlesList = new ArrayList();
		
		try {
			con = dataSource.getConnection();
			String query = " select * from board";
			
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int articlesNo = rs.getInt("articlesNo");
				String title= rs.getString("title");
				String content = rs.getString("content");
				String imageFileName= rs.getString("imageFileName");
				String id = rs.getString("id");
				Date writeDate = rs.getDate("writeDate");
				
				ArticlesVO article = new ArticlesVO();
				article.setArticlesNo(articlesNo);
				article.setTitle(title);
				article.setContent(content);
				article.setImageFileName(imageFileName);
				article.setId(id);
				article.setWriteDate(writeDate);
				
				articlesList.add(article);
			
			}
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return articlesList;
		
	}
	
}
















