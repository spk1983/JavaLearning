package fileprocessors;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StockFileData {
	
	List<HashMap<String, Double>> data = new LinkedList<>();
	
	public void printData(){
		for(int i=0; i<data.size(); i++) {
			System.out.println(data.get(i));
		}
		
	}
	
	public void addData(List<HashMap<String, Double>> dataIn){
		data = dataIn;
	}
}
