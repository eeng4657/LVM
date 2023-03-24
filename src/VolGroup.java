import java.util.ArrayList;

public class VolGroup extends LVM
{
    private ArrayList<PhysVol> pVolumes;
    private int pSize;
    private ArrayList<LogVol> lVolumes;
    private int spaceTaken;

    public VolGroup(String name)
    {
        super(name);
    }

    public void addPhysVol(PhysVol pVol)
    {
        pVolumes.add(pVol);
    }

    public void addLogVol(LogVol lVol)
    {
        lVolumes.add(lVol);
    }

    public int getPSize()
    {
        for (int i = 0; i < pVolumes.size(); i++)
        {
            pSize += pVolumes.get(i).getAssignment().getSize();
        }
        return pSize;
    }

    public int getSpaceTaken()
    {
        for (int i = 0; i < lVolumes.size(); i++)
        {
            spaceTaken += lVolumes.get(i).getSize();
        }
        return spaceTaken;
    }

    public boolean enoughSpace(LogVol lVol)
    {
        if ((getSpaceTaken() + lVol.getSize()) > getPSize())
        {
            return true;
        }
        else return false;
    }
}