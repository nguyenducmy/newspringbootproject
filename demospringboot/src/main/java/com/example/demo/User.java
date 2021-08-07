	package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbluser")
public class User {
	private  Long id;
	private String taikhoan;
	private String matkhau;
	private String hoten;
	private Long dienthoai;
	
	public User() {
		
		super();
	}
	
	
	
	
	public User(Long id, String taikhoan, String matkhau, String hoten, Long dienthoai, String email, String diachi) {
		super();
		this.id = id;
		this.taikhoan = taikhoan;
		this.matkhau = matkhau;
		this.hoten = hoten;
		this.dienthoai = dienthoai;
		this.email = email;
		this.diachi = diachi;
	}




	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Long getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(Long dienthoai) {
		this.dienthoai = dienthoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	private String email;
	private String diachi;
	
	}
	

