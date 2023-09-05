package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Usuario {
    private String nombreUsuario;
    private String numeroPasaporte;
    private List<Reserva> reservas = new ArrayList<>();

    public Usuario(String nombreUsuario, String numeroPasaporte) {
        this.nombreUsuario = nombreUsuario;
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getNombreUsuario() {
        return "Su usuario es: " + this.nombreUsuario;
    }

    public void setNombreUsuario(String nuevoUsuario) {
        this.nombreUsuario = nuevoUsuario;
    }

    public String getNumeroPasaporte() {
        return "Su numero de pasaporte es: " + this.numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public Iterator<Reserva> getReservasIterator() {
        return reservas.iterator();
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    // Agregar reserva a la lista de reservas del pasajero
    public void agregarReserva(Reserva reservation) {
        if (reservas != null) {
            reservas.add(reservation);
        }
    }

    // Eliminar una reserva de la lista de reservas del pasajero
    public void eliminarReserva(Reserva reservation) {
        if (reservas != null && reservas.contains(reservation)) {
            reservas.remove(reservation);
        }
    }
}
