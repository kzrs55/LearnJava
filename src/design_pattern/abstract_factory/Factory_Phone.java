package design_pattern.abstract_factory;

/**
 * Created by zjutK on 16/7/20.
 */
public class Factory_Phone implements Factory{
    @Override
    public Apple CreateAppleProduct() {
        return new iphone();
    }

    @Override
    public Sumsung CreateSumsungProduct() {
        return new S7edge();
    }
}
