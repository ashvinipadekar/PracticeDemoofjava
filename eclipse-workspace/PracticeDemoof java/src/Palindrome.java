
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int r;
		int sum=0;
		int no=454;
		int temp;
		System.out.println("no  is="+no);
		temp=no;
		while(no>0)
		{
			r=no%10;
			sum=(sum*10)+r;
			no=no/10;
			
		}
		
if(temp==sum)
{
System.out.println("no is palindrme");

}
else
{
	System.out.println("no is not  palindrme");

	}
	}

}
