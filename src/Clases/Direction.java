package Clases;

public class Direction {
    private int numeroDeCalle;
    private String ciudad;
    private String departamento;
    private String pais;

    public int getNumeroDeCalle() {
        return numeroDeCalle;
    }

    public void setNumeroDeCalle(int numeroDeCalle) {
        this.numeroDeCalle = numeroDeCalle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Direction(int numeroDeCalle, String ciudad, String departamento, String pais) {
        this.numeroDeCalle = numeroDeCalle;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
    }
}
class studentClass extends Direction{
    int nullName;
    String name;
    public studentClass(int numeroDeCalle, String ciudad, String departamento, String pais) {
        super(numeroDeCalle, ciudad, departamento, pais);
    }

}
