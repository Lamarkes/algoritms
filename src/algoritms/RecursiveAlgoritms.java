package algoritms;

import java.util.HashMap;
import java.util.List;

public class RecursiveAlgoritms {


    public int fibonacci(int num){ // 5
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public int fibonacciSave(int num) {

        HashMap<Integer,Integer> saves = new HashMap<>();
        saves.put(0,0); // caso de base
        saves.put(1,1); // caso de base

        if (!saves.containsKey(num)){
            saves.put(num, fibonacciSave(num - 1) + fibonacciSave(num - 2));

        }
        return saves.get(num);
    }


    public int fatorial(int num){

        if (num ==0 || num ==1){
            return 1;
        }
        return num * fatorial(num - 1);
    }
}


