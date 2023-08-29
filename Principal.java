public class Principal {

    public static void main(String[] args) {
        Controlador Controlador = new Controlador();

        // Mostramos el menú
        int opcion;
        do {
            System.out.println("Menú");
            System.out.println("1. Ingresar habitación");
            System.out.println("2. Ingresar cliente");
            System.out.println("3. Recibir huésped");
            System.out.println("4. Mostrar lista de espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    Controlador.ingresarHabitacion();
                    break;
                case 2:
                    Controlador.ingresarCliente();
                    break;
                case 3:
                    Controlador.recibirHuesped();
                    break;
                case 4:
                    Controlador.mostrarListaEspera();
                    break;
            }
        } while (opcion != 5);
    }
}