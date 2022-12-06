package hw2Oop1;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;
    Human(String name) {
        this (0, "Информация не указана", "Информация не указана",
                "Информация не указана");
    }

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }
    void hello(){
        System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getTown()
                + ". Год рождения: " + getYearOfBirth() +
                ". Я работаю на должности " + getJobTitle() + ". Будем знакомы!");
    }
    public String getName(){
        if (name == null) {
            name = "Информация не указана";}
        return name;
    }
    public String getTown(){
        if (town == null) {
            town = "Информация не указана";}
        return town;
    }
    public String getJobTitle(){
        if (jobTitle == null) {
            jobTitle = "Информация не указана";}
        return jobTitle;
    }
    public int getYearOfBirth(){
        if (yearOfBirth <= 0) {
            yearOfBirth = 0;
        }
        return yearOfBirth;
    }
    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", yearOfBirth=" + yearOfBirth
                + ", town=" + town
                + ", jobTitle=" + jobTitle
                + '}';
    }
}
