package sourceMaking;

public class NullList extends List {

	private static NullList instance = new NullList();

	private NullList() {}

	public NullList singleton() {
		return instance;
	}

	@Override
	public List getTail() {
		return this;
	}

	@Override
	public Object accept(ListVisitor visitor, Object param) {
		return visitor.whenNullList(this, param);
	}

}
