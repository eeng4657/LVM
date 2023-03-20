import java.util.UUID;

public class PhysVol extends PhysDrive
{
    private String name;
    private int size;
    private UUID id;

    public PhysVol(String name, int size)
    {
        super(name, size);
    }

    public String getName()
    {
        return this.name;
    }

    public int getSize()
    {
        return this.size;
    }

    public UUID getId()
    {
        return this.id;
    }
}
