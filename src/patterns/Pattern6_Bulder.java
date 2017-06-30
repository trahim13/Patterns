package patterns;

public class Pattern6_Bulder {
    SportCar sportCar = new SportCar.Bulder("Audi").setColor("green").setMaxSpeed(350).build();

}

class SportCar {
    private String name;
    private String color = "black";
    private int maxSpeed = 200;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCar(Bulder bulder) {
        this.name = bulder.name;
        this.color = bulder.color;
        this.maxSpeed = bulder.maxSpeed;
    }

    static class Bulder {

        private String name;
        private String color;
        private int maxSpeed;

        public Bulder(String name) {
            this.name = name;
        }

        public Bulder setColor(String color) {
            this.color = color;
            return this;
        }

        public Bulder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;

        }

        public SportCar build() {
            return new SportCar(this);

        }
    }

}
