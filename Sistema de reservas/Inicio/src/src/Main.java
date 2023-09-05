package src;
import java.util.Iterator;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Crear una instancia de la aerolínea
        Aerolinea aerolinea = new Aerolinea();
        // Aqui podrias agregar tus reservas y vuelos

        Vuelo vuelo1 = new Vuelo("123", "Madrid", "New York", "12:00", "20:00", 200);
        Vuelo vuelo2 = new Vuelo("456", "London", "Tokyo", "10:00", "22:00", 250);

        aerolinea.agregarVuelo(vuelo1);
        aerolinea.agregarVuelo(vuelo2);

        // Crear algunos pasajeros
        Usuario pasajero1 = new Usuario("John Doe", "AB123456");
        Usuario pasajero2 = new Usuario("Jane Doe", "CD789012");

        // Crear reservas para los pasajeros y agregarlas a la aerolínea
        Reserva reserva1 = new Reserva("res1", vuelo1, pasajero1, 1);
        Reserva reserva2 = new Reserva("res2", vuelo2, pasajero1, 2);
        Reserva reserva3 = new Reserva("res3", vuelo1, pasajero2, 3);

        aerolinea.agregarReservas(reserva1);
        aerolinea.agregarReservas(reserva2);
        aerolinea.agregarReservas(reserva3);

        // Agregar las reservas a los pasajeros
        pasajero1.agregarReserva(reserva1);
        pasajero1.agregarReserva(reserva2);
        pasajero2.agregarReserva(reserva3);
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, selecciona una opción:");
            System.out.println("1. Ver todos los vuelos");
            System.out.println("2. Ver todas las reservas");
            System.out.println("3. Ver informacion usuario");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Utilizar el iterador para recorrer todos los vuelos
                    Iterator<Vuelo> vuelosIterator = aerolinea.getVuelosIterator();
                    while (vuelosIterator.hasNext()) {
                        Vuelo vuelo = vuelosIterator.next();
                        System.out.println("Vuelo: " + vuelo.getNumeroVuelo());
                        System.out.println("Salida de vuelo: " + vuelo.getSalidaUbicacion());
                        System.out.println("Llegada de Vuelo: " + vuelo.getLlegadaUbicacion());
                        System.out.println("Hora Salida: " + vuelo.getHoraSalida());
                        System.out.println("Hora Llegada: " + vuelo.getHoraLlegada());
                        
                    }
                    break;

                case 2:
                    // Utilizar el iterador para recorrer todas las reservas
                    Iterator<Reserva> reservasIterator = aerolinea.getReservasIterator();
                    while (reservasIterator.hasNext()) {
                        Reserva reserva = reservasIterator.next();
                        System.out.println("Reserva: " + reserva.getNumReserva());
                        System.out.println("Usuario: " + reserva.getUsuario());
                        System.out.println("Numero de asiento: " + reserva.getNumAsiento());
                        
                    }
                    break;

                case 3:
                // Utilizar el iterador para recorrer todas los usuarios
                     Iterator<Usuario> usuariosIterator = aerolinea.getUsuarioIterator();
                    while (usuariosIterator.hasNext()) {
                        Usuario usuario = usuariosIterator.next();
                        System.out.println("Usuario: " + usuario.getNombreUsuario());
                        System.out.println("Numero de Pasaporte: " + usuario.getNumeroPasaporte());
                    }
                case 4:
                    System.out.println("Gracias por utilizar nuestro sistema de reservaciones de vuelos!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida, por favor elige nuevamente");
            }
            System.out.println("Asientos disponibles en el vuelo " + vuelo1.getNumeroVuelo() + ": " + vuelo1.getAsientosDisponibles());
        }
    }
}
