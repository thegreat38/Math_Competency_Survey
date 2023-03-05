import java.util.ArrayList;

public class School extends ArrayList<School> {
    // attributes
    private String name;
    private Address address;
    private String principal;
    private final Marks[] marks;
    private int year;


    public School(Marks marks, String name, Address address, String principal, int num, int year){
        this.year = year;
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.marks = new Marks[num];
        for (int i = 0; i < num; i++) {
            this.marks[i] = new Marks(num);
        }
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    //getters
    public float getAverage() {
        return marks[0].calcAvg();
    }
    public double getStandard_dev() {
        return marks[0].calSdev();
    }
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setNumParticipants(int num) {
        for(Marks mark : marks) {
            mark.createData(num);
        }
    }
    public int getNumParticipants() {
        return marks.length;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}
