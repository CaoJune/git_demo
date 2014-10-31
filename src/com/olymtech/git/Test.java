package com.olymtech.git;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>>>Hello world !! >>>> git demo >>>>");
		System.out.println(">>>>Hello world !! >>>> git demo >>>> first commit");
		System.out.println(">>>> git_demo master brach 2nd commit >>>> ");
		
		Mouse m = new Mouse();
		m.setColor("gray");
		
		System.out.println(">>>> git_demo b_001 brach init commit >>>> ");
		System.out.println(">>>> git_demo dev -> b_002 brach init commit >>>> ");
		System.out.println(">>>> git_demo b_002 brach 1st commit >>>> ");
		
	}
	public static boolean isEmpty(List list){
		return list == null || list.size() == 0;
	}
	
	public static boolean isNotEmpty(List list){
		return !isEmpty(list);
	}
	
	public static boolean isEmpty(Object[] list){
		return list == null || list.length == 0;
	}
	
	public static boolean isNotEmpty(Object[] list){
		return !isEmpty(list);
	}
	
}
