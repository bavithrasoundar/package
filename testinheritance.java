import java.util.*;
class animal
{
void eat()
{
System.out.println("e...");
}
}
class dog extends animal
{
void bark()
{
System.out.println("d.....");
}
}
class testinheritance
{
public static void main(String[] args)
{
dog d=new dog();
d.eat();
d.bark();
}}