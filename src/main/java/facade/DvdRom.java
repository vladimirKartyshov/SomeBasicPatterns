package facade;

public class DvdRom {
    private boolean data = false;

    public boolean hasData(){
       return data;
    }
    void load(){
        data = true;
    }
    void unload(){
        data = false;
    }
}
