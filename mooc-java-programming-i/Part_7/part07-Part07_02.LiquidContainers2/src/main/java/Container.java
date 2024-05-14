/**
 * Container
 */
public class Container {
    private int liquid = 0;

    public Container() {
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount > 0 && amount + this.liquid < 100) {
            this.liquid += amount;
        } else if (amount + this.liquid >= 100) {
            this.liquid = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0 && (this.liquid - amount) > 0) {
            this.liquid -= amount;
        } else if (this.liquid - amount <= 0) {
            this.liquid = 0;
        }
    }
    public String toString(){
        return this.liquid + "/100";

    }

}
