public abstract class Arma {
    private Policia policia;
    private int cantidadMuniciones;
    private int alcanceMetros;
    private String marca;
    private int calibre;
    private String estado;

    // Constructor
    public Arma(Policia policia, int cantidadMuniciones, int alcanceMetros, String marca, int calibre, String estado) {
        this.policia = policia;
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    // Getters
    public Policia getPolicia() {
        return policia;
    }

    public int getCantidadMuniciones() {
        return cantidadMuniciones;
    }

    public int getAlcanceMetros() {
        return alcanceMetros;
    }

    public String getMarca() {
        return marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    // VERIFICACIÓN SI EL ARMA ESTÁ EN CONDICIONES DE SER USADA.
    public boolean enCondiciones() {
        return "EN USO".equals(estado) && calibre >= 9;
    }

    // METODO ABSTRACTO DE VERIFICACION SI SE DISPARA A LARGA DISTANCIA
    public abstract boolean esDisparableALargaDistancia();


    // IMPRIMIR DETALLES DEL ARMA
    @Override
    public String toString() {
        return "Arma{" +
                "policia=" + policia +
                ", cantidadMuniciones=" + cantidadMuniciones +
                ", alcanceMetros=" + alcanceMetros +
                ", marca='" + marca + '\'' +
                ", calibre=" + calibre +
                ", estado='" + estado + '\'' +
                '}';
        }
    }


