interface Left
{
public void m1();
}

class Demo
{
public static void main(String[] args)
{
Left left=()->{System.out.println("hi")}
;
left.m1();
}
}
