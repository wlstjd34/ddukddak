package ddukddak;

import java.util.TreeMap;

public class Result {
    private double averageDdukDdak;
    private TreeMap<Integer, Integer> resultDestribution = new TreeMap<>();

    public void setAverage(double d) {
        this.averageDdukDdak = d;
    }

    public void addCase(int estimateValue) {
        Integer temp = resultDestribution.get(estimateValue);
        if (temp == null) {
            resultDestribution.put(estimateValue, 1);
        }
        else {
            resultDestribution.replace(estimateValue, temp + 1);
        }
    }

    @Override
    public String toString() {

        return "average : " + String.format("%.4f" , averageDdukDdak) + " DDukDDak\n" + resultDestribution.toString();
    }
}