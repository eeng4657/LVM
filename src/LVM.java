import java.util.UUID;

public class LVM
{
    private String name;
    private int size;
    private UUID id;

    public LVM(String name, int size)
    {
        this.name = name;
        this.size = size;
        this.id = UUID.randomUUID();
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
