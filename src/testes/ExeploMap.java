package testes;

import testes.entities.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class ExeploMap {

    public static void main(String[] args) {

        Map<Long, Pessoa> listaDePessoas = new HashMap<>();



        Pessoa joao = new Pessoa("Joao", 22,1L);

        listaDePessoas.put(1L,joao);

    }
}
