import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Each marks entry consists of a score, the ID and name and class name of the participating student.
The survey is carried out on a yearly basis.

The MoE would like to be able to do the following calculation over the years :
get the score for a particular school in a particular year.
*/
public class SList {
    private School[] schools;

    //private Marks[] marks;

    ArrayList<School> schoolList;

    public SList() {
        schoolList = new ArrayList<School>();
    }
    public void addSchool(School sc) {
       schoolList.add(sc);
    }

    public ArrayList<School> getSchools(){
        return schoolList;
    }
    public void sortSchoolsByName() {
        Comparator<School> byName = Comparator.comparing(School::getName);
        schoolList.sort(byName);
    }

    public ArrayList<School> getSortedSchools() {
        ArrayList<School> sortedList = new ArrayList<>(schoolList);
        Collections.sort(sortedList, new Comparator<School>() {
            public int compare(School s1, School s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        return sortedList;
    }
}
