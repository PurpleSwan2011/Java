class Hillstation{
    public static void main(){
        Hillstation A=new Hillstation();
        Hillstation M=new Manali();
        Hillstation Mu=new Mussoorie();
        Hillstation G=new Gulmarg();
        A.location();
        A.famousfor();
        M.location();
        M.famousfor();
        Mu.location();
        Mu.famousfor();
        G.location();
        G.famousfor();
    }
}
class hillstations{
    void location(){
        System.out.println("location is:");
    }
    void famousfor(){
        System.out.println("famous for:");
    }
}
class Manali extends Hillstation{
    void location(){
        System.out.println("manali is in himachal pradesh");
    }
    void famousfor(){
        System.out.println("its foamous for hadimba");
    }
}
class Mussoorie extends Hillstation{
    void location(){
        System.out.println("mussoorie is in uttrakhand");
    }
    void famousfor(){
        system.out.println("its foamous for education");
    }
}