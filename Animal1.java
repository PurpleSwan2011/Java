class Animal1{
    public static void main(String args[]){
        BabyLion obj=new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}
class Animal1{
    void eat(){
        System.out.println("eating...Animal Class....eat method");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("roar....lion class...roar method");
    }
}
class BabyLion extends Lion{
    void weep(){
        System.out.println("weeping......babylion class..weep method");
    }
}