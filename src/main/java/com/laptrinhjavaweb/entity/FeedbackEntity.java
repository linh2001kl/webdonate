package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Feedback")
public class FeedbackEntity extends BaseEntity {
 
	@Column
	private String userName;
	
	@Column
	private String comment;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	

	@ManyToOne
	@JoinColumn(name = "new_id")
	private NewEntity news;

	public NewEntity getNews() {
		return news;
	}

	public void setNewss(NewEntity news) {
		this.news = news;
	}

	
	

	

}
