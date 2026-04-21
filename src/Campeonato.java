import java.util.ArrayList;

public class Campeonato {
    public static void main(String[] args) {

        ArrayList<CocheDeCarreras> lista = new ArrayList<>();

        CocheDeCarreras auto1 = new PrototipoLM(true, "Alpine", "A524", 330);
        CocheDeCarreras auto2 = new PrototipoLM(false, "Aston Martin", "AMR24", 320);

        CocheDeCarreras auto3 = new GranTurismo(50, "Ferrari", "488 GT3", 300);
        CocheDeCarreras auto4 = new GranTurismo(30, "Porsche", "911 GT3 R", 305);

        lista.add(auto1);
        lista.add(auto2);
        lista.add(auto3);
        lista.add(auto4);

        for (CocheDeCarreras coche : lista) {
            System.out.println("Sistema de registro: ");
            coche.mostrarDatos();
            coche.competir();
            System.out.println(".:|.:|.:|.:|.:|.:|.:|.:|.:|");
        }
    }
}