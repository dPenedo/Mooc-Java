
public class MainProgram {

    public static void main(String[] args) {

        Money a = new Money(10, 0);
        Money b = new Money(3, 0);
        Money c = new Money(5, 0);

        System.out.println(a.lessThan(b)); // false
        System.out.println(b.lessThan(c)); // true
    }
}


//        Money firstMoneyObject = new Money(10, 0);
//        Money secondMoneyObject = new Money(7, 40);
//        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
//        firstMinusSecond.euros();
//
//       expected:<2> but was:<3>

        // Money firstMoneyObject = new Money(10, 0);
        // Money secondMoneyObject = new Money(7, 40);
        // Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject);
        // firstMinusSecond.cents();
        // expected:<60> but was:<-40>

