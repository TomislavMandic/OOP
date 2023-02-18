public class Main {
        public static void main(String[] args){
                Pizza pizza = new Pizza("Integralno pecivo", "rajcica", "mozzarela", "tomato sauce");
                System.out.println("Ovo su sastojci za pizzu: ");
                System.out.println(pizza.bread);
                System.out.println(pizza.cheese);
                System.out.println(pizza.topping);
                System.out.println(pizza.sauce);
        }
}