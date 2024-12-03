//La nostra implementazione di una linked list!!
public class NostraLL<T> {
	private T data; // Il primo elemento della lista usa solo il puntatore
	private NostraLL<T> next;

	private NostraLL<T> first;

	public NostraLL() {
		first = null;
	}

	void addFirst(T info) {
		NostraLL<T> l = new NostraLL<T>();
		l.data = info;
		l.next = null;

		if (first == null) {
			// la lista è vuota
			first = l;
		} else {
			l.next = first;
			first = l;
		}
	}

	void addLast(T info) {
		NostraLL<T> l = new NostraLL<T>();
		l.data = info;
		l.next = null;
		if (first == null) {
			first = l;
		} else {
			if (next == null) {
				next = l;
			} else {
				while (next.next != null) {
					next = next.next;
				}
				next.next = l;
			}
		}
	}
}