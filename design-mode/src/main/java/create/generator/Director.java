package create.generator;

public class Director {
    private final Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product constructProduct(){
        builder.componentA();
        builder.componentB();
        builder.componentC();

        return builder.getProduct();
    }
}
