package lecture16.serialization.graph;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Class DragResults
 *
 * Created by yslabko on 12/29/2017.
 */
@Data @AllArgsConstructor
public class DragResults implements Serializable {
    private int id = 0;
    private Car car1;
    private Car car2;
    int result = 0;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode())
                + " " + id + " {car1=" + car1 +
                ", car2=" + car2 +
                ", result=" + result + '}';
    }
}
