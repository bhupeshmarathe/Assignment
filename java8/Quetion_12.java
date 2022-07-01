package com.yash.assign;

interface ABC
{
	void third(int a[]);
}

public class Quetion_12 {

	public static void main(String[] args) {
		
		ABC obj=(a)->{
			int len=a.length;
			for(int i=0;i<len;i++)
			{
				for(int j=i+1;j<len;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int k=1;k<=5;k++)
			{
				System.out.println("Maximum element:"+k+" "+a[len-k]);
			}
		};
		int a[]= {10,20,30,40,50};
		obj.third(a);
	}

}
