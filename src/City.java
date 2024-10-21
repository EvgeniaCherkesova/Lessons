import java.util.List;

public class City {
    public String cityName;
    private List<Way> ways;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public boolean addWays(City city, int cost) {
        for( Way x: this.ways){
            if(x.city == city){
                x.cost = cost;
                return false;
            }
            ways.add(new Way(city, cost));
        }
        return true;
    }

    public String toString(){
        return cityName + " { " + ways + " }";
    }
}
