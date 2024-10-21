public class Gun {
    private int cartridges;
    private final int maxCartridges;

    public Gun(int maxCartridges, int cartridges) {
        this.maxCartridges = maxCartridges;
        setCartridges(cartridges);
    }

    public Gun(int maxCartridges) {
        this(maxCartridges, 5);
    }

    public int getMaxCartridges() {
        return maxCartridges;
    }

    public int getCartridges() {
        return cartridges;
    }

    public void isEmpty() {
        if (cartridges == 0) {
            System.out.println("разряжен");
        } else System.out.println("заряжен");
    }

    public void setCartridges(int cartridges) {
        if (cartridges < 0) {
            throw new IllegalArgumentException();
        }
        if(cartridges > maxCartridges){
            this.cartridges = maxCartridges;
            System.out.println(String.format("возвращено %d патронов",cartridges-maxCartridges));
        }
        this.cartridges = cartridges;
    }

    public int recharge(){
        int x = cartridges;
        cartridges = 0;
        return x;
    }


    public void toShot() {
        if (cartridges > 0) {
            System.out.println("Бах!");
            cartridges--;
        } else {
            System.out.println("Клац!");
        }
    }
}
