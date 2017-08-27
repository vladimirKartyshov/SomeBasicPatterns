package memento;

public class File {

    Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    public static File createTempFile(String t) {
        return null;
    }
}
