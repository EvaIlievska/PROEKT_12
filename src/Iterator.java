import java.util.Scanner;

public class Iterator {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int i,n;
			System.out.print("Do brojot");
			n=input.nextInt();
			i=1;
			while(i<=n)
			{
				if(i%5==0)
				{
				System.out.print(i);
				}
				i=i+1;
			}
		}
			
	}

}