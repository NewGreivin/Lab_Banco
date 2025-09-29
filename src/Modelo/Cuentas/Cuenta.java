package Modelo.Cuentas;

import Modelo.Clientes.Cliente;
import java.util.Objects;

public abstract class Cuenta {
    protected String numeroCuenta;
    protected Cliente titular;
    protected double saldo;
    protected boolean estado;

    public String getNumeroCuenta() { return numeroCuenta; }
    public Cliente getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public boolean isEstado() { return estado; }

    public void setEstado(boolean estado) { this.estado = estado; }

        public Cuenta(String numeroCuenta, Cliente titular, double saldo) {
        this.numeroCuenta = Objects.requireNonNull(numeroCuenta, "El número de cuenta no puede ser nulo");
        this.titular = Objects.requireNonNull(titular, "El titular no puede ser nulo");
        this.saldo = saldo;
        this.estado = true;
    }

    @Override
    public String toString() {
        return "Cuenta: " + "numeroCuenta: " + numeroCuenta + ", titular: " + titular + ", saldo: " + saldo + ", estado: " + estado;
    }
        
    public void depositar(double monto) {
        if (!estado) throw new IllegalStateException("La cuenta no está activa");
        if (monto <= 0) throw new IllegalArgumentException("Monto inválido");
        saldo += monto;
    }

    public void retirar(double monto) {
        if (!estado) throw new IllegalStateException("La cuenta no está activa");
        if (monto <= 0) throw new IllegalArgumentException("Monto inválido");
        if (saldo < monto) throw new IllegalStateException("Saldo insuficiente");
        saldo -= monto;
    }

    public abstract String getTipo();
}