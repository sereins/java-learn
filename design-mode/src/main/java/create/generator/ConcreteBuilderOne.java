package create.generator;

public class ConcreteBuilderOne implements Builder {
    private Product product;

    public ConcreteBuilderOne() {
        product = new Product();
    }

    @Override
    public void componentA() {
        product.componentA = "one A";
    }

    @Override
    public void componentB() {
        product.componentB = "one B";
    }

    @Override
    public void componentC() {
        product.componentC = "one C";
    }

    @Override
    public Product getProduct() {
        System.out.println(product.componentB);
        System.out.println(product.componentA);
        System.out.println(product.componentC);

        return product;
    }
}
