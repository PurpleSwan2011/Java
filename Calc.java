class Calc {
    public static void main(String[] args){
      int a=10;
          int b=5;
          int sum=a+b;
          int diff=a-b;
          int mult=a*b;
          int div=a/b;
          String magic="============Magic===========";
          System.out.println("=======method1========");
          System.out.println("addition of a&b:"+sum);
          System.out.println("subtraction of a&b:"+diff);
          System.out.println("multiplication of a&b:"+mult);
          System.out.println("division of a&b:"+div);
          System.out.println("========method2=====");
          System.out.println("addition of a&b:"+(a+b));
          System.out.println("subtraction of a&b:"+(a-b));
          System.out.println("multiplication of a&b:"+(a*b));
          System.out.println("division of a&b:"+(a/b));
          System.out.println("remainder:"+(a%b));
          System.out.println(magic);
          System.out.println("addition:"+
          
          (a+b)+"subtraction:"+(a-b)+"multiplication:"+(a*b)+"division"+(a/b));
    }
}