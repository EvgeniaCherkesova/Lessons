public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("Кот: %s", name);
    }
    public void sayMew(){
        sayMew(0);
    }

    public void sayMew(int n){
        String str = "mew";
        for (int i = 0; i < n-1; i++) {
            str = str + "-mew";
        }
        System.out.println(name + ": " + str + "!");
    }
}
