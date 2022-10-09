import java.util.Scanner;
interface AdvancedArithmetic
{
int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
public int divisor_sum(int n)
{
if(n<=1)
return n;

int s=n+1;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
s=s+i;
}
}
return s;
}
}

class Demo
{
public static void main(String...a)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the value");
int n=in.nextInt();
MyCalculator m=new MyCalculator();
int sum=m.divisor_sum(n);
System.out.println("Sum is "+sum);
}
}

