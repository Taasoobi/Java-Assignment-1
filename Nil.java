public class Nil implements ImmutableList {
    public Nil() {}

    @Override
    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals

    @Override
    public String toString() {
        return "Nil";
    } // toString

    @Override
    public int hashCode() {
        return 0; // Nil's hash code is 0
    } // hashCode

    // Length of an empty list is 0
    @Override
    public int length() {
        return 0;
    }

    // Sum of an empty list is 0
    @Override
    public int sum() {
        return 0;
    }

    // Appending to an empty list returns the other list
    @Override
    public ImmutableList append(final ImmutableList other) {
        return other; // Nil appended with any list is just that list
    }

    // An empty list doesn't contain any value
    @Override
    public boolean contains(final int value) {
        return false; // Nil doesn't contain any values
    }
}