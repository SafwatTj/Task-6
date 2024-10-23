public class Main {
    public static void main(String[] args) {
        Swimmable[] swimmables = {
                new Ship("Pebeda", 100, 30),
                new Ship("Avrora", 50, 50),
                new Duck(5, "schwarz")  // Заменил "black" на "schwarz"
        };

        for (Swimmable element : swimmables) {
            element.swim();
        }

    }
}

