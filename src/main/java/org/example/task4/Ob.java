package org.example.task4;

public class Ob {

    private int z;
    private int x;

    public void inc() {
        x++;
        z++;
    }

    public Ob(Integer z, Integer x) {
        this.z = z;
        this.x = x;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Ob{" +
                "z=" + z +
                ", x=" + x +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ob ob = (Ob) o;
        if (z != ob.z) return false;
        return x == ob.x;
    }

    @Override
    public int hashCode() {
        int result = z;
        result = 31 * result + x;
        return result;
    }
}
