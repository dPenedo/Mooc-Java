import java.util.ArrayList;
import java.util.HashMap;

/**
 * StorageFacility
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storages;

    public StorageFacility() {
        this.storages = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storages.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> itemList = this.storages.get(unit);
        itemList.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> listOfItems = new ArrayList<>();
        if (storages.get(storageUnit) != null) {
            listOfItems = storages.get(storageUnit);
        }
        return listOfItems;
    }

    public void remove(String storageUnit, String item) {

        ArrayList<String> itemsOnUnit = storages.get(storageUnit);

        if (itemsOnUnit!=null) {
            itemsOnUnit.remove(item);
        }
        if (storages.get(storageUnit).isEmpty()) {
            storages.remove(storageUnit);

        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storagesOnUnit = new ArrayList<>();
        for (String string : storages.keySet()) {
            if (storages.get(string).size() > 0) {
                storagesOnUnit.add(string);
            }
        }
        return storagesOnUnit;
    }
}
