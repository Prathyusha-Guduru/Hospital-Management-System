
import java.util.*;

import java.util.HashMap;


public class patient
{
    String p_name, p_id,  disease, age, sex,admit_status;
    HashMap<String, String[]> info = new HashMap<String, String[]>();
    public void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Plese enter the following details : ");
        System.out.print("ID number  :\t");
        p_id = input.nextLine();
        System.out.print("Name :\t");
        p_name = input.nextLine();
        System.out.print("Disease :\t");
        disease = input.nextLine();
        System.out.print("Sex(M/F/O) :\t");
        sex = input.nextLine();
        System.out.print("Admission status :\t");
        admit_status = input.nextLine();
        System.out.print("Age in years :\t");
        age = input.nextLine();
        input.close();

        String info_arr[] = { p_id,  disease, age, sex,admit_status};
        info.put(p_name,info_arr);
    }

    public void patient_info()
    {
        // System.out.println(info.values().toString());
        // System.out.println(Arrays.toString(info.entrySet().toArray()));
        System.out.println(info.get(this.p_name));
        // System.out.print(info.get(this.d_name)[i]);

        System.out.println(p_name + "  :  "+ info.get(this.p_name)[0] + "\t" + info.get(this.p_name)[1] + "  \t" + info.get(this.p_name)[2] + "     \t" + info.get(this.p_name)[3] + "    \t" + info.get(this.p_name)[4]);
    
    }

    // public static void main(String[] args) 
    // {
    //     patient doc1 = new patient();
    //     doc1.new_patient();
    //     doc1.patient_info();
    // }
}





// public class Doctor {
    
// }
