class Base 
{     
protected void foo() 
{
System.out.println("b");
} 
}  
class Derived extends Base 
{     
void foo() 
{
System.out.println("d");
} 
}  
class Main 
{     
public static void main(String args[]) 
{         
Derived d = new Derived();         
d.foo();     
} 
}