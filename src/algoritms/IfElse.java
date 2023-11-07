package algoritms;

public class IfElse {

    public static void ifElse(int N){
        if(N % 2 != 0){
            System.out.println("Weird");
        }else if(N % 2 == 0 && (N>=6 && N < 20)){
            System.out.println("Not Weird");
        }else if(N % 2 == 0 && N >= 20){
            System.out.println("Weird");
        }else if(N % 2 ==0 && (N>=2 && N <= 5)){
            System.out.println("Not Weird");
        }
    }

    public static class Main{
        public static void main(String[] args) {
            ifElse(20);
        }
    }
}
