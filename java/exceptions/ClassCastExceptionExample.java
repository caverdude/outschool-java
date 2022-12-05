public class ClassCastExceptionExample {
    public static void main(String args[]){
        FoodBasket foodBasket = new FoodBasket();
        Apple apple = new Apple();
        Tomato tomato = new Tomato();

        foodBasket.add(apple);
        foodBasket.add(tomato);
        
        System.out.println("Apple is an instance of Fruit is "+
            (foodBasket.get(0)instanceof Fruit));
        System.out.println("Apple-"+(Vegetable)foodBasket.get(0));
        System.out.println("Tomato-"+foodBasket.get(1));
        while(true);
    }
}
