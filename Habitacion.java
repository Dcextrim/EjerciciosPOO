public class Habitacion {

    private int numero;
    private int capacidad;
    private float precio;
    private Cliente cliente;

    public Habitacion(int numero2, int capacidad2, float precio2) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", capacidad=" + capacidad +
                ", precio=" + precio +
                ", cliente=" + cliente +
                '}';
    }
}