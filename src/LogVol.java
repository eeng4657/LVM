public class LogVol extends LVM
{
    private VolGroup assign;
    private int size;

    public LogVol(String name, int size, VolGroup assign)
    {
        super(name);
        this.size = size;
        this.assign = assign;
    }

    public int getSize()
    {
        return this.size;
    }

    public VolGroup getAssignment()
    {
        return this.assign;
    }
}