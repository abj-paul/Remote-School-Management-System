package threadedSort;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sort<T extends Comparable>{
	private T[] elementStorage;
	public Sort(T[] elementStorage){
		this.elementStorage = elementStorage;
	}
	
	public void splitAndSort() {
		int firstPartStartIndex = 0;
		int firstPartEndIndex = this.elementStorage.length/2;
		int secondPartStartIndex = firstPartEndIndex+1;
		int secondPartEndIndex = this.elementStorage.length-1;
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.submit(new SortPartition(this.elementStorage, firstPartStartIndex, firstPartEndIndex));
		executorService.submit(new SortPartition(this.elementStorage, secondPartStartIndex, secondPartEndIndex));
		executorService.submit(new SortPartition(this.elementStorage, firstPartStartIndex, secondPartEndIndex));
		
		executorService.shutdown();
	}
	
	public void print() {
		for(int i=0; i<this.elementStorage.length; i++) System.out.printf("%d ",this.elementStorage[i]);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Integer[] arr = {2,0,33,12,-5,2};
		Sort<Integer> sort = new Sort<Integer>(arr);
		sort.splitAndSort();
		sort.print();
	}
}
