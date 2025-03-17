
// Abstraction: Furniture
public abstract class Furniture {
    protected Material material;

    public Furniture(Material material) {
        this.material = material;
    }

    abstract void manufacture();
}
