public class Terreno {
    public double alto; 
    public double ancho;
    public double vmc;
    public double area;
    public double costoFinal;

    public Terreno(double alto, double ancho, double vmc) {
        this.alto = alto;
        this.ancho = ancho;
        this.vmc = vmc;
    }
    
    public void calcularArea(){
        this.area = this.ancho * this.alto;
    }
    public void calcularCostoTerreno(){
        costoFinal = area*vmc;
        if (area > area*vmc)
            costoFinal *= 0.8;   // costoFinal = (area*vmc)-(area*vmc)*0.2;
        else if (area >= 200)
            costoFinal *= 0.9;   // costoFinal = (area*vmc)-(area*vmc)*0.1;
    }
    
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + vmc + ", area=" + area + ", costoFinal=" + costoFinal + '}';
    }
}
