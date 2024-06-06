

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item elItem = new Item("un item", 200);
        Item otroItem = new Item("otro item", 300);
        Item perret = new Item("perret", 300);
        Suitcase elSuitcase = new Suitcase(12000);
        Suitcase otroSuitcase = new Suitcase(12000);
        Hold elHold = new Hold(1200);

        elSuitcase.addItem(elItem);
        otroSuitcase.addItem(otroItem);
        otroSuitcase.addItem(perret);

        elHold.addSuitcase(elSuitcase);
        elHold.addSuitcase(otroSuitcase);
        System.out.println(elSuitcase.totalWeight());
        elSuitcase.printItems();
        System.out.println("==== el Hold ====");
        elHold.printItems();



            // Object hold = createHold(128);
            //
            // Object createSuitcase = createSuitcase(10);
            // addItem(createSuitcase, createItem("Pig", 7));
            // addItem(createSuitcase, createItem("Wolf", 2));
            //
            // addSuitcase(hold, createSuitcase);
            //
            // createSuitcase = createSuitcase(10);
            // addItem(createSuitcase, createItem("Chicken", 5));
            // addItem(createSuitcase, createItem("Fox", 3));
            //
            // addSuitcase(hold, createSuitcase);
            //
            // createSuitcase = createSuitcase(10);
            // addItem(createSuitcase, createItem("Cat", 5));
            // addItem(createSuitcase, createItem("Dog", 3));
            //
            // addSuitcase(hold, createSuitcase);

    }

}
