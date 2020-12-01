import java.util.*;
class lab
{
    public String test;
    public double price;
    public void diagnostic_tests()
    {
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the test your doctor prescribed\n");
        System.out.println("1.Complete Blood Count\t-->\tRs. 700.00");
        System.out.println("2.MRI Scan\t-->\tRs. 5,000.00");
        System.out.println("3.PET/CT Scan\t-->\tRs. 10,000.00");
        System.out.println("4.RT PCR based COVID test\t-->\tRs.1,200.00");
        choice = scan.nextInt();
        scan.close();
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

                price = 0;
                break;
        }
    }
    
    public void lab_info()
    {
        System.out.println("The lab test you have choosen is " + test + " and it costs you " + price);
    }
}



public class Hospital 
{
    public static void main(String[] args) 
    {


        // Doctor doc = new Doctor();
        // doc.new_doctor();
        // doc.doctor_info();

        // patient p1 = new patient();
        // p1.new_patient();
        // p1.patient_info();

        // staff s = new staff();
        // s.new_staff();
        // s.staff_info();

        lab l = new lab();
        l.diagnostic_tests();
        l.lab_info();


        
    }
 
}