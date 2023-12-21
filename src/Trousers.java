public class Trousers extends Clothes implements WomenClothes, MenClothes {

    public Trousers(Size size, int price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {
    }
}
