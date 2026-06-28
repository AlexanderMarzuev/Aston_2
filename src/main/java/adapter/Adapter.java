package Adapter;

public class Adapter extends Application implements DataBase {


    @Override
    public void remove() {
        deleteObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void insert() {
        saveObject();
    }
}
