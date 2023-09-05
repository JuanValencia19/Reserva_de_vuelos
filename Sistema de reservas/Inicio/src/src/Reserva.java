package src;

public class Reserva {
    private String numReserva;
    private Vuelo vuelo;
    private Usuario usuario; 
    private int numAsiento;

    public Reserva(String numReserva, Vuelo vuelo, Usuario usuario, int numAsiento) {
        this.numReserva = numReserva;
        this.vuelo = vuelo;
        this.usuario = usuario;
        this.numAsiento = numAsiento;

        // Decrementar el número de asientos disponibles en el vuelo
        vuelo.bookSeat();
    }

    // Getters y Setters
    public String getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(String numReserva) {
        this.numReserva = numReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
}
