package main;

import algoritms.RecursiveAlgoritms;
import algoritms.SearchAlgoritms;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        RecursiveAlgoritms re = new RecursiveAlgoritms();
        SearchAlgoritms sa = new SearchAlgoritms();
       Scanner sc = new Scanner(System.in);

        // int[] list = {10, 5, 8, 2, 3, 7,22,34,568,23,2,1,6,20,33}; // lista nao ordenada
        int[] listOrder = {1,2,3,6,8,11,13,15,16,18,20,23,25,28,44,50}; // lista ordenada


        System.out.print("Qual numero deseja buscar: ");
        int value = sc.nextInt();

        var indice = sa.binarySearch(listOrder,value); // retorna o indicie

        if (indice != -1){
            System.out.println("O numero na lista esta no indice: "+ indice);
        }else{
            System.out.println(indice);
            System.out.println("O numero nao existe na lista");
        }

        /*System.out.println(re.fibonacci(5));
        System.out.println(re.fibonacciSave(8));
        System.out.println(re.fatorial(5));*/


    }
}

