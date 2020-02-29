public class Employer {
    private String name;
    private String position;
    private String email;
    private String namber;
    private int salary;
    private int age;

    public Employer(String name, String position, String email, String namber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.namber = namber;
        this.salary = salary;
        this.age = age;
    }

    public void infoEmployer() {
        System.out.printf( "name: "+ name + "position: " + position + "e-mail: " + email + "namber: " + namber + "salary: " + salary + " age: " + age + "     ");
    }

    public int getAge (){
        return age;
    }
}
