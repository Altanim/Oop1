package hw2Oop1;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988,"Максим", "Минск", "бренд-менеджер");
        maxim.hello();
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        anya.hello();
        Human katya = new Human(1992,"Катя","Калининград", "продакт-менеджер");
        katya.hello();
        Human artem = new Human(1995,"Артем", "Москва", "директор по развитию бизнеса");
        artem.hello();
        Human vladimir = new Human(2001, "Владимир", "Казань","безработный");
        vladimir.hello();


        System.out.println();


        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59f,0);
        rose.flowerInfo();
        Flower hrizantema = new Flower("Хризантема", null, 15.00f, 5);
        hrizantema.flowerInfo();
        Flower pion = new Flower("Пион", "Англия", 69.90f, 1 );
        pion.flowerInfo();
        Flower gipsofila = new Flower("Гипсофила", "Турция", 19.50f,10);
        gipsofila.flowerInfo();
        Bouquet bouquet1 = new Bouquet(rose,rose,pion,pion,pion, gipsofila,hrizantema);
        System.out.println(bouquet1);

    }

    }


