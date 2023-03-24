public class PhysDrive extends LVM
{
    private int size;
    public PhysDrive(String name, int size)
    {
        super(name);
        this.size = size;
    }

    public int getSize()
    {
        return this.size;
    }
}
