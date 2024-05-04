public class Main {
    public static void main(String[] args) {
        // Створення об'єкту класу Football
        Football football = new Football(410, "білий");

        // Доступ до статичної константи
        System.out.println("Розмір м'яча: " + Football.BALL_SIZE + " см");

        // Доступ до нестатичних елементів класу
        football.displayInfo();

        // Виклик статичного методу
        System.out.println("Розмір м'яча з використанням статичного методу: " + Football.getBallSize() + " см");
    }
}
