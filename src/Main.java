public class Main {

    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        int weight = 98; // вес
        double height = 1.87; // рост человека (в метрах)

        int bmi = bmiService.calculate(weight, height); // расчет индекса массы тела человека

        System.out.println("BMI index равен: " + bmi); // результат BMI
    }
}
