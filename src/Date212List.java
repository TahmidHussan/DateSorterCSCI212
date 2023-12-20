/**
 * The Date212List class represents an abstract list of Date212 objects.
 */
public abstract class Date212List {
    protected Date212Node first = new Date212Node(null);
    protected Date212Node last = first;
    protected int length = 0;

    /**
     * Constructs a Date212List.
     */
    public Date212List() {
        // Constructor
    }

    /**
     * Returns the length of the Date212List.
     *
     * @return The length of the Date212List.
     */
    public int getLength() {
        // Returns the length of Date212List
        return length;
    }

    /**
     * Appends a Date212 object to the end of the Date212List.
     *
     * @param d The Date212 object to append.
     */
    public void append(Date212 d) {
        // Adds a Date212Node to the end of the Date212List
        Date212Node n = new Date212Node(d);
        last.next = n;
        last = n;
        n.next = null;
        length++;
    }
}
