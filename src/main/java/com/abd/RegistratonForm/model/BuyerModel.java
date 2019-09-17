package com.abd.RegistratonForm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buyer")
public class BuyerModel {

@Id	
private int id;
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="name")
private String name;
@Column(name="age")
private int age;
@Column(name="city")
private String city;
@Column(name="pname")
private String pname;
@Column(name="pmodel")
private String pmodel;
@Column(name="price")
private int price;
@Column(name="ddate")
private String ddate;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPmodel() {
	return pmodel;
}
public void setPmodel(String pmodel) {
	this.pmodel = pmodel;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDdate() {
	return ddate;
}
public void setDdate(String ddate) {
	this.ddate = ddate;
}


	
	
	
}
