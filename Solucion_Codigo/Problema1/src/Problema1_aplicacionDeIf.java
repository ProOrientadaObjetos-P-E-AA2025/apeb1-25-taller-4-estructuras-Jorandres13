
public class Problema1_aplicacionDeIf {

    private int numProductos;
    private double precio;
    private double descuento;
    private double precioFinal;

    public Problema1_aplicacionDeIf(int numProductos, double precio) {
        this.numProductos = numProductos;
        this.precio = precio;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public  double getDescuento() {
        return descuento;
    }
    
    public double getPrecioFinal() {
        return precioFinal;
    }

    public void calcularDescuento() {
        if ((precio >= 1000) && (numProductos >= 10)) {
            descuento = 0.10;
        }
        if (precio < 1000) {
            descuento = 0.05;
        }
    }
    
    public void calcularPrecioFinal(){
        precioFinal = (precio * numProductos) -((precio * numProductos) * descuento);
    }
    

}
