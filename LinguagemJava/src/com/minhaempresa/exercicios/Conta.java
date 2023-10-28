package com.minhaempresa.exercicios;

import com.minhaempresa.exemplo.Tipo;

public abstract class Conta {
    protected String identificadorConta;//sendo protected as classes filhas também poderão acessar esse atributo.
    protected double saldo;
    protected Tipo tipo;

    public void depositar(double deposito) {
        saldo += deposito;//poderia fazer também saldo = saldo + deposito;
    }

    public void sacar(double saque) {
        if(saldo - saque < 0 ) {
            //Garante que não será possível sacar mais do que tem no saldo.
            //Existe uma forma mais robusta, mas você ainda não aprendeu, veremos mais adiante...
            return;
        }
        saldo -= saque;//poderia fazer também saldo = saldo - saque;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "identificadorConta='" + identificadorConta + '\'' +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
