import java.lang.Thread.State;
import java.lang.Process;
import java.util.*;
// import java.util.jar.Attributes.Name;

class All_About_Project {
    public static void clearTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls");
                Process process = processBuilder.inheritIO().start();
                process.waitFor();
            } else {
                ProcessBuilder processBuilder = new ProcessBuilder("clear");
                Process process = processBuilder.inheritIO().start();
                process.waitFor();
            }
        } catch (Exception e) {
            // Handle any exceptions
        }
    }

    void HomePage() {
        clearTerminal();
        System.out.println(
                "\n\n---------------------------------GALGOTIAS UNIVERSITY----------------------------------\t\t\n\n");

        System.out.println("-------------- Schools of Galgotias ----------------\n");
        System.out.println(
                "At the School of Galgotias, excellence is what we strive to achieve. \nOur infrastructure, faculty, vision, ideals, and teaching methods make us a premier university\n\n");
        System.out.println("\nThere are many thing to visit:----------------------\n");
        System.out.println(
                "Press- 1: About \nPress- 2: Programs and Fees \nPress- 3: Schools \nPress- 4: Apply Now \nPress- 5: Contact Us \nPress- 6: Exit \n");

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.print("Enter Your choice: ");

        choice = sc.nextInt();
        switch (choice) {

            case 1:
                About();
                break;

            case 2:
                Programs();
                break;

            case 3:
                Schools();
                break;

            case 4:
                ApplyNow();
                break;

            case 5:
                ContactUs();
                break;

            case 6:
                Exit();
                break;

            default:
                System.out.println("\nPlease enter a valid choice:--");
        }
    }

    void About() {
        clearTerminal();
        System.out.println("\n---------------- ABOUT THE GALGOTIAS UNIVERSITY -------------\n");

        System.out.println(
                "\tThe Galgotias University achieved the Highest Benchmark towards Academic Excellence NAAC A+ Accred FirsCycle.\nThis makes Galgotias the Only Private University in Uttar Pradesh with the Highest NAAC Score of 3.37 out of 4 Awarded by NAAC & the Highest Graded Autonomous Institute of the UGC, Ministry of Education, Govt. of India.\n");

        System.out.println(
                "\tThe Galgotias University, Uttar Pradesh, sponsored by Smt. Shakuntala Educational and Welfare Society, has been established by state of Uttar Pradesh under section 2(f) of the UGC Act, 1956 vide The Galgotias University Uttar Pradesh Act, 14 of 2011.\nThe University commenced its operation from the academic session 2011-12.\n");

        Exit_or_Homepage();
    }

    void Programs() {
        clearTerminal();
        System.out.println("\n-------------- Galgotias university Cources, Fees and Eligibility -------------\n");

        System.out.println("Courses \t\t Total tuition Fees \t\t\t Eligibility\n");
        System.out.println(
                "B.Sc. (28 Courses) \t INR 1.45 L - 4.4 L (for 3-4 years) \t 10+2 : 50-60 % Exams :CUETCBSE 12th+1 more");
        System.out.println(
                "MBA/PGDM (14 Courses) \t INR 2.98 L - 4.35 L (for 2-5 years) \t 10+2 : 45-50 % Graduation : 50-60 %Exams :MATCAT+5 more");
        System.out.println(
                "B.A. (7 Courses) \t INR 1.48 L - 2.41 L (for 3 years) \t 10+2 : 50 % Exams :CUETCBSE 12th+1 more");
        System.out.println(
                "BCA (10 Courses) \t INR 2.26 L - 3.95 L (for 3-5 years) \t 10+2 : 50 % Exams :CUETCBSE 12th+1 more");
        System.out.println("B.Com (3 Courses) \t INR 2.95 L - 3.31 L (for 3 years) \t 10+2 : 50 % Exams :CUET");
        System.out.println("B.A. LL.B. (1 Courses) \t INR 5 L (for 5 years) \t\t\t 10+2 : 55 % Exams :CLATCUET");
        System.out.println("D.Pharma (1 Courses) \t INR 2.1 L (for 2 years) \t\t Exams :JEECUP");
        System.out
                .println("D.Pharma (1 Courses) \t INR 2.1 L (for 2 years) \t\t Exams :JEECUP \nAND MANY MORE --------");

        Exit_or_Homepage();

    }

    void Schools() {
        clearTerminal();
        System.out.println("\n------------ SCHOOLS OF GALGOTIAS ------------\t\t\t\n");

        System.out.println(
                "School of Computing Science & Engineering \nSchool of Engineering \nSchool of Agriculture \nSchool of Architecture & Design \nSchool of Basic & Applied Sciences \nSchool of Business \nSchool of Education \nSchool of Finance & Commerce \nSchool of Hospitality & Tourism \nSchool of Law \nSchool of Liberal Education \nSchool of Medical and Allied Sciences \nSchool of NursingUniversity Polytechnic");

        Exit_or_Homepage();

    }

    void ApplyNow() {
        clearTerminal();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------------ APPLICATION FORM ------------");

        System.out.print("\nEnter your Full Name: ");
        String Name = sc.nextLine();

        System.out.print("\nEnter your Gender: ");
        String Gender = sc.nextLine();

        System.out.print("\nEnter your State: ");
        String State = sc.nextLine();

        System.out.print("\nEnter your Distric: ");
        String Distric = sc.nextLine();

        System.out.print("\nEnter Specialization: ");
        String Specialization = sc.nextLine();

        System.out.print("\nEnter your Email: ");
        String Email = sc.nextLine();

        System.out.print("\nEnter your Mobile NUmber: ");
        int Mob_NUm = sc.nextInt();

        System.out.println("\n------------ YOUR ALL DETAILS ARE -----------\t\t\t\n");
        System.out.println("Name: " + Name);
        System.out.println("Gender: " + Gender);
        System.out.println("State: " + State);
        System.out.println("Distric: " + Distric);
        System.out.println("Specialization: " + Specialization);
        System.out.println("Email: " + Email);
        System.out.println("Mobile number: " + Mob_NUm);

        System.out.println("----------- You have SUCESSFULLY APPLIED -------------");
        System.out.println("\n\t------- Thanks for Apply ------\n");

        Exit_or_Homepage();

    }

    void ContactUs() {
        clearTerminal();
        System.out.println("\n------------- CONTACT US -------------\n");
        System.out.println("Galgotias university: \n");

        System.out.println(
                "Plot No.2, Sector 17-A \nYamuna Expressway, \nGreater Noida, Opposite Buddh International Circuit, Gautam Buddh Nagar, \nUttar Pradesh, India");

        System.out.println("\nFor General Enquiry:--- \n");
        System.out.println(
                "Phone: 0120-4806800 \nExamination Helpdesk – Ext = 863 \nAcademic Helpdesk – Ext = 839 / 840 \nERP Helpdesk – Ext = 824 \nAccounts Helpdesk – Ext = 939 / 848 \nPlacement Helpdesk – Ext = 804");

        System.out.println("\nFor National Admission Related Enquiry:--- \n");
        System.out.println(
                "Phone: 0120-4370000 \nPhone: +91-9582847072 \nPhone: +91-9717300418 \nWhatsApp Chat: +91 9971026125 \nEmail:admissions@galgotiasuniversity.edu.in");

        System.out.println("\nFor International Admission Related Enquiry:---\n");
        System.out.println(
                "Phone: 0120-4806884 \nPhone: +91- 7838141101 \nEmail: international.office@galgotiasuniversity.edu.in");
        Exit_or_Homepage();

    }

    void Exit() {

        System.out.println("\n\t\t---------- Thanks for visited ---------\n\n");
    }

    void Exit_or_Homepage() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter 1 for GO To Home page:--\nEnter any Number to Exit:-----\n");

        System.out.print("Enter your choice: ");
        int num = sc.nextInt();

        if (num == 1) {
            HomePage();
        } else {
            Exit();
        }
    }
}

class Project {
    public static void main(String[] args) {

        All_About_Project p = new All_About_Project();
        p.HomePage();
    }
}