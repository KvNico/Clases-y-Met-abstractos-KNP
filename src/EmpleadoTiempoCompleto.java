public class EmpleadoTiempoCompleto extends Empleado {
    private double sueldoBasico;
    private int antiguedad;

    public EmpleadoTiempoCompleto(String nombre, double sueldoBasico, int antiguedad) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularPago() {
        double porcentajeExtra = 0.0;

        if (antiguedad >= 2 && antiguedad <= 5) {
            porcentajeExtra = 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            porcentajeExtra = 0.10;
        } else if (antiguedad >= 11 && antiguedad <= 15) {
            porcentajeExtra = 0.15;
        } else if (antiguedad > 15) {
            porcentajeExtra = 0.20;
        }

        return sueldoBasico + (sueldoBasico * porcentajeExtra);
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
}
