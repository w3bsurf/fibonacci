package fibonacci;

/**
 * SequenceRange
 */
final class SequenceRange {
    private final int start;
    private final int length;

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