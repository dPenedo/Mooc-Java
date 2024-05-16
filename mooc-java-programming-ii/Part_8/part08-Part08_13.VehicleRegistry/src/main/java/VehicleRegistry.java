import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * VehicleRegistry
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry(){
        this.owners = new HashMap<>();

    }
    public boolean add(LicensePlate licensePlate, String owner){
        // Check if owner is duplicate
        if(owners.containsKey(licensePlate)){
            return false;
        } else {
            owners.put(licensePlate, owner);
            return true;
        }

    }
    public String get(LicensePlate licensePlate){
        return owners.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate){
        if (owners.get(licensePlate) != null) {
            owners.remove(licensePlate);
        return true;
        }
        return false;
    }
    public void printLicensePlates(){
        for (LicensePlate licenseToPrint : owners.keySet()) {
            System.out.println(licenseToPrint);
        }


    }
    public void printOwners(){
        ArrayList<String> ownersList = new ArrayList<>();
        for (String stringOwner : owners.values()) {
            if (!ownersList.contains(stringOwner)) {
            System.out.println(stringOwner);
                ownersList.add(stringOwner);
            }

        }


    }
}
