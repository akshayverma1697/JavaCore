package Streams;

import java.util.Arrays;
import java.util.List;

public class News
{
	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;
	
	//newsID
	public void setnewsId(int newsId)
	{
		this.newsId = newsId;
	}
	public int getnewsId()
	{
		return newsId;
	}
	
	//postedByUser
	public void setpostedByUser(String postedByUser) 
	{
		this.postedByUser = postedByUser;
	}
	public String getpostedByUser()
	{
		return postedByUser;
	}
	
	//commentByUser
	public void setcommentByUser(String commentByUser) 
	{
		this.commentByUser = commentByUser;
	}
	public String getcommentByUser()
	{
		return commentByUser;
	}
	
	
	//comment
	public void setcomment(String comment) 
	{
		this.comment = comment;
	}
	public String getcomment()
	{
		return comment;
	}
	
	public News(int newsId, String postedByUser, String commentByUser, String comment) 
	{
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}


	
	@Override
	public String toString()
	{
		return "News ID: " + newsId + ", postedByUser=" + postedByUser + ", commentByUser= " + commentByUser + ", comment=" + comment;
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<News> news = Arrays.asList(
				
				new News(50, "red", "user", "comment"), 
				new News(101, "red", "user2", "comment"),
				new News(102, "red", "user2", "comment"),
				new News(50, "user", "user3", "comment")
				);
		
		//Q1
		System.out.println("Find out the newsId which has received maximum comments \n");
		
	}

}
