package com.projects;

public class DataObj {

    private int priKey;
    private Object[] vals;

    public DataObj(int priKey, Object[] vals) {
        this.priKey = priKey;
        this.vals = vals;
    }

    public int getPriKey() {
        return this.priKey;
    }
    public Object[] getVals() {
        return this.vals;
    }

    public void setPriKey(int i) {
        this.priKey = i;
    }

    public void setVals(Object[] newVals) {
        this.vals = newVals;
    }

    public void setSpecifiedVal(int index, Object replacementVal) {
        this.vals[index] = replacementVal;
    }

}
