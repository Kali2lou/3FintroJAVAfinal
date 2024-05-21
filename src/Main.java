public class Main {
    public static void main(String[] args) {
        Policia policia1 = new Policia("Juan", "Perez", "12345");
        ArmaCorta armaCorta1 = new ArmaCorta(policia1, 100, 250, "Glock", 9, "EN USO");
        ArmaLarga armaLarga1 = new ArmaLarga(policia1, 200, 300, "Remington", 12, "EN USO", true, "Defensa", 3);
        ArmaLarga armaLarga2 = new ArmaLarga(policia1, 200, 300, "Remington", 12, "EN USO", true, "Defensa", 4);

        // Verificar si las armas están en condiciones de ser usadas
        System.out.println("Arma corta en condiciones: " + armaCorta1.enCondiciones());
        System.out.println("Arma larga en condiciones: " + armaLarga1.enCondiciones());

        // Comparar armas largas
        System.out.println("Comparación de armas largas: " + armaLarga1.compareTo(armaLarga2));

        // Verificar si el arma corta puede disparar a más de 200 metros
        System.out.println("Arma corta puede disparar a más de 200 metros: " + armaCorta1.esDisparableALargaDistancia());
    }
}
