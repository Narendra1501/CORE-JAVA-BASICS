package javabasicsday20;

    import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class ExceptionExample {


		public static void main(String[] args)throws IOException
		{
			int a,b;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the values:");
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			try {
			int c=a/b;//may be exception occurs in runtime- throw the exception to catch block/=
			System.out.println("Division:"+c);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Exception occurs:"+ae);
				System.out.println("please enter positive numbers....");
			}
			System.out.println("nextline");
			
		}

	}


