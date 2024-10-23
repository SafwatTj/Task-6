public class Ship implements Swimmable {
    private String title;
    private int waterTreatment;
    private int length;

    public Ship(String title, int waterTreatment, int length) {
        this.title = title;
        this.waterTreatment = waterTreatment;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "title='" + title + '\'' +
                ", waterTreatment=" + waterTreatment +
                ", length=" + length +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("Motor eingeschaltet");
        System.out.println("Los geht's");
    }
}

