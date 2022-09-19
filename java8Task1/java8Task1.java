package java8Task1;

import java.util.Arrays;

interface Check{
	
	void print ();
}

public class java8Task1 {

	public static void main(String[] args) {
		
		String number="789987";
		char ch[]=number.toCharArray();
		char temp[]=new char[number.length()];
		
		Check c=()->{
			int j=0;
			for(int i=ch.length-1;i>=0;i--) {
				temp[j++]=ch[i];
			}
			if( Arrays.equals(ch, temp)) {
				System.out.println("palindrom Number");
			}
			else {
				System.out.println("Not palindrom Number");
			}
		};
		c.print();
	}
}
