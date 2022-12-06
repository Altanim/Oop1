public class Main {
    public static void main(String[] args) {
        Person maxim = new Person(1988,"Максим", "Минск", "бренд-менеджер");
        maxim.hello();
        Person anya = new Person(1993, "Аня", "Москва", "методист образовательных программ");
        anya.hello();
        Person katya = new Person(1992,"Катя","Калининград", "продакт-менеджер");
        katya.hello();
        Person artem = new Person(1995,"Артем", "Москва", "директор по развитию бизнеса");
        artem.hello();
        System.out.println(maxim);
    }
}