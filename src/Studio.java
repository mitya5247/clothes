import java.util.ArrayList;

public class Studio<T> implements MenClothes, WomenClothes {
    ArrayList<T> clothes = new ArrayList<>();

    @Override
    public void dressWoman() {
        for (T cloth : clothes) {
            if (cloth instanceof WomenClothes) {
                System.out.println(cloth);
            }
        }
    }

    @Override
    public void dressMan() {
        for (T cloth : clothes) {
            if (cloth instanceof MenClothes) {
                System.out.println(cloth);
            }
        }
    }

    public void getClothes(T cloth) {
        clothes.add(cloth);
    }
}
