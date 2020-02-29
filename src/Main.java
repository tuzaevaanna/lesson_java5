import javax.swing.*;

public class Main {
    public static void  main (String[] args){
        Employer[] employerArray = new Employer[5];
        employerArray[0] = new Employer("Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 70000, 30);
        employerArray[1] = new Employer("Alex", "director", "alex.@mailbox.com", "85695558585", 150000, 33);
        employerArray[2] = new Employer("Maxim", "manager", "max.@mailbox.com", "89566965895", 50000, 25);
        employerArray[3] = new Employer("Sofia", "accountant", "sofa.@mailbox.com","89564785826", 55000, 45);
        employerArray[4] = new Employer("Nik", "master", "nik.@mailbox.com","89124569878", 60000, 47);

        for (int i=0; i < employerArray.length; i++){
            if (employerArray[i].getAge() > 40){
                employerArray[i].infoEmployer();
            }
        }
    }
}
