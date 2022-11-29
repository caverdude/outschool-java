package food.fruit;
import javafx.scene.paint.Color;

interface Fruit {
    Color RED_FRUIT=Color.RED;
    Color YELLOW_FRUIT=Color.YELLOW;
    Color BLUE_FRUIT=Color.BLUE;
    Color GREEN_FRUIT=Color.GREEN;
    Color ORANGE_FRUIT=Color.ORANGE;
    Color BROWN_FRUIT=Color.BROWN;
    void setColor(Color color);
    Color getColor();
    
}