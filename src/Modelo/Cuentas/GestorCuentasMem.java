package Modelo.Cuentas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorCuentasMem implements IGestorCuentas {
    private final HashMap<String, Cuenta> cuentas;
    private static GestorCuentasMem instancia;
    
    private GestorCuentasMem() {
        cuentas = new HashMap<>();
    }

    public static GestorCuentasMem getInstancia() {
        if (instancia == null) {
            instancia = new GestorCuentasMem();
        }
        return instancia;
    }

    @Override
    public void guardar(Cuenta cuenta) {
        if (cuentas.containsKey(cuenta.getNumeroCuenta()))
            throw new IllegalStateException("Ya existe una cuenta con ese número");
        cuentas.put(cuenta.getNumeroCuenta(), cuenta);
    }

    @Override
    public void actualizarEstado(String numeroCuenta, boolean activa) {
        Cuenta cuenta = buscar(numeroCuenta);
        cuenta.setEstado(activa);
    }

    @Override
    public void eliminar(String numeroCuenta) {
        Cuenta cuenta = buscar(numeroCuenta);
        if (cuenta.getSaldo() != 0)
            throw new IllegalStateException("Solo se pueden eliminar cuentas con saldo 0");
        cuentas.remove(numeroCuenta);
    }

    @Override
    public Cuenta buscar(String numeroCuenta) {
        Cuenta cuenta = cuentas.get(numeroCuenta);
        if (cuenta == null) throw new IllegalArgumentException("No existe la cuenta");
        return cuenta;
    }

    @Override
    public boolean existe(String numeroCuenta) {
        return cuentas.containsKey(numeroCuenta);
    }

    @Override
    public List<Cuenta> listar() {
        return new ArrayList<>(cuentas.values());
    }
}