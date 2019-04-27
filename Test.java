public class Test
{
public void m1(int i)
{
System.out.println("hi");
}
public void m1(float f)
{
System.out.println("hello");
}
public static void main(String args[])
{
Test t=new Test();
t.m1(10);
t.m1(10.4f);
}
}
