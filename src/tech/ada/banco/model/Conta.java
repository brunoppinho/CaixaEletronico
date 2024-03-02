package tech.ada.banco.model;

import java.math.BigDecimal;

public class Conta {

    private Integer id;
    private BigDecimal saldo;
    private long numeroConta;
    private Pessoa titular;

    public Conta() {
        this.saldo = BigDecimal.valueOf(0);
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public Conta setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
