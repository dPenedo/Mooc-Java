
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    // New methods:
    public Money plus(Money addition) {
        int newEuros = this.euros() + addition.euros();
        int newCents = this.cents() + addition.cents();
        if (newCents > 99) {
            newEuros += newCents / 100;
            newCents = newCents % 100;
        }

        Money newMonew = new Money(newEuros, newCents);
        return newMonew;
    }

    public boolean lessThan(Money compared) {
        // igualdad de euros, compara céntimos
        if (this.euros() == compared.euros()) {
            if (compared.cents() < this.cents()) {
                return false;
            } else {
                return true;
            }
        }
        // compara euros
        if (compared.euros() < this.euros()) {
            return false;
        } else {
            return true;
        }
    }
    public Money minus (Money decreaser){
        int newEuros = this.euros() - decreaser.euros();
        int newCents = this.cents() - decreaser.cents();


        // si los céntimos bajan de 0, se resta de los euros
        if (newCents<0) {
            newEuros -= (newCents / 100) + 1;
            newCents = 100 - decreaser.cents();
        }


        // si la diferencia es negativa, da cero
        if (newEuros < 0 || (newEuros == 0 && newCents < 0)) {
            newEuros = 0;
            newCents = 0;

        }



        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }


    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
