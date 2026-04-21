public class PrototipoLM extends CocheDeCarreras {
    private boolean sistemaHibrido;

    public PrototipoLM(boolean sistemaHibrido, String marca, String modelo, int VelocidadMaxima) {
        super(marca, modelo, VelocidadMaxima);
        this.sistemaHibrido = sistemaHibrido;
    }

    @Override
    public void competir() {
        if (sistemaHibrido) {
            System.out.println("El vehículo compite usando un sistema híbrido.");
        } else {
            System.out.println("El vehículo compite con motor de combustión.");
        }
    }
}
