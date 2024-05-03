/**
 * Item
 */
public class Item {
    private String identifier;
    private String name;

    public Item(String id, String name){
        this.identifier = id;
        this.name = name;
    }

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String id) {
		this.identifier = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public boolean equals(Object compared){
        if (this==compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        Item comparedItem = (Item) compared;
        return this.identifier.equals(comparedItem.identifier);
    }


}
