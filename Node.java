abstract class Node{
    abstract double calculate();
}

abstract class OpNode extends Node {
    Node left;
    Node right;

    abstract double calculate();
}

class ValueNode extends Node {

    double value;

    public ValueNode(double value)
    {
        this.value = value;
    }

    @Override
    double calculate() {
        return this.value;
    }
}

class polymorphismTest {
    public static void main(String[] args)
    {
        AdditionNode treeExample = new AdditionNode(
                new MultiplicationNode(
                        new ValueNode(7),
                        new ValueNode(1)),
                new SubtractionNode(
                        new MultiplicationNode(
                                new ValueNode(1),
                                new ValueNode(3)),
                        new ValueNode(5)
                ));
        System.out.println(treeExample.calculate());
    }
}

/*
 * Sub Classes to extend the functionality of the app.
 */
class AdditionNode extends OpNode {
    AdditionNode(Node n1, Node n2) {
        super();
        this.left = n1;
        this.right = n2;
    }

    double calculate()
    {
        return left.calculate() + right.calculate();
    }
}

class SubtractionNode extends OpNode {
    SubtractionNode(Node n1, Node n2) {
        super();
        this.left = n1;
        this.right = n2;
    }

    @Override
    double calculate() {
        return this.left.calculate() - this.right.calculate();
    }
}

class MultiplicationNode extends OpNode {
    MultiplicationNode(Node n1, Node n2) {
        super();
        this.left = n1;
        this.right = n2;
    }
    double calculate()
    {
        return left.calculate() * right.calculate();
    }
}