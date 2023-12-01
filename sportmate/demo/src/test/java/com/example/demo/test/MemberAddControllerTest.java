package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.add.MemberAddController;

class MemberAddControllerTest {
	
	MemberAddController memberAddController = new MemberAddController();
	String name = "John";
	String gender = "Male";
	String email = "1234@gmail.com";
	String team = "TMS";
	String age = "18";
	String phone = "0123456789";
	
	@Test
	void testAddConfirm() {
		assertNotNull(memberAddController.addConfirmCheck(name, age, gender, email, phone, team));	
	}
	
	@Test
	void testAddConfirmNameEmpty() {
		name ="";
		assertNull(memberAddController.addConfirmCheck(name, age, gender, email, phone, team));	
	}
	
	@Test
	void testAddConfirmGenderEmpty() {
		gender ="";
		assertNull(memberAddController.addConfirmCheck(name, age, gender, email, phone, team));	
	}
	
	@Test
	void testAddConfirmAgeEmpty() {
		age ="";
		assertNull(memberAddController.addConfirmCheck(name, age, gender, email, phone, team));	
	}
	
	@Test
	void testAddConfirmEmailEmpty() {
		email ="";
		assertNull(memberAddController.addConfirmCheck(name, age, gender, email, phone, team));	
	}
	
	@Test
	void testAddConfirmPhoneEmpty() {
		phone ="";
		assertNull(memberAddController.addConfirmCheck(name, age, gender, email, phone, team));	
	}
	
	@Test
	void testAddConfirmTeamEmpty() {
		team ="";
		assertNull(memberAddController.addConfirmCheck(name, age, gender, email, phone, team));	
	}
	
	@Test
	void testAddConfirmPhoneNotInteger() {
		phone ="abc";
		assertNull(memberAddController.addConfirmCheck(name, age, gender, email, phone, team));	
	}
	
	@Test
	void testAddConfirmAgeNotInteger() {
		age ="abc";
		assertNull(memberAddController.addConfirmCheck(name, age, gender, email, phone, team));	
	}

}
