/**
 * CustomTacoBox
 */
public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (tacos>0) {
        this.tacos--;
        }
    }

}
