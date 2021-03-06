package ca.concordia.encs.refactoring.sample.patterns.factory;

/**
 * Shape Interface (or Abstract class) that is the super-type of all
 * types of objects produced by the ShapeFactory.
 */
public interface Shape {
    void drawIt(int thickness, String lineType);
}