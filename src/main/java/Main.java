import ru.netology.services.WorkLifeService;


public class Main {
    public static void main(String[] args) {
        WorkLifeService service = new WorkLifeService();
        int months = service.calculate(100_000, 60_000, 150_000);
        System.out.println(months);
    }
}
