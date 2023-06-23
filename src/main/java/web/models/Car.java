package web.models;

public class Car {

    private int id;
    private String name;
    private String engine;

    public Car() {
    }

    public Car(int id, String name, String engine) {
        this.id = id;
        this.name = name;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " + engine;
    }
}
