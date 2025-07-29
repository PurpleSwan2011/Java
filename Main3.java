class Main3 implements MyInterface
{
    public static void main()
    {
        MyInterface obj=new Main();
        obj.method1();
        obj.method1();
    }
    public void method1()
    {
        System.out.println("implementation of method1");
    }
    public void method2()
    {
        System.out.println("implementation of method2");
    }
}
interface MyInterface
{
    public void method1();
    public void method2();
}