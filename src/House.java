public class House {
    private final int floor;

    public House(int floor) {
        if(floor <= 0){
            throw new IllegalArgumentException("incorrect value");
        }
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder("дом с ").append(floor);
        if (floor%10 == 1) builder.append(" этажом");
        else builder.append(" этажами");
        return builder.toString();
    }
}
