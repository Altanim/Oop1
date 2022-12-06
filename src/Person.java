public class Person {
        int yearOfBirth;
        String name;
        String town;
        String jobTitle;
    Person(String name) {
        this (0, "Информация не указана", "Информация не указана",
                "Информация не указана");
    }

    Person(int yearOfBirth, String name, String town, String jobTitle) {
       if (yearOfBirth <= 0) {
           yearOfBirth = 0;
       } else {this.yearOfBirth = yearOfBirth;}
            this.name = name;
            this.town = town;
            this.jobTitle = jobTitle;
    }
        void hello(){
            System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Год рождения: " + yearOfBirth +
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
