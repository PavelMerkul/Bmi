public class BmiService {

    public int calculate(double weightKg, double heightM) {
        double bmi = weightKg / (heightM * heightM); // расчет индекса
        return (int) bmi;
    }
}
