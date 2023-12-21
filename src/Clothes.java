public abstract class Clothes {
    private Size size;
    private int price;
    private String colour;

    public Clothes(Size size, int price, String colour) {
        this.size = size;
        this.price = price;
        this.colour = colour;
    }


    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }

}
