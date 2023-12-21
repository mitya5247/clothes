public class TShirt extends Clothes implements MenClothes, WomenClothes {
    public TShirt(Size size, int price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
    }

    @Override
    public void dressWoman() {
    }
}
