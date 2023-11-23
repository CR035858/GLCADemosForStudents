package com.gl.praj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name = "teacher")
public class Teacher {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)                //Primary key by default auto increment
	
	private int id;
	@Column(name = "f_name")
	private String f_name;
	@Column(name = "l_name")
	private String l_name;
	@Column(name = "email")
	private String email;
	
	public Teacher(String f_name, String l_name, String email) {       //Parameterized Constructor
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
	}

	public int getId() {                                                //Getters and Setters
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + "]";
	}
}
