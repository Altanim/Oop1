package hw2Oop1;

public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;
    //Human(String name) {
        //this (0, "Информация не указана", "Информация не указана",
               // "Информация не указана");
   // }

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }
    void hello(){
        if (jobTitle == "безработный") {
            System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getTown()
                    + ". Год рождения: " + getYearOfBirth() +
                    ". Я временно не работаю. Будем знакомы!");
        } else {
        System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getTown()
                + ". Год рождения: " + getYearOfBirth() +
                ". Я работаю на должности " + getJobTitle() + ". Будем знакомы!");}
    }
    public String getName(){
        if (name == null) {
            name = "Информация не указана";}
        return name;
    }
    public String getTown(){

        return town;
    }
    public String getJobTitle(){
        if (jobTitle == null) {
            jobTitle = "Информация не указана";}
        return jobTitle;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана"; }
        else {this.town = town;}
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0){
            this.yearOfBirth = 0;
        } else {
        this.yearOfBirth = yearOfBirth;}
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
