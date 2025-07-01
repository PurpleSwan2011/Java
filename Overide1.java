class Overide1
{
    public static void main()
    {
        Parent p=new Child();
        p.sayHello();
    }
}
class Parent
{
    public static void main()
    {
        System.out.println("hello from parent");
        
    }
}
class Child extends Parent
{
     @Overide
    public void sayHello(){
       System.out.println("hello from child"); 
    }
}