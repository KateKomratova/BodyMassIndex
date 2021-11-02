public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(63, 171);
        System.out.printf("Индекс массы тела:" + " " + "%.2f", index);
    }
}