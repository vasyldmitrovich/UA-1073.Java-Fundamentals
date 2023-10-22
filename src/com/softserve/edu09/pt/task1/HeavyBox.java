package com.softserve.edu09.pt.task1;

public class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public HeavyBox(HeavyBox box){
        this.weight = box.weight;
        this.contents = box.contents;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public String getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeavyBox heavyBox = (HeavyBox) o;

        if (weight != heavyBox.weight) return false;
        return contents.equals(heavyBox.contents);
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + contents.hashCode();
        return result;
    }
}
