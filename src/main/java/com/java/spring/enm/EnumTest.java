package com.java.spring.enm;

import com.java.spring.model.Student;

public class EnumTest {

	
	public static void main(String[] args) {

		String str="add";
		
		switch(StudentEnum.valueOf(str)){
		case add:
			System.out.println("add");
			break;
		case edit:
			System.out.println("edit");
			break;
		case delete:
			System.out.println("delet");
			break;
		case search:
			System.out.println("search");
			break;
	   default:
		   System.out.println("default");
		}
	}

}
