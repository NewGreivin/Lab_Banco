package Vista.Cuentas;

public interface IVistaMovimientos {
    void mostrarMensaje(String mensaje, String titulo);
    void mostrarError(String mensaje);
    boolean confirmar(String mensaje, String titulo);
}