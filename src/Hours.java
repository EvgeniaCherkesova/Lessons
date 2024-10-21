public class Hours {
    private static final int HOURS = 3600;
    private static final int MIN = 60;
    private int time;

    public Hours(int time) {
        setTime(time);
    }

    public Hours(int hours, int minutes, int seconds) {
        this(seconds + minutes*60 + hours * HOURS);
    }

    public String toString(){
        return String.format("%d:%d:%02d", time/HOURS,time%HOURS/MIN,time%HOURS%MIN, time%HOURS%MIN);
    }

    public int getTime() {
        return time;
    }

    public int getHours() {
        return time/HOURS;
    }

    public int getMinutes() {
        return time%HOURS/MIN;
    }

    public int getSeconds() {
        return time%HOURS%MIN;
    }

    public void setTime(int time) {
        if(time > 86400){
            this.time = time%86400;
        }
        this.time = time;
    }
}

