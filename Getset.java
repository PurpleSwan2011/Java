class Getset{
    public static void main(){
        Student s=new Student();
        s.setName("Saima @Codingal");
        System.out.println(s.getName());
    }
}
class Student{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
}