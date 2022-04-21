package threadedSort;

public class SortPartition<T extends Comparable> implements Runnable {
	private T[] elementStorage;
	private int startIndex;
	private int endIndex;
	
	public SortPartition(T[] elementStorage, int startIndex, int endIndex) {
		this.elementStorage = elementStorage;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	void swap(int firstIndex, int secondIndex) {
		T temporaryValue = this.elementStorage[firstIndex];
		this.elementStorage[firstIndex] = this.elementStorage[secondIndex];
		this.elementStorage[secondIndex] = temporaryValue;
	}
	
	void sort() {
		for(int i=this.startIndex; i<=this.endIndex-1; i++) {
			for(int j=i+1; j<=this.endIndex; j++) {
				if(this.elementStorage[i].compareTo(this.elementStorage[j])>0) swap(i,j);
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sort();
	}

}
