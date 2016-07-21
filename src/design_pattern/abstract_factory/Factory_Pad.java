package design_pattern.abstract_factory;

/**
 * Created by zjutK on 16/7/20.
 */
public class Factory_Pad implements Factory {
    @Override
    public Apple CreateAppleProduct() {
        return new ipad();
    }

    @Override
    public Sumsung CreateSumsungProduct() {
        return new note2();
    }
}
