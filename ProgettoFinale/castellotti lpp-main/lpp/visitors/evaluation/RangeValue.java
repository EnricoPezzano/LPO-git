package lpp.visitors.evaluation;

import static java.util.Objects.hash;

public class RangeValue implements Iterable<Integer>, Value {

	private final int start, end;

	// ranges from start (inclusive) to end (exclusive) if start < end else ranges from end inclusive to start exclusive
	public RangeValue(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public RangeIterator iterator() {
		return new RangeIterator(start, end);
	}

    public PairValue getBounds() {
        return new PairValue(new IntValue(this.start), new IntValue(this.end));
    }

    public RangeValue toRange() { 
        return this;
    }

    @Override
	public String toString() {
		return "[" + this.start + ":" + this.end + "]";
	}

	@Override
	public int hashCode() {
		return hash(this.start,this.end);
	}

	private boolean isEmptyRange() {
		return this.start == this.end;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof RangeValue))
			return false;
		var op = (RangeValue) obj;
		// [1:1] == [4:4] (empty range)
		return (this.isEmptyRange() && op.isEmptyRange()) || (this.start == op.start && this.end == op.end);
	}
}