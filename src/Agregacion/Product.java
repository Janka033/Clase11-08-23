package Agregacion;

public class Product {
    private  String nombreDeProducto;
    private int valor;

    public Product(String nombreDeProducto, int valor) {
        this.nombreDeProducto = nombreDeProducto;
        this.valor = valor;
    }

    public String getNombreDeProducto() {
        return nombreDeProducto;
    }

    public void setNombreDeProducto(String nombreDeProducto) {
        this.nombreDeProducto = nombreDeProducto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
