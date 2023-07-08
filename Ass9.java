package Ass;

// presence of character or not
public class Ass9 {

	public static void main(String[] args) {
		
		String s="Umbrella";
		char [] c=s.toCharArray();
		int flag=0;
		for(char r:c)
		{
			if(r=='e')
			{
				System.out.println("it is present");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("not present");
	}
}
