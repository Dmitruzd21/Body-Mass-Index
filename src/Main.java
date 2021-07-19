public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(70.0, 1.61);
        System.out.printf("%.2f",BMI);
    }
}
