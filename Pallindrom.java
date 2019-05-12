public class Pallindrom {

	public static void main(String[] args) {
		String str="madam";
		int n=str.length();
		String temp=str;
		String reverse="";
		for(int i=n-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
			
		}
		if(temp.equals(reverse))
		{
			System.out.println(str+"it is pallindrom");
		}
		else
		{
			System.out.println(str+"it is not  pallindrom");
		}

	}

}
