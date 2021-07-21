package assignment5;

public class News {

	int newsId;
	String postedbyuser,commentbyuser,comment;
	public News(int newsId, String postedbyuser, String commentbyuser, String comment) {
		super();
		this.newsId = newsId;
		this.postedbyuser = postedbyuser;
		this.commentbyuser = commentbyuser;
		this.comment=comment;
	
}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedbyuser() {
		return postedbyuser;
	}
	public void setPostedbyuser(String postedbyuser) {
		this.postedbyuser = postedbyuser;
	}
	public String getCommentbyuser() {
		return commentbyuser;
	}
	public void setCommentbyuser(String commentbyuser) {
		this.commentbyuser = commentbyuser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedbyuser=" + postedbyuser + ", commentbyuser=" + commentbyuser
				+ ", comment=" + comment + "]";
	}
	
}
