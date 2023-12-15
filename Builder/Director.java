public class Director {
    Product constructConcreteProduct(Builder builder){
        builder.createProduct();
        builder.buildProperty1("name");
        builder.buildProperty2(44);
        return  builder.getProduct();

    }
}
