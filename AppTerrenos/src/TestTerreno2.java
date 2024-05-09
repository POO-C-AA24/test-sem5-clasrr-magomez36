public class TestTerreno2 {
    public static void main(String[] args) {
        /*Terreno t1 = new Terreno(40, 10, 2);
        Terreno t2 = new Terreno(21, 12, 2);
        Terreno t3 = new Terreno(10, 10, 2);
        Terreno arrayTerreno[] = new Terreno[3];
        arrayTerreno[0] = t1;
        arrayTerreno[1] = t2;
        arrayTerreno[2] = t3;*/
        
        //Primera Opcion
        /*for (int i = 0; i < arrayTerreno.length; i++) {
            arrayTerreno[i].calcularArea();
            arrayTerreno[i].calcularCostoTerreno();
            System.out.println(arrayTerreno[i]);
        }*/
        
        //Segunda Opcion
        /*for (Terreno terreno : arrayTerreno) {
            terreno.calcularArea();
            terreno.calcularCostoTerreno();
            System.out.println(terreno);
        }*/
        
        //Tercera Opcion
        Terreno arrayTerrenos[] = {new Terreno(10,3,2),new Terreno(10,3,2),new Terreno(10,3,2)};
        for (Terreno terreno : arrayTerrenos) {
            terreno.calcularArea();
            terreno.calcularCostoTerreno();
            System.out.println(terreno);
        }
        
        // O = +
        // y = *
    }
}
