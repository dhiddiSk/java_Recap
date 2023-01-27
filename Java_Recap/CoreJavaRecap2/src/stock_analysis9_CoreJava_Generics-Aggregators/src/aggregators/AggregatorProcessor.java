package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<i1 extends Aggregator> {
	i1 itemInstance;
	String fileName2;
	
	
	public AggregatorProcessor(i1 itemInstance ,String fileName) {
		super();
		this.itemInstance = itemInstance;
		this.fileName2 = fileName;
	}
	
	public double runAggregator(int column) throws IOException {
		StockFileReader fileReader = new StockFileReader(fileName2);
		List<String> lines = fileReader.readFileData();
		
		for(String line:lines) {
			String[] values = line.split(",");
			double value = Double.parseDouble(values[column]);
			itemInstance.add(value);
		}
		
		double afterRunningAggregator = itemInstance.calculate();
		
		return afterRunningAggregator;
	}
}
