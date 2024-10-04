public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    @Override
    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons) other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    @Override
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    @Override
    public int hashCode() {
        return sum(); // Return the sum as the hash code (may not be ideal, but follows the spec)
    } // hashCode

    // Recursively calculates the length of the list.
    @Override
    public int length() {
        return 1 + tail.length(); // Head is 1, add the length of the tail
    }

    // Recursively sums the elements of the list.
    @Override
    public int sum() {
        return head + tail.sum(); // Add head to the sum of the tail
    }

    // Appends another list to this one. Returns a new list.
    @Override
    public ImmutableList append(final ImmutableList other) {
        return new Cons(head, tail.append(other)); // Create a new list with the head and the result of appending `other` to the tail
    }

    // Recursively checks if the value is present in the list.
    @Override
    public boolean contains(final int value) {
        return head == value || tail.contains(value); // Check the head, if not found, check the tail
    }
}