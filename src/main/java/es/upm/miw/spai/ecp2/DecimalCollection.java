package es.upm.miw.spai.ecp2;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {
    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<Double>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public double get(int i){
        return this.collection.get(i);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher)
                higher = item;
        }
        return higher;
    }

    public boolean exists(double value) {
        for (double item : this.collection) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }
    
    public void multiply(double number) {
        for (int i=0;i<collection.size();i++) {
            collection.set(i,collection.get(i)*number);
        }
    }
}
