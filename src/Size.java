public enum Size {
    XXS(32), // по факту здесь проиходиьт создание статических экземпляров
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;
    private Size(int euroSize) {
        this.euroSize = euroSize;
    }

    String getDescription(Size euroSize) {
        String size = "";
        switch (euroSize) {
            case XXS:
                size = "Детский размер";
                break;
            case XS:
            case S:
            case M:
            case L:
                size = "Взрослый размер";
                break;

        }
        return size;
    }
}
