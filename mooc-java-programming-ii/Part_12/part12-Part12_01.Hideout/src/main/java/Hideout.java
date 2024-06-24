/**
 * Hideout
 */
public class Hideout<T> {
	private T element;

	public Hideout() {
		this.element = null;
	}

	public void putIntoHideout(T toHide) {
		if (this.element == toHide) {
			this.element = null;
		}
		this.element = toHide;
	}

	public T takeFromHideout() {
		T tempElement = this.element;
		this.element = null;
		return tempElement;
	}

	public boolean isInHideout() {
		if (this.element == null) {
			return false;
		}
		return true;
	}
}
