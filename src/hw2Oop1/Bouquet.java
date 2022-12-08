package hw2Oop1;

public class Bouquet {

    public Bouquet(Flower...flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if(flower.getLifeSpan() < minimumLifeSpan) {
                minimumLifeSpan = flower.getLifeSpan();
            }
            totalCost += flower.getCost();
            totalCost = totalCost *1.1;
            flower.flowerInfo();
        }
        System.out.print("Цена букета: ");
        System.out.printf("%.2f", totalCost);
        System.out.print("p. Срок хранения : " + minimumLifeSpan + " дн.");
    }

    @Override
    public String toString() {

        return "Цена букета";
    }
}
