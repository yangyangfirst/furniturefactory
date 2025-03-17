// Refined Abstraction 3: Bed
public class Bed extends Furniture{
    public Bed(Material material) {
        super(material);
    }

    @Override
    void manufacture() {
        System.out.print("Manufacturing Bed with ");
        material.applyMaterial();
    }
}
