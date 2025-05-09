package ru.bsuedu.cad.lab;

public class ConsoleTableRenderer implements Renderer{

    @Override
    public void render() {
        var product = productProvider.getProducts();
        System.out.println(product);
    }
    final private ProductProvider productProvider;
    public ConsoleTableRenderer(ProductProvider productProvider) {
        this.productProvider = productProvider;
    }
    
}