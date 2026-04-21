public class GranTurismo extends CocheDeCarreras {
    private int pesoExtraLastre;

    public GranTurismo(int pesoExtraLastre, String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    @Override
    public void competir() {
        String tipoLastre;

        if (pesoExtraLastre > 50) {
            tipoLastre = "pesado";
        } else {
            tipoLastre = "liviano";
        }

        System.out.println("El piloto compite en Gran Turismo con un lastre "
                + tipoLastre + " de " + pesoExtraLastre + " kg.");
    }

    public int getPesoExtraLastre() {
        return pesoExtraLastre;
    }

    public void setPesoExtraLastre(int pesoExtraLastre) {
        this.pesoExtraLastre = pesoExtraLastre;
    }
}