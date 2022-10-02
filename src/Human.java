public class Human {
    private int age;
    private int yearOfBirth;
    public String name;
    private String town;
    public String job;

    public Human(int age, String name, String town, String job) {
        int currentYear = 2022;
        this.yearOfBirth = currentYear - age;
        this.name = name;
        this.town = town;
        this.job = job;
        if (this.yearOfBirth > 0 && name == "") {
            System.out.println("Привет! Меня зовут (информация не указана)" + ". Я из города " + this.town + ". " +
                    "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth > 0 && town == "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города (информация не указана)" + ". " +
                    "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth > 0 && job == "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                    "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности (информация не указана)" + ". Будем знакомы!");
        }
        if (this.yearOfBirth > 0 && name != "" && town != "" && job != "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                    "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth <= 0 && name == "") {
            System.out.println("Привет! Меня зовут (информация не указана)" + ". Я из города " + this.town + ". " +
                    "Мой год рождения - 0" + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth <= 0 && town == "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города (информация не указана)" + ". " +
                    "Мой год рождения - 0 " + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
        if (this.yearOfBirth <= 0 && job == "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                    "Мой год рождения - 0 " + ". Я работаю на должности (информация не указана)" + ". Будем знакомы!");
        }
        if (this.yearOfBirth <= 0 && name != "" && town != "" && job != "") {
            System.out.println("Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                    "Мой год рождения - 0" + ". Я работаю на должности " + this.job + ". Будем знакомы!");
        }
    }


    public int getYearOfBirth() {

        return this.yearOfBirth;
    }

    public String getTown() {

        return this.town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }
    }

        public void setTown (String town){
            if (town.isEmpty() || town == null) {
                this.town = "Информация не указана";
            }
        }
    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". " +
                "Мой год рождения - " + this.yearOfBirth + ". Я работаю на должности " + this.job + ". Будем знакомы!";
    }
}

