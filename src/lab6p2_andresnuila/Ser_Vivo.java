package lab6p2_andresnuila;

public class Ser_Vivo {

    private String nombre, anios, planeta, raza;
    private int poder;

    public Ser_Vivo() {
    }

    public Ser_Vivo(String nombre, int poder, String anios, String planeta, String raza) {
        this.nombre = nombre;
        this.anios = anios;
        this.planeta = planeta;
        this.raza = raza;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAños() {
        return anios;
    }

    public void setAños(String anios) {
        this.anios = anios;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", años=" + anios + ", planeta=" + planeta + ", raza=" + raza + ", poder=" + poder;
    }

}
