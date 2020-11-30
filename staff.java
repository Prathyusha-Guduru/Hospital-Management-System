import java.util.*;
import java.util.HashMap;

public class staff 
{

    String s_name,s_id, designation, sex;
    HashMap<String, String[]> info = new HashMap<String, String[]>();
    public void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Plese enter the following details : ");
        System.out.print("ID number  :\t");
        s_id = input.nextLine();
        System.out.print("Name :\t");
        s_name = input.nextLine();
        System.out.print("Designation :\t");
        designation = input.nextLine();
        System.out.print("sex(M/F/O) :\t");
        sex = input.nextLine();
        
        input.close();

        String info_arr[] = {s_id, designation, sex};
        info.put(s_name,info_arr);
    }

    public void staff_info()
    {
        // System.out.println(info.values().toString());
        // System.out.println(Arrays.toString(info.entrySet().toArray()));
        System.out.println(info.get(this.s_name));
        // System.out.print(info.get(this.d_name)[i]);

        System.out.println(s_name + "  :  "+ info.get(this.s_name)[0] + "\t" + info.get(this.s_name)[1] + "  \t" + info.get(this.s_name)[2] );
    
    }

    // public static void main(String[] args) {
    //     staff s1 = new staff();
    //     s1.new_staff();
    //     s1.staff_info();
    // }

    
}
