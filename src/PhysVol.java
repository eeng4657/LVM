public class PhysVol extends LVM
{
    private PhysDrive assign;
    public PhysVol(String name, int size, PhysDrive assign)
    {
        super(name, size);
        this.assign = assign;
    }

    public PhysDrive getAssignment()
    {
        return this.assign;
    }
}
