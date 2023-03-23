import java.util.UUID;

public class PhysVol extends LVM
{
    private String name;
    private int size;
    private UUID id;
    private PhysDrive assign;

    public PhysVol(String name, int size, PhysDrive assign)
    {
        super(name, size);
        this.assign = assign;
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

    public PhysDrive getAssignment()
    {
        return this.assign;
    }
}
