public class Box <A,B,C>{
    private A name;
    private B composition;
    private C colour;

    public Box(A name, B composition, C colour) {
        this.name = name;
        this.composition = composition;
        this.colour = colour;
    }

    public Box() {
    }

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }

    public B getComposition() {
        return composition;
    }

    public void setComposition(B composition) {
        this.composition = composition;
    }

    public C getColour() {
        return colour;
    }

    public void setColour(C colour) {
        this.colour = colour;
    }
    static public Box  b() {

        Box box=new Box("Chocolate","cocoa,flavor,sugar,milk","brown");
        return box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                ", composition=" + composition +
                ", colour=" + colour +
                '}';
    }
}
