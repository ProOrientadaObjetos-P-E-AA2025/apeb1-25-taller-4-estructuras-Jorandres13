
import java.util.Scanner;


public class Ejecutar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables 
        double sP = 0, salprom;
        int cantEmple, aS;

        //arreglos donde se guarda para cambiar los salarios
        String[] nom;
        double[] sal;
        int[] eda;

        System.out.println("Ingrese cuantos empleados registrara: ");
        cantEmple = sc.nextInt();
        System.out.println("Ingrese el aumento salarial en porcentaje: ");
        aS = sc.nextInt();

        //tamaño de los arreglos
        nom = new String[cantEmple];
        sal = new double[cantEmple];
        eda = new int[cantEmple];

        for (int i = 0; i < cantEmple; i++) {
            sc.nextLine();
            //Ingreso de Datos
            System.out.println("-------------------------");
            System.out.println("Ingrese datos del Empleado");
            System.out.println("-------------------------");
            System.out.print("Ingrese el nombre: ");
            nom[i] = sc.nextLine();
            System.out.print("Ingrese la edad: ");
            eda[i] = sc.nextInt();
            System.out.print("Ingrese el salario: ");
            sal[i] = sc.nextDouble();
            sP += sal[i];

            Problema2_aplicacionDeCiclos emp = new Problema2_aplicacionDeCiclos(nom[i], sal[i], eda[i]);

            System.out.println(emp);

        }
        System.out.println("----------------------");
        System.out.println("Salarios Modificados");
        Problema2_aplicacionDeCiclos emp1 = new Problema2_aplicacionDeCiclos();
        //calculamos el salario promedio 
        emp1.calcularSalarioPromedio(cantEmple, sP);
        salprom = emp1.getSalarioPromedio();
        for (int i = 0; i < cantEmple; i++) {
            Problema2_aplicacionDeCiclos emp2 = new Problema2_aplicacionDeCiclos(nom[i], sal[i], eda[i]);
            //calculamos si necesita aumento de sueldo 
            emp2.calcularAumentoSalario(aS, sal[i], salprom);
            sal[i] = emp2.getSalarioAumentado();

            System.out.println(emp2);
        }

    }

}

