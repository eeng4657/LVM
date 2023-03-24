public class PhysVol extends LVM
{
    private PhysDrive assign;
    public PhysVol(String name, PhysDrive assign)
    {
        super(name);
        this.assign = assign;
    }

    public PhysDrive getAssignment()
    {
        return this.assign;
    }
}