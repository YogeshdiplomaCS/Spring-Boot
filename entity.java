package com.example.test.entity;
import jakarta.persistence.*;

@Entity
@Table(name="user")
public class entity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String name;
	private Long phone;
	private String email;
	private String address;
	
	public entity() {
		
	}
	
	public entity(Long id,String name, Long phone, String email, String address) {
		this.id=id;
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.address=address;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Long getPhone() {
		return phone;
	}
	
	public void setPhone(Long phone) {
		this.phone=phone;	
	}
	
	public String getEmail() {
		return email;
	}
		
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
}
