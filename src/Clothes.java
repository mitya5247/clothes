public abstract class Clothes {
    private Size size;
    private int price;
    private String colour;

    public Clothes(Size size, int price, String colour) {
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
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
