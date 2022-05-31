public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(75, 183);
        System.out.println((int)bmi);
    }
}
