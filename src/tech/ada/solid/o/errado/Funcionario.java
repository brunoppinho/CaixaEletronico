package tech.ada.solid.o.errado;

public class Funcionario {

    private double valorHora;
    private double horasMensaisContratuais;
    private double horasMensaisTrabalhadas;

    private String tipo;

    public Funcionario(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, String tipo) {
        this.valorHora = valorHora;
        this.horasMensaisContratuais = horasMensaisContratuais;
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getHorasMensaisTrabalhadas() {
        return horasMensaisTrabalhadas;
    }

    public void setHorasMensaisTrabalhadas(double horasMensaisTrabalhadas) {
        this.horasMensaisTrabalhadas = horasMensaisTrabalhadas;
    }
}
