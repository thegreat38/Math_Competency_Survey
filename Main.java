import java.util.List;

public class Main {
    // Application code
    public static void main(String[] args) {

        //addresses
        Address ad1 = new Address("Jalan 2", "JB","Johor");
        Address ad2 = new Address("Seri Isk", "PK","Perak");
        Address ad3 = new Address("Selangor 1", "KL","Kuala");

        //school marks
        Marks mk1 = new Marks(10);
        Marks mk2 = new Marks(10);
        Marks mk3 = new Marks(10);

        //Schools
        School sk1 = new School(mk1, "Sk Satu", ad1 , "Michael J", 10, 2023);
        School sk2 = new School(mk2, "Sk Cyber" , ad2 , "Stephen Prime", 20, 2022);
        School sk3 = new School(mk3, "Sk UTP" , ad3 , "Frank Trevor", 30, 2020);

        //List
        SList moe = new SList();
        moe.addSchool(sk1);
        moe.addSchool(sk2);
        moe.addSchool(sk3);


        //Setting number of participants for ach School
        sk1.setNumParticipants(10);
        sk2.setNumParticipants(8);

        //Getting the average and standard deviation for each School
        List<School> sortedSchools = moe.getSortedSchools();
                for(School school : sortedSchools) {
                    System.out.println("School Name : " + school.getName());
                    System.out.println("Year : " + school.getYear());
                    System.out.println("School District : " + school.getAddress().toString());
                    System.out.println("Principal  : " + school.getPrincipal());
                    System.out.println("Number of Participants : " + school.getNumParticipants());
                    System.out.println("Average : " + school.getAverage());
                    System.out.println("Standard deviation : " + school.getStandard_dev() + "\n");
                }
    }
}
