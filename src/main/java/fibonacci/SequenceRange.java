package fibonacci;

/**
 * SequenceRange Joonas Hakkarainen 19.01.2020
 */
final class SequenceRange {
    private final int start;
    private final int length;

    /* Constructor for fibonacci sequence range object */
    public SequenceRange(int start, int length) {
        this.start = start;
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public int getLength() {
        return length;
    }

}