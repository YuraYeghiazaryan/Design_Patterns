public class Client {
    public  static void main(String[] args){
        Director director = new Director();

        Builder builder = new Product1Builder();

        Product product = director.constructConcreteProduct(builder);

        System.out.println(product.getProperty1());
    }
}


