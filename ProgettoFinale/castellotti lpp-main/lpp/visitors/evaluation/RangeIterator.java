package lpp.visitors.evaluation;

import java.util.Iterator;
import java.util.NoSuchElementException;

class RangeIterator implements Iterator<Integer> {

	private int next;
	private final int end;
    private final boolean is_reversed;

	RangeIterator(int start, int end) {
		this.next = start;
		this.end = end;
        this.is_reversed = start > end;
	}

	@Override
	public boolean hasNext() {
        if(!this.is_reversed)
            return next < end;
        return next > end;
    }

	@Override
	public Integer next() {
		if (!hasNext())
			throw new NoSuchElementException();
        if(!this.is_reversed)
            return next++;
        return next--;
	}

}
