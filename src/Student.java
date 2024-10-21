import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> estimates = new ArrayList<>();

    public Student(String name, int... estimate) {
        setName(name);
        addEstimates(estimate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("name isn't be null");
        this.name = name;
    }

    public void addEstimates(int... estimate) {
        for( int x: estimate){
            if(x < 2 || x > 5){
                throw new IllegalArgumentException("incorrect mark!");
            }
            this.estimates.add(x);
        }
    }

    public List<Integer> getEstimates() {
        return new ArrayList<>(estimates);
    }

    public String toString() {
        return name + ": " + estimates;
    }

    public double getAverage() {
        if(estimates == null){
            return 0;
        }else {
            double res = 0;
            for (double x : estimates) {
                res += x;
            }
            res = res / estimates.size();
            return res;
        }
    }

    public String excellentStudent(){
        if(getAverage() == 5.0){
            return "отличник";
        }
        else return "не отличник";
    }
}
