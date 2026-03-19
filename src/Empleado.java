public class Empleado {
    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(int edad, String nombre, double salarioBase) {
        this.edad = edad;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Salario Base: "+ salarioBase);
    }
    public double calcularSalario() {
        return salarioBase;
    }
}
