package matrix.gnu.bin.array.constructor.isArray;

public interface richer {

    Object clone() throws CloneNotSupportedException;

    @Override
    boolean equals(Object obj);

    void finalize() throws Throwable;

    @Override
    int hashCode();

    @Override
    String toString();
}
