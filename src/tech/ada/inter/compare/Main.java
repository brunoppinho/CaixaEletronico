package tech.ada.inter.compare;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Avaliacao> avaliacoes = new ArrayList<>();
        avaliacoes.add(new Avaliacao(10, 3));
        avaliacoes.add(new Avaliacao(1, 2));
        avaliacoes.add(new Avaliacao(5, 5));
        // objeto a
        // objeto b
        // a < b => -1
        // a > b => 1
        // a = b => 0
        // a.compareTo(b)
        avaliacoes.stream().sorted().forEach(avaliacao -> System.out.println(avaliacao));
    }
}
