package sourceMaking;

public abstract class List {
	public abstract List getTail();
	public abstract Object accept(ListVisitor visitor, Object param);

}
