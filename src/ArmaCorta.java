public class ArmaCorta extends Arma {
    private boolean esAutomatica;

    public ArmaCorta(Policia policia, int cantidadMuniciones, int alcanceMetros, String marca, int calibre, String estado) {
        super(policia, cantidadMuniciones, alcanceMetros, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    // Getter
    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    // ABSTRACTO PARA VERIFICAR SI EL ARMA PUEDE DISPARAR A DISTANCIA CORTA
    @Override
    public boolean esDisparableALargaDistancia() {
        return getAlcanceMetros() > 200;
    }

    // TOSTRING PARA IMPRIMIR DETALLES DEL ARMA
    @Override
    public String toString() {
        return "ArmaCorta{" +
                "esAutomatica=" + esAutomatica +
                ", " + super.toString() +
                '}';
    }
}

