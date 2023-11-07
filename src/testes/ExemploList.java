package testes;

import testes.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Bob",19,1L);
        Pessoa pessoa2 = new Pessoa("Luca",29,2L);
        Pessoa pessoa3 = new Pessoa("Jose",16,3L);
        Pessoa pessoa4 = new Pessoa("Pedro",18,4L);
        Pessoa pessoa5 = new Pessoa("Leleu",22,5L);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        listaDePessoas.add(pessoa4);
        listaDePessoas.add(pessoa5);


//        listaDePessoas.stream().
//                filter(pessoa -> pessoa.getIdade() > 18).
//                map(Pessoa::getNome).sorted().forEach(System.out::println);

         int idades = listaDePessoas.stream().filter(p -> p.getIdade() > 17).mapToInt(Pessoa::getIdade).sum();

        System.out.println(idades);
    }

}
