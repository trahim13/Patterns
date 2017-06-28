package patterns;

public class Pattern3_Abstract_Factory {
    public static void main(String[] args) {
        new AbstractFactory();
    }


    interface Car {
        public void drive();
    }

    class Toyota implements Car {
        @Override
        public void drive() {
            System.out.println("drive Toyota");

        }
    }

    class Audi implements Car {
        @Override
        public void drive() {
            System.out.println("drive Audi");

        }
    }

    class CarFactory implements Factory {
@Override
        public Car create(String typeOfCar) {
            switch (typeOfCar) {
                case "Toyota1":
                    return new Toyota();
                case "Audi1":
                    return new Audi();
                default:
                    return null;
            }

        }
    }


    interface Tank {
        public void drive();
    }

    class T90 implements Tank {
        @Override
        public void drive() {
            System.out.println("drive T90");

        }
    }

    class T100 implements Tank {
        @Override
        public void drive() {
            System.out.println("drive Audi");

        }
    }

    class TankFactory implements Factory {
        @Override
        public Tank create(String typeOfTank) {
            switch (typeOfTank) {
                case "T90":
                    return new T90();
                case "T100":
                    return new T100();
                default:
                    return null;
            }

        }
    }

    interface Factory<T> {
        public T create(String type);
    }

    class AbstractFactory {
        public Factory createFactory(String typeOfFactory) {
            switch (typeOfFactory) {
                case "Tank":
                    return new CarFactory();
                case "Car":
                    return new TankFactory();
                default:
                    return null;
            }
        }
    }


}
