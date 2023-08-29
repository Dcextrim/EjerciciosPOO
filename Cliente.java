public class Cliente {

    private String nombre;
    private Cliente.Tipo tipo;
    private int numeroReservas;

    public enum Tipo {
        REGULAR,
        FRECUENTE,
        VIP
    }

    public Cliente() {
        this.nombre = "";
        this.tipo = Tipo.REGULAR;
        this.numeroReservas = 0;
    }

    public Cliente(String nombre, Cliente.Tipo tipo, int numeroReservas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroReservas = numeroReservas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente.Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Cliente.Tipo tipo) {
        this.tipo = tipo;
    }

    public int getNumeroReservas() {
        return numeroReservas;
    }

    public void setNumeroReservas(int numeroReservas) {
        this.numeroReservas = numeroReservas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", numeroReservas=" + numeroReservas +
                '}';
    }
}