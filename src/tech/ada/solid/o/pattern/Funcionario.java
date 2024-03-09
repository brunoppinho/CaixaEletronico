package tech.ada.solid.o.pattern;

public class Funcionario {

    private double valorHora;
    private double horasMensaisContratuais;
    private double horasMensaisTrabalhadas;

    public Funcionario(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas) {
        this.valorHora = valorHora;
        this.horasMensaisContratuais = horasMensaisContratuais;
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasMensaisContratuais() {
        return horasMensaisContratuais;
    }

    public void setHorasMensaisContratuais(double horasMensaisContratuais) {
        this.horasMensaisContratuais = horasMensaisContratuais;
    }

    public double getHorasMensaisTrabalhadas() {
        return horasMensaisTrabalhadas;
    }

    public void setHorasMensaisTrabalhadas(double horasMensaisTrabalhadas) {
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
    }

}
