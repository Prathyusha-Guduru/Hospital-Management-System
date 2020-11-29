
import java.util.*;

import java.util.HashMap;


public class Doctor
{
    String d_id, d_name, specialization, appointment, qualification,d_room;
    HashMap<String, String[]> info = new HashMap<String, String[]>();
    public void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Plese enter the following details : ");
        System.out.print("ID number  :\t");
        d_id = input.nextLine();
        System.out.print("Name :\t");
        d_name = input.nextLine();
        System.out.print("Specilization :\t");
        specialization = input.nextLine();
        System.out.print("Consultation time :\t");
        appointment = input.nextLine();
        System.out.print("Qualification :\t");
        qualification = input.nextLine();
        System.out.print("Cabin number :\t");
        d_room = input.nextLine();
        input.close();

        String info_arr[] = {d_id,specialization,appointment,qualification,d_room};
        info.put(d_name,info_arr);
    }

    public void doctor_info()
    {
        // System.out.println(info.values().toString());
        // System.out.println(Arrays.toString(info.entrySet().toArray()));
        System.out.println(info.get(this.d_name));
        // System.out.print(info.get(this.d_name)[i]);

        System.out.println(d_name + "  :  "+ info.get(this.d_name)[0] + "\t" + info.get(this.d_name)[1] + "  \t" + info.get(this.d_name)[2] + "     \t" + info.get(this.d_name)[3] + "    \t" + info.get(this.d_name)[4]);
    
    }

    // public static void main(String[] args) 
    // {
    //     Doctor doc1 = new Doctor();
    //     doc1.new_doctor();
    //     doc1.doctor_info();
    // }
}





// public class Doctor {
    
// }
