public class Bailarin {
    private String nombre;
    private int tiempoBaile;
    private boolean bailando;

    // Constructor
    public Bailarin(String nombre) {
        this.nombre = nombre;
        this.tiempoBaile = 10; // Tiempo máximo de baile inicial
        this.bailando = false;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getTiempoBaile() {
        return tiempoBaile;
    }

    public void setTiempoBaile(int tiempoBaile) {
        this.tiempoBaile = tiempoBaile;
    }

    public boolean isBailando() {
        return bailando;
    }
    public void setBailando(boolean isBailando ){
        this.bailando = isBailando;
    }
}

