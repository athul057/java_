public class Main {
    public static void main(String[] args){

        double temp=rent(1000,100000);
        System.out.println(temp);
    }


    public static double rent(double n1,double n2){
        double n3=n1*12;

        return (n3/n2)*100;
    }
}