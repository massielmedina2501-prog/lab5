public class GranTurismo extends CocheDeCarreras {
    private int pesoExtraLastre;

    public GranTurismo(int pesoExtraLastre, String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    @Override
    public void competir() {
        System.out.println("El piloto compite en Gran Turismo gestionando un lastre extra de "
                + pesoExtraLastre + " kg, lo que afecta la aceleración y el manejo.");
    }

    public int getPesoExtraLastre() {
        return pesoExtraLastre;
    }

    public void setPesoExtraLastre(int pesoExtraLastre) {
        this.pesoExtraLastre = pesoExtraLastre;
    }
}