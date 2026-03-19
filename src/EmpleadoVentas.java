public class EmpleadoVentas extends Empleado{
    private double Totaldeventas;
    private double comision;

    public EmpleadoVentas(int edad1, String nombre1, double salarioBase1, double base1, double comision, double totaldeventas) {
    }

    public EmpleadoVentas(double comision, double totaldeventas) {
        this.comision = comision;
        Totaldeventas = totaldeventas;
    }

    public EmpleadoVentas(int edad, String nombre, double salarioBase, double comision, double totaldeventas) {
        super(edad, nombre, salarioBase);
        this.comision = comision;
        Totaldeventas = totaldeventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getTotaldeventas() {
        return Totaldeventas;
    }

    public void setTotaldeventas(double totaldeventas) {
        Totaldeventas = totaldeventas;
    }

    @Override
    public String toString() {
        return super.toString()+ "EmpleadoVentas{" +
                "comision=" + comision +
                ", Totaldeventas=" + Totaldeventas +
                '}';
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Salario Base: "+ salarioBase);
        System.out.println("Total ventas: "+ Totaldeventas);
        System.out.println("Comision: "+ comision);
    }
    @Override
    public double calcularSalario() {
        return salarioBase + (Totaldeventas * comision);
    }
}
