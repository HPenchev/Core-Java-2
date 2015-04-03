import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class IntStatistics implements Statistics, Iterable<Integer> {
    private List<Integer> numbers;
    
    public IntStatistics(List<Integer> numbers) {
        this.numbers = numbers;        
    }
    
    public IntStatistics() {
        this.numbers = new ArrayList<Integer>();
    }
    
    public void add(int number) {        
        this.numbers.add(number);        
    }
    
    @Override
    public double getMean() {
        int sum = 0;
        for (Integer integer : numbers) {
            sum += integer;
        }
        return (double)sum / this.numbers.size();
    }

    
    @Override
    public double getMedian() {        
        Collections.sort(this.numbers);
        int size = this.numbers.size();
        if (size % 2 == 0) {
            return (double)(this.numbers.get(size / 2 - 1) + this.numbers.get(size / 2)) / 2;
        } else {
            return (double)this.numbers.get(size / 2);
        }
    }

    @Override
    public Double getMode() {
        Integer mode = null;
        int length = this.numbers.size();
        int maxOccurrences = 1;
        int occurrences = 1;
        int numToCount;
        
        for (int i = 0; i < length - 1; i++) {
            occurrences = 1;
            numToCount = this.numbers.get(i);
            for (int j = i + 1; j < length; j++) {
                if (numToCount == this.numbers.get(j)) {
                    occurrences++;
                }
            }
            
            if (occurrences > maxOccurrences) {
                maxOccurrences = occurrences;
                mode = numToCount;
            } else if (occurrences == maxOccurrences) {
                mode = null;
            }
        }
        
        if (mode != null) {
            return (double)mode;
        } else {
            return null;
        }
    }

    @Override
    public double getRange() {
        return Collections.max(this.numbers) - Collections.min(this.numbers);
    }

    @Override
    public Iterator<Integer> iterator() {
        return this.numbers.iterator();
    }
}