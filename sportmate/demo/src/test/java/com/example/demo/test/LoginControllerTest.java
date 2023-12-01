package com.example.demo.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.demo.Util.StringUtil;
import com.example.demo.controller.LoginController;



class LoginControllerTest {
	 private LoginController loginController= new LoginController();
	 
	    @Test
	    public void testLoginWithValidCredentials() {
	    	String acc = "123";
	        String pass = "123"; 
	        
	        assertFalse(StringUtil.isEmpty(acc));
	        assertFalse(StringUtil.isEmpty(pass));
	        assertTrue(loginController.checkAccAndPass(acc, pass));
	    }

	    @Test
	    public void testLoginWithEmptyAccount() {
	    	String acc = "123";
	        String pass = ""; 
	        
	        assertFalse(StringUtil.isEmpty(acc));
	        assertTrue(StringUtil.isEmpty(pass));
	        assertFalse(loginController.checkAccAndPass(acc, pass));
	    }

	    @Test
	    public void testLoginWithEmptyPassword() {
	        String acc = "123";
	        String pass = ""; 
	        
	        assertFalse(StringUtil.isEmpty(acc));
	        assertTrue(StringUtil.isEmpty(pass));
	        assertFalse(loginController.checkAccAndPass(acc, pass));
	    }
	    
	    @Test
	    public void testLoginWithEmptyAccountAndPassword() {
	        String acc = "";
	        String pass = ""; 
	        
	        assertFalse(StringUtil.isEmpty(acc));
	        assertFalse(StringUtil.isEmpty(pass));
	        assertFalse(loginController.checkAccAndPass(acc, pass));
	    }
	    
	    @Test
	    public void testLoginWithWrongAccount() {
	    	String acc = "456";
	        String pass = "123"; 
	        
	        assertFalse(StringUtil.isEmpty(acc));
	        assertFalse(StringUtil.isEmpty(pass));
	        assertFalse(loginController.checkAccAndPass(acc, pass));
	    }
	    
	    @Test
	    public void testLoginWithWrongPassword() {
	    	String acc = "123";
	        String pass = "456"; 
	        
	        assertFalse(StringUtil.isEmpty(acc));
	        assertFalse(StringUtil.isEmpty(pass));
	        assertFalse(loginController.checkAccAndPass(acc, pass));
	    }

	    @Test
	    public void testLoginWithWrongAccountAndPassword() {
	    	String acc = "456";
	        String pass = "456"; 
	        
	        assertFalse(StringUtil.isEmpty(acc));
	        assertFalse(StringUtil.isEmpty(pass));
	        assertFalse(loginController.checkAccAndPass(acc, pass));
	    }
}
