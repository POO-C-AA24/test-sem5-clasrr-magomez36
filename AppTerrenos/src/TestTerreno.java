public class TestTerreno {
    public static void main(String[] args) {
        Terreno t1 = new Terreno(40, 10, 2);
        Terreno t2 = new Terreno(21, 12, 2);
        t1.calcularArea();
        t1.calcularCostoTerreno();
        System.out.println(t1);
        t2.calcularArea();
        t2.calcularCostoTerreno();
        System.out.println(t2);
    }
}
