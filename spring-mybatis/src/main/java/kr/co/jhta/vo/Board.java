package kr.co.jhta.vo;

import java.util.Date;
import java.util.List;

public class Board {

	private int no;
	private String title;
	private String content;
	private int reviewCnt;
	private double reviewPoint;
	private String deleted;
	private Date createdDate;
	private Date updatedDate;
	private User user;
	private List<Review> reviews;
	
	public Board() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public int getReviewCnt() {
		return reviewCnt;
	}

	public void setReviewCnt(int reviewCnt) {
		this.reviewCnt = reviewCnt;
	}

	public double getReviewPoint() {
		return reviewPoint;
	}

	public void setReviewPoint(double reviewPoint) {
		this.reviewPoint = reviewPoint;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", content=" + content + ", reviewCnt=" + reviewCnt
				+ ", reviewPoint=" + reviewPoint + ", deleted=" + deleted + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", user=" + user + ", reviews=" + reviews + "]";
	}
	
}
