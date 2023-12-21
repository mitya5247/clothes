public class Skirt extends Clothes implements WomenClothes{
    public Skirt(Size size, int price, String colour) {
        super(size, price, colour);
    }
    @Override
    public void dressWoman() {}
}
