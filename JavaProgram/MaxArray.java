package com.javacode.practice;

public class MaxArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,7,3,2,8};
		int max =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println((max));
			
	}

}
