public enum PlaneModel {

    BOEING737(143),
    BOEING757(295),
    AIRBUS310(220),
    AIRBUS319(160);

    private final int capacity;

    PlaneModel(int capacity){
        this.capacity = capacity;
    }

}
