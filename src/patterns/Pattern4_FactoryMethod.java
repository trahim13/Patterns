package patterns;

public class Pattern4_FactoryMethod {
    public static void main(String[] args) {
        Person p = Person.create();
    }
}
    class Person {
        private Person(){}

        public static Person create() {
            return new Person();
        }
    }

