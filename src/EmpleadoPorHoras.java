public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double precioHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double precioHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * precioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPrecioHora() {
        return precioHora;
    }
}
