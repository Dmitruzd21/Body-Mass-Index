public class BmiService {
    public double calculate(double Weight, double Height) {
        double BMI = Weight / (Height * Height);
        return BMI;
    }
}
