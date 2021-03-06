package lecture06.enums;

/**
 * Class Color
 *
 * Created by yslabko on 12/06/2017.
 */
public enum Color {
    BLACK("Black color"),
    RED("Red color");
    private String color;
    static {
        System.out.println("Static");
    }

    Color(String color) {
        this.color = color;
        System.out.println("Constructor");
    }
    {
        System.out.println("Logic");
    }

    public String getColor() {
        return color;
    }

    public static Color getByColor(String color) {
        for (Color current : Color.values()) {
           if (current.color.equals(color)) {
                return current;
            }
        }

        throw new EnumConstantNotPresentException(Color.class, "No such enum");
    }
}
