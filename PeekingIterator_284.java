import java.util.Iterator;

public class PeekingIterator_284 implements Iterator<Integer>{
	Integer next = null;
	Iterator<Integer> iterator = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public PeekingIterator_284(Iterator<Integer> iterator) {
	    // initialize any member here.
	    super();
	    this.iterator = iterator;
	    if(iterator.hasNext()){
	    	this.next = iterator.next();
	    }
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(hasNext()){
	    	next = iterator.next();
	    	return next;
	    }else{
	    	return null;
	    }
	}

	@Override
	public boolean hasNext() {
	    return next!=null;
	}

}
