public class Football {

    public static final double BALL_SIZE = 22.0; // у сантиметрах

    private double weight;
    private String color;

    public Football(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Футбольний м'яч:");
        System.out.println("Розмір: " + BALL_SIZE + " см");
        System.out.println("Вага: " + weight + " г");
        System.out.println("Колір: " + color);
    }

    public static double getBallSize() {
        return BALL_SIZE;
    }
}

