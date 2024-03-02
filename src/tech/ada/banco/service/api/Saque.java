package tech.ada.banco.service.api;

import java.math.BigDecimal;

public interface Saque {

    boolean executar(BigDecimal valor, int numerDaConta);
}
