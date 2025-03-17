// Refined Abstraction 2: Table
public class Table extends Furniture{

    public Table(Material material) {
        super(material);
    }

    @Override
    void manufacture() {
        System.out.print("Manufacturing Table with ");
        material.applyMaterial();
    }
}
