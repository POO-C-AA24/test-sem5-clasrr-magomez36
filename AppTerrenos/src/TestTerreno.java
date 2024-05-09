import java.util.Scanner;
public class TestTerreno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Terreno arrayTerreno[] = new Terreno[2];
        int i = 0;
        String opc;
        while (true){
            System.out.println("Dame alto, anmcho y vmc: ");
            arrayTerreno[i] = new Terreno(teclado.nextDouble(), teclado.nextDouble(), teclado.nextDouble());
            i++;
            System.out.println("Desea mas terrenos (S/N): ");
            opc = teclado.next();
            if (opc.equals("N") || (i >= arrayTerreno.length)) break;
        }
        System.out.println("Los Terrenos Ingresados y Calculados son:");
        for (Terreno terreno : arrayTerreno){
            terreno.calcularArea();
            terreno.calcularCostoTerreno();
            System.out.println(terreno);
        }
    }
}
// Manuel Gomez