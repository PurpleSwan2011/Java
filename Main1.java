 class Main1 {
    public static void main(String[]args){
        String first="Cod";
        String second="ingal";
        String codingal=first+second;
        String codingalTrick="welcome"+"to"+"codingal";
        String codingalCapital=codingal.toUpperCase();
        String codingalSmall=codingalCapital.toLowerCase();
        int lengthOfCodingal=codingal.length();
        int lengthOfCodingalTrick=codingalTrick.length();
        int sum=lengthOfCodingal+lengthOfCodingalTrick;
        System.out.println(codingal);
        System.out.println(codingalTrick);
        System.out.println(codingalCapital);
        System.out.println(codingalSmall);
        System.out.println(sum);
    }
}
