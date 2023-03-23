import java.util.ArrayList;

public class VolGroup extends LVM
{
    private ArrayList<PhysVol> pVolumes;
    //private ArrayList<LogVol> lVolumes; uncomment when LogVol class is made

    public VolGroup(String name)
    {
        super(name);
    }

    public void addPhysVol(PhysVol vol)
    {
        pVolumes.add(vol);
    }

    public int gotVolUsed() //get better solution for finding size of VG
    {
        int vol = 0;
        for (int i = 0; i < pVolumes.size(); i++)
        {
            vol += pVolumes.get(i).getSize();
        }
        return vol;
    }
}