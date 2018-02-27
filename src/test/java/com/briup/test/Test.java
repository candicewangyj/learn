package com.briup.test;

public class Test {
	@org.junit.Test
	public void test_1(){
		try {
			new FirstTest().test("hello world");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
