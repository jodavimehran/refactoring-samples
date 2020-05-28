package ca.concordia.encs.refactoring.sample.patterns.adapter.twoway;

/**
 * The SquarePeg Target/Adaptee class.
 */
public class SquarePeg3 implements ISquarePeg {
    public void insert(String str) {
        System.out.println("SquarePeg insert(): " + str);
    }
}