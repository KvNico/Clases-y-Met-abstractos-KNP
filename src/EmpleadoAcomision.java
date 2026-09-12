public class EmpleadoAcomision extends Empleado{
    private int clientesCaptados;
    private double comisionPorCliente;

    private static final double MONTO_MINIMO = 800000.0;

    public EmpleadoAcomision(String nombre, int clientesCaptados, double comisionPorCliente) {
        super(nombre);
        this.clientesCaptados = clientesCaptados;
        this.comisionPorCliente = comisionPorCliente;
    }

    @Override
    public double calcularPago(){
        double pagoCalculado = clientesCaptados * comisionPorCliente;

        if(pagoCalculado < MONTO_MINIMO){
            return MONTO_MINIMO;
        }

        return pagoCalculado;
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public double getComisionPorCliente() {
        return comisionPorCliente;
    }
}
