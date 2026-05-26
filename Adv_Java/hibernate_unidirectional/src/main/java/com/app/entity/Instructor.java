package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
//	@OneToOne(cascade = CascadeType.PERSIST)
//	@OneToOne(cascade = CascadeType.ALL)
//	@OneToOne(cascade = CascadeType.MERGE )
	@OneToOne(fetch = FetchType.LAZY)
	
	@JoinColumn(name="instructorDetails_id")
	private InstructorDetails instructorDetails;

	public Instructor(final String firstName, final String lastName, final String email, final InstructorDetails instructorDetails) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.instructorDetails = instructorDetails;
	}

	public Instructor(final String firstName, final String lastName, final String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

}
