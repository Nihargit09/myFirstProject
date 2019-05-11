public class Pallindrom {

	public static void main(String[] args) {
		String str="madam";
		int n=str.length();
		String temp=str;
		
		String rev="";
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		if(temp.equals(rev))
		{
			System.out.println(str+"it is pallindrom");
		}
		else
		{
			System.out.println(str+"it is not  pallindrom");
		}

	}

}
