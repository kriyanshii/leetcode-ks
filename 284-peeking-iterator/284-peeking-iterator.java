// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Integer next;
    private Iterator<Integer> iter;
    private boolean noSuchElement;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
        advanceIterator();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer res = next;
        advanceIterator();
        return res;
	}
	
	@Override
	public boolean hasNext() {
	    return !noSuchElement;
	}
    
    private void advanceIterator(){
        if(iter.hasNext()){
            next = iter.next();
        }
        else{
            noSuchElement = true;
        }
    }
}