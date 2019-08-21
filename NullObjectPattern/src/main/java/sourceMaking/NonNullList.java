package sourceMaking;

public class NonNullList extends List {

	private Object head;
	private List tail;

	/**
	 * constructor
	 */
	public NonNullList(Object head, List tail) {
		this.head = head;
		this.tail = tail;
	}

	public Object getHead() {
		return head;
	}
	@Override
	public List getTail() {
		return this.tail;
	}

	@Override
	public Object accept(ListVisitor visitor, Object param) {
		return visitor.whenNonNullList(this, param);
	}

}
