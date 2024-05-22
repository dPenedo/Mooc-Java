/**
 * OneItemBox
 */
public class OneItemBox extends Box {
    private Item item;
    public OneItemBox(){
    }

    @Override
    public void add(Item itemToAdd){
        if (this.item == null) {
            this.item = itemToAdd;
        }
    }

    @Override
    public boolean isInBox(Item itemToSearch){
        if (itemToSearch.equals(this.item)) {
            return true;
        }
        return false;
    }

}
