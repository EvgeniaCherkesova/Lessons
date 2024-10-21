public class City2 extends City {

    public City2(String cityName) {
        super(cityName);
    }

    @Override
    public boolean addWays(City city, int cost) {
        if (super.addWays(city, cost)){
            super.addWays(this, cost);
            return true;
        }
        return false;
    }
}
