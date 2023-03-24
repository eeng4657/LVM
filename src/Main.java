import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the LVM System");
        Scanner a = new Scanner(System.in);
        System.out.print("cmd#: ");
        String cmd = a.nextLine();

        if (cmd.substring(0, cmd.indexOf(" ")).equals("install"))
        {
            //
        }
        else if (cmd.substring(0, cmd.indexOf(" ")).equals("pvcreate"))
        {
            //
        }
        else if (cmd.substring(0, cmd.indexOf(" ")).equals("vgcreate"))
        {
            //
        }
        else if (cmd.substring(0, cmd.indexOf(" ")).equals("vgextend"))
        {
            //
        }
        else if (cmd.substring(0, cmd.indexOf(" ")).equals("lvcreate"))
        {
            //
        }
        else if (cmd.substring(0, cmd.indexOf(" ")).equals("list-drives"))
        {
            //
        }
        else if (cmd.substring(0, cmd.indexOf(" ")).equals("pvlist"))
        {
            //
        }
        else if (cmd.substring(0, cmd.indexOf(" ")).equals("vglist"))
        {
            //
        }
        else if (cmd.substring(0, cmd.indexOf(" ")).equals("lvlist"))
        {
            //
        }
    }
}