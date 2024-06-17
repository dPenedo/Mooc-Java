/**
 * List
 */
public class List<T> {
	private T[]values;
	private int firstFreeIndex;

	public List(){
		this.values = (T[]) new Object[10];
		this.firstFreeIndex = 0;
	}

	
}
