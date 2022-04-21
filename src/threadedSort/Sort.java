package threadedSort;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sort<T extends Comparable>{
	private ArrayList<T> elementStorage;
	
	public Sort(ArrayList<T> elementStorage){
		this.elementStorage = elementStorage;
	}

	public void splitAndSort() {
		int firstPartStartIndex = 0;
		int firstPartEndIndex = this.elementStorage.size()/2;
		int secondPartStartIndex = firstPartEndIndex+1;
		int secondPartEndIndex = this.elementStorage.size()-1;
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.submit(new SortPartition(this.elementStorage, firstPartStartIndex, firstPartEndIndex));
		executorService.submit(new SortPartition(this.elementStorage, secondPartStartIndex, secondPartEndIndex));
		executorService.submit(new SortPartition(this.elementStorage, firstPartStartIndex, secondPartEndIndex));
		
		executorService.shutdown();
	}
	
	public void print() {
		for(int i=0; i<this.elementStorage.size(); i++) System.out.printf("%d) %s\n",i+1,this.elementStorage.get(i).toString());
		System.out.println("");
	}
	
	/*public static void main(String[] args) {
		Integer[] arr = {2,0,33,12,-5,2};
		Sort<Integer> sort = new Sort<Integer>(arr);
		sort.splitAndSort();
		sort.print();
	}*/
}
