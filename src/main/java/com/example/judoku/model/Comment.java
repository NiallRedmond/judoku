package com.example.judoku.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Comments")
@EntityListeners(AuditingEntityListener.class)
public class Comment {
	
	@Id
	@Column(name="COMMENT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long commentId;
	
	@Column(name="BODY")
	private String body;
    
	public long getId() {
		return commentId;
	}
	public void setId(long id) {
		this.commentId = id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
