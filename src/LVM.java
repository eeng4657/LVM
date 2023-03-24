import java.util.UUID;

public class LVM
{
    private String name;
    private UUID id;

    public LVM (String name)
    {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName()
    {
        return this.name;
    }

    public UUID getId()
    {
        return this.id;
    }
}