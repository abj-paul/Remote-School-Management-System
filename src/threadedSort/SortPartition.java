package threadedSort;

import java.util.ArrayList;

public class SortPartition<T extends Comparable> implements Runnable {
	private ArrayList<T> elementStorage;
	private int startIndex;
	private int endIndex;
	
	public SortPartition(ArrayList<T> elementStorage, int startIndex, int endIndex) {
		this.elementStorage = elementStorage;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	void swap(int firstIndex, int secondIndex) {
		T temporaryValue = this.elementStorage.get(firstIndex);
		this.elementStorage.set(firstIndex, this.elementStorage.get(secondIndex));
		this.elementStorage.set(secondIndex ,temporaryValue);
	}
	
	void sort() {
		for(int i=this.startIndex; i<=this.endIndex-1; i++) {
			for(int j=i+1; j<=this.endIndex; j++) {
				if(this.elementStorage.get(i).compareTo(this.elementStorage.get(j))>0) swap(i,j);
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sort();
	}

}
