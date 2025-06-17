public class Guess {
    public static void main(String[] args)
    {
        int a=10;
        int b=5;
    System.out.println("=====guess the answers===");
     System.out.println("unary operator"+(a++));
     System.out.println("unary operator"+(++b));;
     System.out.println("binary operator");
     System.out.println("1+2"+1+2);
     System.out.println("1+2"+(1+2));
     System.out.println(1+2+"=3");
     int increment=++a*b++;
     System.out.println(increment);
     System.out.println(";current value of a:"+a);
     System.out.println("current value of b:"+b);
     System.out.println("ternary operator");
    }
}
