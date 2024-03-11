package tech.ada.inter.compare;

public class Avaliacao implements Comparable<Avaliacao> {

    private Integer notaDeProva;
    private Integer avaliacaoPsicologica;

    @Override
    public String toString() {
        return "Avaliacao{" +
                "notaDeProva=" + notaDeProva +
                ", avaliacaoPsicologica=" + avaliacaoPsicologica +
                '}';
    }

    public Avaliacao(Integer notaDeProva, Integer avaliacaoPsicologica) {
        this.notaDeProva = notaDeProva;
        this.avaliacaoPsicologica = avaliacaoPsicologica;
    }

    @Override
    public int compareTo(Avaliacao o) {
        return this.notaDeProva > o.notaDeProva ? -1 : 1;
    }
}
