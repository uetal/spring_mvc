package web.model;

public class Car {
    String name;
    int series;
    int age;

    public Car(String name, int series, int age) {
        this.name = name;
        this.series = series;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
