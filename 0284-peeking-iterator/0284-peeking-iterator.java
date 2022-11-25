// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    ArrayList<Integer> arr;
    int i=0;
    
	public PeekingIterator(Iterator<Integer> it) {
	    // initialize any member here.
        arr=new ArrayList<>();
	while(it.hasNext()) {
    arr.add(it.next());
   }  
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
    return arr.get(i);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int val=arr.get(i);
        i++;
        return val;
	}
	
	@Override
	public boolean hasNext() {
	  return i<arr.size();  
	}
}