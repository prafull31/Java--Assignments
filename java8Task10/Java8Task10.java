package java8Task10;

	import java.util.HashMap;
	import java.util.Scanner;
	
	public class Java8Task10 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        HashMap< Integer, Double> hm = new HashMap<>();
	        Integer year = null;
	        Double sell = null;
	        System.out.println("Enter year and sell in crore");
	        for(int i=1;i<6;i++)
	        {
	            System.out.println("Enter year");
	             year = sc.nextInt();
	            System.out.println("Enter sell");
	            sell = sc.nextDouble();
	            hm.put(year, sell);
	        }
	        
	        hm.put((year+1), (sell+0.5));
	        hm.put((year+2), (sell+1));
	        hm.put((year+3), (sell+1.5));
	        
	        System.out.println("Your data " +hm);
	        System.out.println("enter year for predication of sell for any given year");
	        int input=sc.nextInt();
	        hm.forEach((k,v)->System.out.println("Year is "+k +" sell is "+v));
	        
	        System.out.println(hm.get(input));
	        
	    }
	}
	
