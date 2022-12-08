package hw2Oop1;

public class Flower {
    private final String flowerName;
    private final String country;
    private final float cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, float cost, int lifeSpan) {
        if (flowerName == null || flowerName.isBlank() || flowerName.isEmpty()){
            this.flowerName = "Тип цветка не указан";
        } else {
        this.flowerName = flowerName;}
        if (country == null || flowerName.isEmpty() || flowerName.isBlank()) {
            this.country = "Россия";
        } else {
        this.country = country;}
        if (cost <=0){
            this.cost = 1.00f;
        } else {
        this.cost = cost;}
        if (lifeSpan <= 0){
            this.lifeSpan = 3;
        } else {
        this.lifeSpan = lifeSpan;}
    }
    public Flower(String flowerName, String country, float cost) {
        this(flowerName,country,cost,3);
    }
    void flowerInfo(){
        System.out.println("Цветок: " + getFlowerName() + ". Страна: " + getCountry() + ". Цена: "
                + getCost() + "p. Срок стояния: " + getLifeSpan() + " дней.");
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
