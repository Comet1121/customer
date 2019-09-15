package com.application.customer.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Customer {
	
	@Id
	@NotBlank(message="Code must not be empty")
	@Size(max=20, message="Code must not be over 20")
	private String code;
	
	@NotBlank(message="Name must not be empty")
	@Size(max=20, message="Name must not be over 20")
	private String name;
	
	@NotBlank(message="Katakana Name must not be empty")
	@Size(max=20, message="Katakana Name must not be over 20")
	private String kana;
	
	@NotBlank(message="Password must not be empty")
	@Size(min=4, message="Password must not be less than 20")
	@Size(max=20, message="Password must not be over 20")
	private String pass;
	
	@NotBlank(message = "Date of birth must not be empty")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private LocalDate birth;
	
	@NotBlank(message = "Job Title must not be empty")
	@Size(max=300, message="Job Title must not be over 300")
	private String job;
	
	@NotBlank(message = "Email must not be empty")
	@Size(max=300, message="Email must not be over 300")
	@Email
	private String email;
	
	@NotBlank(message="Telep")
	private String tel;
	private String post;
	private String add;
	
	public Customer() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	
	
}
