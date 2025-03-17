
public class BridgePatternTest {

    public static void main(String[] args) {
        // Create a wooden chair
        Furniture woodenChair = new Chair(new Wood());
        woodenChair.manufacture();

        // Create a plastic chair
        Furniture plasticChair = new Chair(new Plastic());
        plasticChair.manufacture();


        // Create a plastic table
        Furniture plasticTable = new Table(new Plastic());
        plasticTable.manufacture();

        // Create a metal bed
        Furniture metalBed = new Bed(new Metal());
        metalBed.manufacture();
    }
}
