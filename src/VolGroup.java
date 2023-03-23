import java.util.UUID;
//import java.util.ArrayList;

public class VolGroup extends LVM
{
    private String name;
    private int size;
    private UUID id;

    public VolGroup(String name, int size)
    {
        super(name, size);
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public UUID getId() {
        return this.id;
    }
}