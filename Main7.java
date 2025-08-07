import java.util.ArrayList;
class Main7
{
    public static void main()
    {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        System.out.println("====Printing Current Array===");
        System.out.println(animals);
        animals.clear();
        System.out.println("===Printing Current Array====");
        System.out.println("Empty Array:"+animals);
        if (animals.isEmpty())
        {
            System.out.println("Array is empty");
            
        }
        else{
             System.out.println("arrray is not empty");
             
        }
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        System.out.println("size of array:"+animals.size());
        System.out.println("adding more elements:"+animals.add("Dog"));
        System.out.println(animals);
        animals.remove(2);
        System.out.println(animals);
    }
}