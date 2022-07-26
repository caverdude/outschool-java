package food.fruit;

import java.awt.Color;

public abstract class GeneralFruit extends Food implements Fruit{
    
    private Color fruitColor;
    public void setColor(Color color){
        fruitColor=color;
    }
    public Color getColor(){
        return fruitColor;
    }
    public abstract int getDaysToRipen();
    public abstract int getDaysToRotten();
    public abstract float getPeelThickness();
    public abstract boolean isFuzzy();
}
