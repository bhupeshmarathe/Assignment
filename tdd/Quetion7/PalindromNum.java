package Quetion7;

public class PalindromNum {

	public static boolean checkPalindrom(int num)
	{
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+num;
			num/=10;
		}
		if(rev==temp)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		
		System.out.println(checkPalindrom(1281));
	}

}
