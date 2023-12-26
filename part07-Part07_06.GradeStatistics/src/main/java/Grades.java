import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public Grades() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addPoints(int point) {
        this.points.add(point);
        this.grades.add(pointsToGrade(point));
    }

    public int averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
        int pointsTotal = 0;

        for (Integer integer : points) {
            pointsTotal += integer;
        }
        return pointsTotal / this.points.size();
    }

    public int averagePointsOfPass() {
        int count = 0;
        int pointsTotal = 0;
        for (Integer integer : points) {
            if (integer >= 50) {
                pointsTotal += integer;
                count++;
            }
        }

        if (count == 0) {
            return -1;
        }

        return pointsTotal / count;
    }

    public double passPercentage(){
        double count = 0;
        for(Integer integer : points){
            if(integer >= 50){
                count++;
            }
        }
        return count * 100 / points.size();
    }

    public static int pointsToGrade(int points) {
 
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
 
        return grade;
    }

    public int numberOfGrade(int grade){
        int count = 0;
        for (Integer integer : grades) {
            if(integer == grade){
                count++;
            }
        }
        return count;
    }
}