// Refined Abstraction 1: Chair
public class Chair extends Furniture{

    public Chair(Material material) {
        super(material);
    }

    @Override
    void manufacture() {
        System.out.print("Manufacturing Chair with ");
        material.applyMaterial();
    }
}
