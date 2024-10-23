public class Duck extends Animal implements Swimmable {
    private int weight;
    private String color;

    public Duck(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("Die Ente schwimmt");
    }
}

