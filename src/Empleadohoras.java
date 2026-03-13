public class Empleadohoras extends Empleado{
    private int Horastarabajadas;
    private double valorhora;

    public Empleadohoras(int edad, String nombre, double salarioBase, double bonificacion) {
    }

    public Empleadohoras(int horastarabajadas, double valorhora) {
        Horastarabajadas = horastarabajadas;
        this.valorhora = valorhora;
    }

    public Empleadohoras(int edad, String nombre, double salarioBase, int horastarabajadas, double valorhora) {
        super(edad, nombre, salarioBase);
        Horastarabajadas = horastarabajadas;
        this.valorhora = valorhora;
    }

    public int getHorastarabajadas() {
        return Horastarabajadas;
    }

    public void setHorastarabajadas(int horastarabajadas) {
        Horastarabajadas = horastarabajadas;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleadohoras{" +
                "Horastarabajadas=" + Horastarabajadas +
                ", valorhora=" + valorhora +
                '}';
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Salario Base: "+ salarioBase);
        System.out.println("Horas trabajadas: "+ Horastarabajadas);
        System.out.println("Valor Hora: "+ valorhora);
    }
}
