package practike13.task5;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    /**
     * Constructor for Shirt
     * If input string is incorrect, it trows an exception
     * It uses split()
     * @param shirt is String like "id, description, color, size"
     */

    public Shirt(String shirt){
        String[] partShirt = shirt.split(",");
        if (partShirt.length != 4){
            throw new IllegalArgumentException("Illegal Shirt");
        }
        id = partShirt[0].trim();
        description = partShirt[1].trim();
        color = partShirt[2].trim();
        size = partShirt[3].trim();
    }
    /**
     * override toString for Shirt
     * @return String of Shirt
     */
    @Override
    public String toString() {
        return  "id='" + id + "'\n" +
                "description='" + description + "'\n" +
                "color='" + color + "'\n" +
                "size='" + size + '\'';
    }
}
