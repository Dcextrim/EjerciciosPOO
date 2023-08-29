import java.util.ArrayList;

public class Controlador {

    public ArrayList<Habitacion> habitaciones;
    public ArrayList<Cliente> clientes;

    public Controlador() {
        this.habitaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void asignarClienteAhabitacion(Cliente cliente) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getCapacidad() >= cliente.getNumeroReservas()) {
                habitacion.setCliente(cliente);
                break;
            }
        }{
            clientes.add(cliente);
        }
    }

    public void mostrarListaEspera() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void ingresarHabitacion() {
        // Solicitamos los datos de la habitación
        System.out.println("Ingrese el número de la habitación: ");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese la capacidad de la habitación: ");
        int capacidad = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el precio de la habitación: ");
        float precio = Float.parseFloat(System.console().readLine());

        // Creamos la nueva habitación
        Habitacion habitacion = new Habitacion(numero, capacidad, precio);

        // Agregamos la habitación al arreglo de habitaciones disponibles
        habitaciones.add(habitacion);
    }

    public void ingresarCliente() {
        // Solicitamos los datos del cliente
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = System.console().readLine();
        System.out.println("Ingrese el tipo de cliente: ");
        Cliente.Tipo tipo = Cliente.Tipo.valueOf(System.console().readLine());
        System.out.println("Ingrese el número de reservas del cliente: ");
        int numeroReservas = Integer.parseInt(System.console().readLine());

        // Creamos el nuevo cliente
        Cliente cliente = new Cliente(nombre, tipo, numeroReservas);

        // Agregamos el cliente al arreglo de clientes
        clientes.add(cliente);
    }

    public void recibirHuesped() {
        // Solicitamos los datos del huésped
        System.out.println("Ingrese el nombre del huésped: ");
        String nombre = System.console().readLine();
    
        // Buscamos al cliente en la lista de espera
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                // Si encontramos al cliente, lo asignamos a una habitación
                asignarClienteAhabitacion(cliente);
                break;
            }
        }
    }
}