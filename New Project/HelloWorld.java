import java.util.*;

//this example demonstrates how to to use a
//while loop to average all of the digits of a number

public class HelloWorld{
	public static int countDigits( int num ){
		int cnt = 0;
		while( num > 0 )
		{
		   cnt++;
		   num = num / 10;
		}
		return cnt;
	}

	public static double sumDigits( int num ){
		double total = 0;
		while( num > 0 )
		{
		   total = total + num % 10;
		   num = num / 10;
		}
		return total;
	}
	public static double averageDigits( int num ){
		if( num > 0 )
			  return sumDigits( num ) / countDigits( num );
	  return 0;
	}

   public static void main(String args[]){
		Scanner scan = new Scanner( System.in );
		System.out.print( "Enter a number > 0 :: " );
		int num = scan.nextInt();
		System.out.println("The digit average is " + averageDigits( num) );
	}
}
