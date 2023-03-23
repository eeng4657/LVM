import java.util.UUID;

public class PhysDrive extends LVM
{
    private String name;
    private int size;
    private UUID id;

    public PhysDrive(String name, int size)
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
