package backend.result;

import java.util.ArrayList;

import backend.student.Student;

public class Result<T extends Comparable>{
	private ArrayList<T> markSheet;
	
	public Result(ArrayList<T> markSheet) {
		this.markSheet = markSheet;
	}
	
	public void sort() {
		for(int i=0; i<this.markSheet.size()-1; i++) {
			for(int j=i+1; j<this.markSheet.size(); j++) {
				if(this.markSheet.get(i).compareTo(this.markSheet.get(j))>0) {
					// Swap
					T temp = this.markSheet.get(i);
					this.markSheet.set(i, this.markSheet.get(j));
					this.markSheet.set(j, temp);
				}
			}
		}
	}
	
	
	public ArrayList<T> getResult(){
		return this.markSheet;
	}
	
}
