import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
    }

    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        } else {
            return;
        }
    }

}
