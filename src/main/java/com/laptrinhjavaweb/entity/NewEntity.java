package com.laptrinhjavaweb.entity;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "new")
public class NewEntity extends BaseEntity {
	
	@Column
	private String code;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "title")
	private String title;
	
	@Column(name = "thumbnail")
	private String thumbnail;
	
	@Column(name = "shortdescription")
	private String shortDescription;
	
	@Column(name = "content")
	private String content;
	
	@ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
	
	@ManyToMany(mappedBy = "news")
	private List<UserEntity> users = new ArrayList<>();
	
	
	public List<FeedbackEntity> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<FeedbackEntity> feedbacks) {
		this.feedbacks = feedbacks;
	}

	@OneToMany(mappedBy = "news")
	private List<FeedbackEntity> feedbacks = new ArrayList<>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	
}