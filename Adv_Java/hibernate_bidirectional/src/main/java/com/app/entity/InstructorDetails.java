package com.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="InstructorDetails1")
public class InstructorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String hobby;
	@Column
	private String youtube_channel;
	@OneToOne(mappedBy = "InstructorDetails", cascade = CascadeType.ALL)
	private Instructor instructor;
	
	
	public InstructorDetails(String hobby, String youtube_channel) {
		super();
		this.hobby = hobby;
		this.youtube_channel = youtube_channel;
	}


	public InstructorDetails(String hobby, String youtube_channel, Instructor instructor) {
		super();
		this.hobby = hobby;
		this.youtube_channel = youtube_channel;
		this.instructor = instructor;
	}

}
