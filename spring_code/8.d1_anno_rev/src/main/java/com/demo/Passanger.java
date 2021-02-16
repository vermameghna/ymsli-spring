package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "passanger")
public class Passanger {
	@Value(value = "raja")
	private String name;

	@Value(value = "34")
	private Integer age;

	@Autowired
	private Vehical vehical;

	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Passanger() {

	}

	public String getName() {
		return name;
	}

	public Passanger(Vehical vehical) {
		this.vehical = vehical;
	}

	public Passanger(String name, Integer age, Vehical vehical) {
		System.out.println("para ctr is called");
		this.name = name;
		this.age = age;
		this.vehical = vehical;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {

		this.vehical = vehical;
	}

	public void travel() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("address: "+ address.getAddress());
		vehical.move();
	}
}