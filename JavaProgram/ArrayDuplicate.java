package com.javacode.practice;

public class ArrayDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5};
		int b[]={5,7,3,2,8};
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
			
		}
		
	}

}
