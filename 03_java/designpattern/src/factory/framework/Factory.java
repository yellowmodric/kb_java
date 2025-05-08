package factory.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = create(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
