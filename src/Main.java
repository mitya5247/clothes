public class Main {
    public static void main(String[] args) {
        Studio<Clothes> studio = new Studio<>();

        MenClothes tShirt = new TShirt(Size.S, 3000, "Черный");
        MenClothes trousers = new Trousers(Size.M, 10000, "Белый");
        WomenClothes skirt = new Skirt(Size.L, 3400, "Белый");
        MenClothes tie = new Tie(Size.XXS, 1000, "Оранжевый");
        WomenClothes skirt1 = new Skirt(Size.XS, 23000, "Зеленая");
        WomenClothes tShirt1 = new TShirt(Size.S, 4000, "Бежевая");

        studio.getClothes((Clothes) trousers); // обязательно кастуем класс, так как studio - экземпляр типизированного класса и там верхняя граница - Clothes.
        studio.getClothes((Clothes) tShirt);
        studio.getClothes((Clothes) skirt);
        studio.getClothes((Clothes) tie);
        studio.getClothes((Clothes) skirt1);
        studio.getClothes((Clothes) tShirt1);

        System.out.println(studio.clothes.size());

        studio.dressMan();
        studio.dressWoman();
        System.out.println("Итоговая сумма " + studio.getSum());
        System.out.println("Самый большой размер " + studio.getMaxSize());


    }
}