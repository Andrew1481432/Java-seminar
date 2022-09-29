package practike6;

public class Student {

    private int idNumber;

    private int totalPoints;

    Student(int idNumber, int totalPoints) {
        this.idNumber = idNumber;
        this.totalPoints = totalPoints;
    }

    Student(int idNumber) {
        this.idNumber = idNumber;
        this.totalPoints = 0;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
