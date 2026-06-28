package Adapter;

public class Runner {
    public static void main(String[] args) {
        DataBase database = new Adapter();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
