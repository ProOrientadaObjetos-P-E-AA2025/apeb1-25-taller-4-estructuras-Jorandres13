
import java.util.Scanner;


public class Ejectutar_Problema1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        
        int n;
        double p;
        
        System.out.println("---------------");
        System.out.println("Ingrese los datos");
        System.out.println("---------------");
        System.out.print("Ingrese el precio del producto: ");
        p = tcl.nextDouble();
        System.out.print("Ingrese el numero de productos: ");
        n = tcl.nextInt();
        
        Problema1_aplicacionDeIf venta = new Problema1_aplicacionDeIf(n,p);
        
        venta.calcularDescuento();
        venta.calcularPrecioFinal();
        
        System.out.println("El precio final del producto: " + venta.getPrecioFinal() + " con un descuento del: " + venta.getDescuento());
    }
}
