package com.example.demo.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.Util.StringUtil;

class StringUtilTest {
	StringUtil stringUtil = new StringUtil();
	@Test
	void testIsEmpty() {
		String a = "";
		assertTrue(stringUtil.isEmpty(a));
	}	
	@Test
	void testIsEmptyOnlySpace() {
		String a = "  ";
		assertTrue(stringUtil.isEmpty(a));
	}	
	@Test
	void testIsNotEmpty() {
		String a = "123";
		assertFalse(stringUtil.isEmpty(a));
	}
}
