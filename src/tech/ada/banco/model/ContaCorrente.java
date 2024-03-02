package tech.ada.banco.model;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    @Override
    public void setSaldo(BigDecimal saldo) {
        super.setSaldo(BigDecimal.TEN);
    }
}
