package com.javacode.practice;

public class UniqueElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,8,9,3};
		int b[]={4,8,9,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]!=b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
