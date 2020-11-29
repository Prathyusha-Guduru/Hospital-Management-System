// import java.io.*;
import java.util.*;
// import java.util.Calendar;
import java.util.HashMap;


public class Doctor
{
    String d_id, d_name, specialization, appointment, qualification,d_room;
    HashMap<String, String[]> info = new HashMap<String, String[]>();
    public void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        d_id = input.nextLine();
        System.out.print("name:-");
        d_name = input.nextLine();
        System.out.print("specilization:-");
        specialization = input.nextLine();
        System.out.print("work time:-");
        appointment = input.nextLine();
        System.out.print("qualification:-");
        qualification = input.nextLine();
        System.out.print("room no.:-");
        d_room = input.nextLine();
        input.close();

        String info_arr[] = {d_id,specialization,appointment,qualification,d_room};
        info.put(d_name,info_arr);
    }

    public void doctor_info()
    {
        // System.out.println(info.values().toString());
        // System.out.println(Arrays.toString(info.entrySet().toArray()));
        System.out.println(Arrays.toString(info.entrySet().toArray()));
    }

    public static void main(String[] args) 
    {
        Doctor doc1 = new Doctor();
        doc1.new_doctor();
        doc1.doctor_info();
    }
}





// public class Doctor {
    
// }
