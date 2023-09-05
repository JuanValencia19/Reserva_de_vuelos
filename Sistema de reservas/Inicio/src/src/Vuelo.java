package src;

public class Vuelo {
    private String numeroVuelo;
    private String salidaUbicacion;
    private String llegadaUbicacion;
    private String horaSalida;
    private String horaLlegada;
    private int asientoCapacidad;
    private int asientoDisponibles; // No debe ser static

    // Constructor
    public Vuelo(String numeroVuelo, String salidaUbicacion, String llegadaUbicacion, String horaSalida, String horaLlegada, int asientoCapacidad) {
        this.numeroVuelo = numeroVuelo;
        this.salidaUbicacion = salidaUbicacion;
        this.llegadaUbicacion = llegadaUbicacion;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.asientoCapacidad = asientoCapacidad;
        this.asientoDisponibles = asientoCapacidad; // Al inicio, todos los asientos están disponibles
    }

    // Getters and Setters
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getSalidaUbicacion() {
        return salidaUbicacion;
    }

    public void setSalidaUbicacion(String salidaUbicacion) {
        this.salidaUbicacion = salidaUbicacion;
    }

    public String getLlegadaUbicacion() {
        return llegadaUbicacion;
    }

    public void setLlegadaUbicacion(String llegadaUbicacion) {
        this.llegadaUbicacion = llegadaUbicacion;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getAsientoCapacidad() {
        return asientoCapacidad;
    }

    public void setAsientoCapacidad(int asientoCapacidad) {
        this.asientoCapacidad = asientoCapacidad;
    }

    public int getAsientosDisponibles() {
        return asientoDisponibles;
    }

    // Este método se llamaría al hacer una reserva para reducir el número de asientos disponibles
    public void bookSeat() {
        if (asientoDisponibles > 0) {
            asientoDisponibles--;
        } else {
            System.out.println("No hay asientos disponibles para este vuelo.");
        }
    }
}