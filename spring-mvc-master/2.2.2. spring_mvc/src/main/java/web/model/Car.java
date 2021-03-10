package web.model;

public class Car {
    private String model;
    private String cargo;
    private int series;

    public Car() {
    }

    public Car(String model, String cargo, int series) {
        this.model = model;
        this.cargo = cargo;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSeries() {
        return series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
