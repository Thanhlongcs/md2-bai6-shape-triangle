package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6,7,9);
        triangle.setColor("green");
        triangle.setFills(true);
        System.out.println(triangle);
    }
}
