class ResistorColorDuo {
    int value(String[] colors) {
        return colorValue(colors[0]) * 10 + colorValue(colors[1]);
    }

    private int colorValue(String color) {
        return switch (color.toLowerCase()){
            case "black" -> 0;
            case "brown" -> 1;
            case "red" -> 2;
            case "orange" -> 3;
            case "yellow" -> 4;
            case "green" -> 5;
            case "blue" -> 6;
            case "violet" -> 7;
            case "grey" -> 8;
            case "white" -> 9;
            default -> throw new IllegalArgumentException("Invalid color parameter: " + color);
        };
    }
}
