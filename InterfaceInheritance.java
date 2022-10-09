//interface inheritance
interface Printable
{
void print();
}

interface Drawable extends Printable

{
//as drawable is child of printable so print() is inherited in drawable from printable
void draw();
}


class Square implements Drawable//both print() and draw() will be overriden in square class
{
public void print()
{
System.out.println("Print Square");
}
public void draw()
{
System.out.println("Draw Square");
}
}

class Demo
{
public static void main(String...a)
{
Square s=new Square();
s.print();
s.draw();
}
}