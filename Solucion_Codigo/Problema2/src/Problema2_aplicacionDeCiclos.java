
public class Problema2_aplicacionDeCiclos {

    private String nombre;
    private double salario, salarioPromedio;
    private int edad;

    public Problema2_aplicacionDeCiclos(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public Problema2_aplicacionDeCiclos() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public void calcularSalarioPromedio(int cant, double sumSal) {
        salarioPromedio = sumSal / cant;
    }

    public void calcularAumentoSalario(int porAum, double salario, double salprom) {
        if (salario < salprom) {
            this.salario = salario + ((salario * porAum) / 100);
        }
    }

    public double getSalarioPromedio() {
        return salarioPromedio;
    }

    public double getSalarioAumentado() {
        return salario;
    }

    @Override
    public String toString() {
        return ("El Empleado " + "nombre: " + nombre
                + " ,edad: " + edad
                + " y su salario es: " + salario);
    }

}


