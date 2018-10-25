package task5.lambda_task;

public class MyMain {
    public static void main(String[] args) {
        FunctInterface functInterface = () -> System.out.println("Hello, its lambda test");
        functInterface.print();
    }
}
