//this keyword refer to class instance
class Test
{
int a;
int b;

Test(int a,int b)
{
this.a=a;
this.b=b;
}
void display()
{
System.out.println(a+" "+b);
}
}
class Demo
{
public static void main(String...args)
{
Test t=new Test(10,20);
t.display();
}
}