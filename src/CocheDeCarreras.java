public abstract class CocheDeCarreras {
    private String marca;
    private String modelo;
    private int VelocidadMaxima;

    public CocheDeCarreras(String marca, String modelo, int VelocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.VelocidadMaxima = VelocidadMaxima;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        VelocidadMaxima = velocidadMaxima;
    }
    public abstract void competir();
    public void mostrarDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidad maxima: "+VelocidadMaxima);
    }


}
