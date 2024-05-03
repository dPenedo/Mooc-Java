
public class Main {

    public static void main(String[] args) {
        // Test your Debt class here
        // Debt mortgage = new Debt(120000.0, 1.01);
        // mortgage.printBalance();
        //
        // mortgage.waitOneYear();
        // mortgage.printBalance();
        //
        // int years = 0;
        //
        // while (years < 20) {
        //     mortgage.waitOneYear();
        //     years = years + 1;
        // }
        // mortgage.printBalance();
        //
        //
        Debt pastCentury = new Debt(10000, 1.0814);
        pastCentury.printBalance();
        pastCentury.waitOneYear();
        pastCentury.printBalance();

        Debt ninetees = new Debt(100000, 1.20);
        ninetees.printBalance();
        ninetees.waitOneYear();
        ninetees.printBalance();
    }
}
