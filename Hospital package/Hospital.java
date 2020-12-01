import java.util.*;
import java.util.HashMap;
import java.util.Random;


class patient
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
        // input.close();
        
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
}


class lab
{
    public String test;
    public double price;
    public void diagnostic_tests()
    {
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the test your doctor prescribed)\n");
        System.out.println("1.Complete Blood Count\t-->\tRs. 700.00");
        System.out.println("2.MRI Scan\t-->\tRs. 5,000.00");
        System.out.println("3.PET/CT Scan\t-->\tRs. 10,000.00");
        System.out.println("4.RT PCR based COVID test\t-->\tRs.1,200.00");
        System.out.println("(Press any integer key other than ones present if your prescribed test in not there in the menu )");
        choice = scan.nextInt();
        // scan.close();
        

        switch (choice) {
            case 1:
                test = "Blood test";
                price = 700.00;
                break;
            case 2:
                test = "MRI Scan";
                price = 5000.00;
                break;
            case 3:
                test = "CT Scan";
                price = 10000.00;
                break;
            case 4:
                test = "Covid test ";
                price = 1200.00;
                break;
            default:
                Scanner scan_test = new Scanner(System.in);
                System.out.println("Enter the name of the test your doctor prescribed if its not in the menu \n");
                test = scan_test.nextLine();
                // scan_test.close();
                // Random rand = new Random();
                price = Math.random() * (5000 - 500 + 1) + 500; 
                //Generating a random number between 1000 to 10,000 for tests not present in the menu 
                break;
        }
    }
    public void lab_info()
    {
        
        System.out.println("The lab test you have choosen is " + test + " and it costs you Rs. " + price + " .");
    }
    
}
    

class Doctor
{
    String d_id, d_name, specialization, appointment, qualification,d_room;
    HashMap<String, String[]> info = new HashMap<String, String[]>();
    public void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Plese enter the following details of the doctor : ");
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
        // input.close();

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

class staff 
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
        
        // input.close();

        String info_arr[] = {s_id, designation, sex};
        info.put(s_name,info_arr);
    }

    public void staff_info()
    {
        // System.out.println(info.values().toString());
        // System.out.println(Arrays.toString(info.entrySet().toArray()));
        System.out.println(info.get(this.s_name));
        // System.out.print(info.get(this.d_name)[i]);

        System.out.println("Name : " + s_name);
        System.out.println("ID   : " + info.get(this.s_name)[0]);
        System.out.println("Designation : " + info.get(this.s_name)[1]);
        System.out.println("Sex : "+ info.get(this.s_name)[2]);
        // System.out.println(s_name + "  :  "+ info.get(this.s_name)[0] + "\t" + info.get(this.s_name)[1] + "  \t" + info.get(this.s_name)[2] );
    
    }

    // public static void main(String[] args) {
    //     staff s1 = new staff();
    //     s1.new_staff();
    //     s1.staff_info();
    // }

    
}

// class medicines()
// {

// }

class medicines 
{
    public String medicine;
    public double price;

    public void medical_store()
    {
        HashMap<String, Double> Common_Medicines = new HashMap<String, Double>();
        Common_Medicines.put("Paracetamol             " ,(double)100);
        Common_Medicines.put("Antihistamines          " ,(double)250);
        Common_Medicines.put("Cough medicine          " ,(double)180);
        Common_Medicines.put("Eye drops               " ,(double)154);
        Common_Medicines.put("Bandages and gauze pads " ,(double)200);
        Common_Medicines.put("Antiseptics             " ,(double)240);
        Common_Medicines.put("Soframycin              " ,(double)190);
        Common_Medicines.put("Sanitizer               " ,(double)300);
        Common_Medicines.put("Disposable Mask         " ,(double)10);
        Common_Medicines.put("Reusable Mask           " ,(double)100);
        Common_Medicines.put("Disposable gloves       " ,(double)20);
        Common_Medicines.put("Face sheild             " ,(double)300);
        int x = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("This is the list of commonly purchased medicines : ");
        System.out.println("Enter the name item you need from the list");
        for (String i : Common_Medicines.keySet()) {
            System.out.println(x + ". " + i + "\tRs. " + Common_Medicines.get(i));
            x++;
        }
        System.out.println("If you need something else which is not present in the list please enter its name ");
        medicine = input.nextLine();
        if (Common_Medicines.containsKey(medicine))
        {
            price = Common_Medicines.get(medicine);
        }
        else 
        {
            price = Math.random() * (1000 - 10 + 1) + 10; 
        }
    }

    public void medicines_bill()
    {
        System.out.println("The item you choose is " + medicine + " and it costs Rs. "+ price);
    }
    
    
}



public class Hospital 
{
    public static void main(String[] args) 
    {


        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");

        char main_choice = 'y';
        do 
        {
            int choice;
            System.out.println("--------------------------------------MAIN MENU----------------------------------\n\n");
            Scanner scan = new Scanner(System.in);
            System.out.println("*************** Which section would you like to visit  ***************");
            System.out.println("1. Doctors ");
            System.out.println("2. Patients ");
            System.out.println("3. Laboratory");
            System.out.println("4. Medical Store");
            System.out.println("5. General Staff ");
            System.out.println("6. EXIT          ");
            choice = scan.nextInt();

            switch (choice) {
                case 1 :
                    Doctor d = new Doctor();
                    d.new_doctor();
                    d.doctor_info();
                    break;
                case 2:
                    patient p = new patient();
                    p.new_patient();
                    p.patient_info();
                    break;
                case 3:
                    lab l = new lab();
                    l.diagnostic_tests();
                    l.lab_info();
                    break;
                case 4:
                    medicines m = new medicines();
                    m.medical_store();
                    m.medicines_bill();
                    break;
                case 5:
                    staff s = new staff();
                    s.new_staff();
                    s.staff_info();
                    break;
                case 6:
                    main_choice = 'n';
            
                default:
                    System.out.println("Enter the correct option");
                    break;
            }


        } while (main_choice == 'y'|| main_choice == '1' || main_choice == 'Y');
        
        // Doctor doc = new Doctor();
        // doc.new_doctor();
        // doc.doctor_info();

        // patient p1 = new patient();
        // p1.new_patient();
        // p1.patient_info();

        // staff s = new staff();
        // s.new_staff();
        // s.staff_info();

        // lab l = new lab();
        // l.diagnostic_tests();
        // l.lab_info();


        
    }
 
}