import java.util.UUID;
import java.util.ArrayList;

public class VolGroup extends PhysDrive
{
    private String name;
    private int size;
    private UUID id;

    ArrayList<PhysVol> totalSize = new ArrayList<PhysVol>();
    /*public void setSize()
    {
        for (int i = 0; i < totalSize.size(); i++)
        {
            size += totalSize.get(i).getSize();
        }
    }*/

    public VolGroup(String name, int size)
    {
        super(name, size);
    }
}