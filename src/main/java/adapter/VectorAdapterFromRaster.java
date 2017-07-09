package adapter;

public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface{


    public void drawLine() {
        drawRasterLine();
    }

    public void drawSquare() {
        drawRasterSquare();
    }
}
