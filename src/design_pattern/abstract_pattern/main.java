package design_pattern.abstract_pattern;

/**
 * Created by zjutK on 16/7/20.
 */
public class main {
    public static void main(String[] args) {
        Factory factory = new Factory_Phone();
        Apple apple = factory.CreateAppleProduct();
        apple.AppleStyle();
        Sumsung sumsung = factory.CreateSumsungProduct();
        sumsung.SumsungStyle();


        factory = new Factory_Pad();
        Apple ipad = factory.CreateAppleProduct();
        ipad.AppleStyle();
        Sumsung note2 = factory.CreateSumsungProduct();
        note2.SumsungStyle();
    }
}
