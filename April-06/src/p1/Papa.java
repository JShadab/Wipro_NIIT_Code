package p1;

@FunctionalInterface
public interface Papa {

	void scold();

	default void hello() {
	}

	static void bye() {
	}
	

}
