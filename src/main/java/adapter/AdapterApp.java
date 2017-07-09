package adapter;


public class AdapterApp {
    public static void main(String[] args) {

        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
    }
}
