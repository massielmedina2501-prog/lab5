import java.util.ArrayList;
import java.util.Scanner;

public class Campeonato {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<CocheDeCarreras> lista = new ArrayList<>();


        CocheDeCarreras auto1 = new PrototipoLM(true, "Alpine", "A524", 330);
        CocheDeCarreras auto2 = new PrototipoLM(false, "Aston Martin", "AMR24", 320);

        CocheDeCarreras auto3 = new GranTurismo(50, "Ferrari", "488 GT3", 300);
        CocheDeCarreras auto4 = new GranTurismo(30, "Porsche", "911 GT3 R", 305);

        lista.add(auto1);
        lista.add(auto2);
        lista.add(auto3);
        lista.add(auto4);

        System.out.println(".:|| Ingrese un nuevo coche ||:.");

        System.out.print("Tipo (1 = PrototipoLM, 2 = GranTurismo): ");
        int tipo = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Velocidad máxima: ");
        int velocidad = sc.nextInt();

        CocheDeCarreras autoUsuario;

        if (tipo == 1) {
            System.out.print("¿Tiene sistema híbrido? (true/false): ");
            boolean hibrido = sc.nextBoolean();

            autoUsuario = new PrototipoLM(hibrido, marca, modelo, velocidad);

        } else {
            System.out.print("Peso extra de lastre: ");
            int lastre = sc.nextInt();

            autoUsuario = new GranTurismo(lastre, marca, modelo, velocidad);
        }

        lista.add(autoUsuario);

        System.out.println("\n.:|| LISTA DE COCHES ||:.");
        for (CocheDeCarreras coche : lista) {
            System.out.println("Sistema de registro:");
            coche.mostrarDatos();
            coche.competir();
            System.out.println(".:|.:|.:|.:|.:|.:|.:|.:|.:|");
        }

    }
}