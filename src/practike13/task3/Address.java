package practike13.task3;

import java.util.StringTokenizer;

public class Address {

    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String frame;

    private String flat;

    public Address(String country, String region, String city, String street, String house, String frame, String flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.frame = frame;
        this.flat = flat;
    }

    public static Address createUseSplit(String str) {
        String[] arrOfStr = str.split(", ");
        return new Address(arrOfStr[0], arrOfStr[1], arrOfStr[2], arrOfStr[3], arrOfStr[4], arrOfStr[5], arrOfStr[6]);
    }

    public static Address createUseToken(String str) {
        StringTokenizer token = new StringTokenizer(str, ", ");
        String[] arrOfStr = new String[7];
        int i = 0;
        while(token.hasMoreTokens()){
            arrOfStr[i] = token.nextToken();
            i++;
        }
        return new Address(arrOfStr[0], arrOfStr[1], arrOfStr[2], arrOfStr[3], arrOfStr[4], arrOfStr[5], arrOfStr[6]);
    }

    @Override
    public String toString() {
        return this.country +" " + this.region + " " + this.city +" "+this.street+" "+this.house+" "+this.frame;
    }
}
