public class Product1Builder implements Builder{
    private String property1;
    private int property2;

    Product product; //= new Product();


    @Override
    public void createProduct() {
        this.product = new Product();
    }

    @Override
    public void buildProperty1(String prop1) {
        product.setProperty1(prop1);
        //this.property1 = prop1;
    }

    @Override
    public void buildProperty2(int prop2) {
        product.setProperty2(prop2);
        //this.property2 = prop2;
    }

    @Override
    public Product getProduct() {
       // return new Product(property1, property2);
        return product;
    }
}
