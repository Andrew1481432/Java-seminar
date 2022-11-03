package practike13.task2;

public class Person {
    private String firstName;
    private String familyName;

    private String patronymic;

    public Person(String familyName, String firstName, String patronymic) {
        this(familyName);

        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public Person(String familyName) {
        this.familyName = familyName;
    }

    public String getShortFIO() {
        StringBuilder result = new StringBuilder();
        result.append(this.familyName);
        if(this.firstName != null && this.patronymic != null) {
            result.append(" ");
            result.append(this.firstName.charAt(0)).append(".");
            result.append(this.patronymic.charAt(0)).append(".");
        }
        return result.toString();
    }
}
