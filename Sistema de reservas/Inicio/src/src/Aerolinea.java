package src;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aerolinea {
  private List<Vuelo> vuelos;
  private List<Reserva> reservas;
  private List<Usuario> usuarios;

  // Constructor
  public Aerolinea() {
    vuelos = new ArrayList<>();
    reservas = new ArrayList<>();
    usuarios = new ArrayList<>();
  }

  // Métodos para obtener iteradores de las listas
   public Iterator<Usuario> getUsuarioIterator() {
    return usuarios.iterator();
  }

  public Iterator<Vuelo> getVuelosIterator() {
    return vuelos.iterator();
  }

  public Iterator<Reserva> getReservasIterator() {
    return reservas.iterator();
  }

  // Métodos para agregar y eliminar vuelos
  public void agregarVuelo(Vuelo vuelo) {
    vuelos.add(vuelo);
  }

  public void eliminarVuelo(Vuelo vuelo) {
    vuelos.remove(vuelo);
  }

  // Métodos para agregar y eliminar reservas
  public void agregarReservas(Reserva reserva) {
    reservas.add(reserva);
  }

  public void eliminarReserva(Reserva reserva) {
    reservas.remove(reserva);
  }
}
