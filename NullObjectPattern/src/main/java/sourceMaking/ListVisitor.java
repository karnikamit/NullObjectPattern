package sourceMaking;

public interface ListVisitor {
	Object whenNonNullList(NonNullList host, Object param);
	Object whenNullList(NullList host, Object param);

}
