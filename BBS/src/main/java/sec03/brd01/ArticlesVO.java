package sec03.brd01;

import java.util.Date;

public class ArticlesVO {
	private int articlesNo;
	private String title;
	private String content;
	private String imageFileName;
	private String id;
	private Date writeDate;
	
	public ArticlesVO() {
		
	}

	public ArticlesVO(int articlesNo, String title, String content, String imageFileName, String id, Date writeDate) {
		this.articlesNo = articlesNo;
		this.title = title;
		this.content = content;
		this.imageFileName = imageFileName;
		this.id = id;
		this.writeDate = writeDate;
	}

	public int getArticlesNo() {
		return articlesNo;
	}

	public void setArticlesNo(int articlesNo) {
		this.articlesNo = articlesNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	

	
}
