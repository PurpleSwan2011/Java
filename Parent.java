
    class Parent
    {
        public static void main(String [] er)
        {
            Child s=new Child();
            s.naming("Saima");
            s.ageN(13);
        }
    }
 class Parent1
{
    
        int age,id;
        String name;
        void naming(String name)
        {
            System.out.println("Name:"+name);
            
        }
    }
    class Child extends Parent1
    {
        void ageN(int age)
        {
            System.out.println("Age of student is:"+age);
        
        }
    }