package Agregacion;

public class Factura {
    private String numeroDeLaFactura;
    private String fecha;
    Product product;

    public Factura(String numeroDeLaFactura, String fecha, Product product) {
        this.numeroDeLaFactura = numeroDeLaFactura;
        this.fecha = fecha;
        this.product = product;
    }
}
