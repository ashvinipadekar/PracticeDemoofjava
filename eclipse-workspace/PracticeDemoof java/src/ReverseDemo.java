
public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// by using reverse fn
		
		//String s="ashvini";
		//StringBuilder ab=new StringBuilder(s);
		//String sr=ab.reverse().toString();
		
		//System.out.println("reverse string is"+sr);
		
		
		
		// without using reverse fn
		
		
		String reverse="";
		String str="ashvinidatta";
		char [] arr=str.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
		   
			reverse = reverse + str.charAt(i); 
			
		}
		System.out.println("reverse string is  "+reverse);
		
	}

}
