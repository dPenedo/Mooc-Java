import java.util.ArrayList;
import java.util.HashMap;

/**
 * StorageFacility
 */
public class StorageFacility {

   private  HashMap<String, ArrayList<String>> storages;

    public StorageFacility(){
        this.storages = new HashMap<>();
    }


    public void add(String unit, String item){
        this.storages.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> itemList = this.storages.get(unit);
        itemList.add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> listOfItems = new ArrayList<>();
        if (storages.get(storageUnit)!= null) {
            listOfItems = storages.get(storageUnit);
        }
        return listOfItems ;
    }
    // TODO:No hace esto: removes one item — if there are several items with the same name, the rest still remain. If the storage unit would be empty after the removal, the method also removes the unit.
    public void remove(String storageUnit, String item){
        ArrayList<String> itemsOnUnit = storages.get(storageUnit);
        for (String storedItem : itemsOnUnit) {
            if (storedItem.equals(item)) {
                itemsOnUnit.remove(item);
            }
        }
    }
    public ArrayList<String> storageUnits(){
        return
    }
}
