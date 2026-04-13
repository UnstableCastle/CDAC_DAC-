public class EnumDemo {
    
    public enum Coffee {
        LATTE(120), AMERICANO(150), CAPPUCCINO(130);
        
        private int price;

       private Coffee(int price) {
            this.price = price;
        }
        
        public int getPrice() {
            return price;
        }
    }
    
    public static void main(String[] args) {
        Coffee c = Coffee.LATTE;
        Coffee c1 = Coffee.AMERICANO;
        System.out.println(c + " costs Rs: " + c.getPrice());
        System.out.println(c1 + " costs Rs: " + c.getPrice());
    }
}