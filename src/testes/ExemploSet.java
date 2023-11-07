package testes;

import testes.entities.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args) {


        Set<Pessoa> listaDePessoas = new HashSet<>();

        Pessoa pessoa1 = new Pessoa("Lobao",11, 1L);
        Pessoa pessoa2 = new Pessoa("Lobao", 22,1L);

        listaDePessoas.add(pessoa1);
        boolean add = listaDePessoas.add(pessoa2);


        if (add){
            System.out.println("Adicionado");
        }else {
            System.out.println("Nao adicionado");
        }


        for (Pessoa pessoa: listaDePessoas
             ) {
            System.out.println(
                    pessoa.getNome());
        }

    }
}
