import java.util.ArrayList;

public class Studio<T extends Clothes> implements MenClothes, WomenClothes { // почему сделали T, а не просто Clothes
    ArrayList<T> clothes = new ArrayList<>(); // так как это класс абстрактный, то не будет доступа к его полям класса Clothes
    ArrayList<TShirt> tShirts = new ArrayList<>();

    @Override
    public void dressWoman() {
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenClothes) {
                System.out.println(cloth);
            }
        }
    }

    @Override
    public void dressMan() {
        for (Clothes cloth : clothes) {
            if (cloth instanceof MenClothes) {
                System.out.println(cloth);
            }
        }
    }

    public void getClothes(T cloth) {
        clothes.add(cloth);
    }

    public int getSum() {
        int sum = 0;
        for (T cloth : clothes) {
            System.out.println(cloth.getPrice());
            sum += cloth.getPrice();
        }
        return sum;
    }

    public int getMaxSize() {
        int maxSize = 0;
        int index = 0;
        for (int i = 0; i < clothes.size(); i++) {
            if (clothes.get(i).getSize().getEuroSize() > maxSize) {
                maxSize = clothes.get(i).getSize().getEuroSize();
                index = i;
            }
        }
        return clothes.get(index).getSize().getEuroSize();
    }
}
