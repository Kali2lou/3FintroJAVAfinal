public class ArmaLarga extends Arma implements Comparable<ArmaLarga> {
    private boolean tieneSelloRENAR;
    private String descripcionUso;
    private int nivel; // del 1 al 5

    // Constructor
    public ArmaLarga(Policia policia, int cantidadMuniciones, int alcanceMetros, String marca, int calibre, String estado, boolean tieneSelloRENAR, String descripcionUso, int nivel) {
        super(policia, cantidadMuniciones, alcanceMetros, marca, calibre, estado);
        this.tieneSelloRENAR = tieneSelloRENAR;
        this.descripcionUso = descripcionUso;
        this.nivel = nivel;
    }

    // Getters
    public boolean isTieneSelloRENAR() {
        return tieneSelloRENAR;
    }

    public String getDescripcionUso() {
        return descripcionUso;
    }

    public int getNivel() {
        return nivel;
    }

    // METODO ABSTRACT PARA VERIFICAR SI EL ARMA DISPARA A LARGA DISTANCIA
    @Override
    public boolean esDisparableALargaDistancia() {
        return true; // Suponemos que todas las armas largas pueden disparar a larga distancia
    }

    // COMPARAR ARMAS LARGAS POR NIVEL (compareTo)
    @Override
    public int compareTo(ArmaLarga otraArma) {
        return Integer.compare(this.nivel, otraArma.nivel);
    }

    // IMPRIMIR DETALLES DEL ARMA LARGA
    @Override
    public String toString() {
        return "ArmaLarga{" +
                "tieneSelloRENAR=" + tieneSelloRENAR +
                ", descripcionUso='" + descripcionUso + '\'' +
                ", nivel=" + nivel +
                ", " + super.toString() +
                '}';
    }
}