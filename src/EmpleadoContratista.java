public class EmpleadoContratista extends Empleado{
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoContratista(String nombre, int horasTrabajadas, double tarifaHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularPago(){
        return horasTrabajadas*tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
}
