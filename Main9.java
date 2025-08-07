import java.util.ArrayList;
class Main9 {
  public static void main() {
        String b = "Java";
    // create an ArrayList
    ArrayList<String> languages = new ArrayList<>();

    // add elements to the ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");

    // print arraylist
    System.out.print("ArrayList: \n");

    // iterate over each element of arraylist
    // using forEach() method
    languages.forEach((e) -> {
      System.out.println(e);
    });
    languages.forEach((n) -> {
      if(n.equals(b))
      System.out.println("Java is Found");
    });
  }
}