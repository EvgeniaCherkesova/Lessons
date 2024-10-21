public class Gun2 extends Gun{
    private final int speedShoot;

    public Gun2() {
        super(30);
        speedShoot = 30;
    }

    public Gun2(int maxCartridges) {
        super(maxCartridges);
        speedShoot = maxCartridges/2;
    }

    public Gun2(int maxCartridges, int speedShoot) {
        super(maxCartridges);
        this.speedShoot = speedShoot;
    }

    @Override
    public void toShot() {
        for (int i = speedShoot; i > 0 ; i--) {
            super.toShot();
        }
    }

    public void toShot(int seconds){
        for (int i = speedShoot * seconds; i > 0 ; i--) {
            super.toShot();
        }
    }

}

