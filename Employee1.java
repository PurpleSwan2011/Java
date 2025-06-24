class employee {
        int empno;
        String name;
        float sal;  
        employee(){
        System.out.println("*****");
        empno=101;
              name="aashish";
              sal=5000f;
        }     
        void displayDetails(){
            System.out.println(empno+"|"+name+"|"+sal);

        }
}
class Main
{
    public static void main(String[]args)
    {
        employee emp1=new employee();
        employee emp2 = new employee();
        employee emp3 = new employee();
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}