// program to check whether a charatcer is vowel or consonant:

import java.util.Scanner;

class switchcase
{
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);
		char ch;
		System.out.println("enter any character:");
		ch=key.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
					System.out.println(ch+" is a vowel");
					break;
			case 'e':
					System.out.println(ch+" is a vowel");
					break;
			case 'i':
					System.out.println(ch+" is a vowel");
					break;
			case 'o':
					System.out.println(ch+" is a vowel");
					break;
			case 'u':
					System.out.println(ch+" is a vowel");
					break;
			default:
					System.out.println(ch+" is a consonant");
					break;
		}
	}
}
				