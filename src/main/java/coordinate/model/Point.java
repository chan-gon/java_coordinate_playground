package coordinate.model;

import java.util.Objects;

public class Point {

    private static final int MAX_VALUE = 24;
    private static final int MIN_VALUE = 1;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        checkRangeXY(x, y);
        this.x = x;
        this.y = y;
    }

    private void checkRangeXY(int x, int y) {
        if (exceedRange(x) || exceedRange(y)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean exceedRange(int coordinate) {
        return coordinate < MIN_VALUE || coordinate > MAX_VALUE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public boolean isSame(int x, int y) {
        return this.x == x && this.y == y;
    }
}
