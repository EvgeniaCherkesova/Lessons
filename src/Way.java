public class Way {
     City city;
     int cost;

    public Way(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    public City getCity() {
        return city;
    }

    public int getCost() {
        return cost;
    }

    public String toString(){
        return city.cityName + ": " + cost;
    }
}
