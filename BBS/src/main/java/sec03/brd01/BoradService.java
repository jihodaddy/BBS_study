package sec03.brd01;

import java.util.List;

public class BoradService {
	BoardDAO boardDAO;
	
	public BoardService() {
		boardDAO = new BoardDAO();	//생성자 호출 시 BoardDAO 객체를 생성
	}

	public List<ArticlesVO> listArticled(){
		List<ArticlesVO> articlesList = boardDAO.selectAllArticles();
		return articlesList;
	}
}
