package color;

public enum Color {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");
    private String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
