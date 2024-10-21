import java.util.ArrayList;
import java.util.List;

public class BrokenLine {
    public List<Point> lines = new ArrayList<>();

    public BrokenLine(Point... arr) {
        lines.addAll(List.of(arr));
    }

    public String toString() {
        return "broken line " + lines;
    }

    public void addPoints(Point... arr) {
        addPoints(List.of(arr));
    }

    public void addPoints(List<Point> arr) {
        lines.addAll(arr);
    }

    public int length() {
        int res = 0;
        for (int i = 0; i < lines.size() - 1; i++) {
            res += lines.get(i).length(lines.get(i + 1));
        }
        return res;
    }

}

