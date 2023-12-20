import java.util.*;
import java.io.*;
import java.lang.*;
class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void sccheck(){
        Console console = System.console();
        System.out.print("Press enter to clear the screen and continue: ");
        String input = console.readLine();
        if (true) {
            clearScreen();
        }
    }
    public static void showdetails(int n , ArrayList<student> l1){
        for(student stu : l1){
            if(stu.getroll() == n){
                System.out.println("\n============ Details of Student Searched ============");
                System.out.println("\nROLL NO = "+stu.getroll());
                System.out.println("NAME = "+stu.getname());
                System.out.println("ADDRESS = "+stu.getAddress());
                System.out.println("EMAIL = "+stu.getEmail());
                System.out.println("\n============ ============ ============ ============\n");
                return;
            }
        }
        System.out.println("No Student with the Roll No exists .");
    }
    public static int showpercentage(int n, ArrayList<student> l1){
        int theorymarks = 0 , labmarks = 0 , percentage = 0;
        for (student stu : l1) {
            if (stu.getroll() == n) {
                boolean found = true;
                theorymarks = stu.getPhysics() + stu.getChemistry() + stu.getBiology();
                labmarks = stu.getBiolab() + stu.getChemlab() + stu.getPhylab();
                percentage = (int)(((double)(theorymarks + labmarks) / 600.0) * 100.0);
                return percentage;
            }
        }
        return -1;
    }
    public static String showgradesub(int percentage){
        String grade = "";
        if (percentage > 90) {
            grade = "A+";
        } else if (percentage > 80) {
            grade = "A";
        } else if (percentage > 70) {
            grade = "B";
        } else if (percentage > 60) {
            grade = "C";
        } else if (percentage > 50) {
            grade = "D";
        } else if (percentage > 40) {
            grade = "E";
        } else {
            grade = "F";
        }
        return grade;
    }
    public static void showToppers(ArrayList<student> students) {
        int topPhysics = -1, topChemistry = -1, topBiology = -1;
        int topPhylab = -1, topChemlab = -1, topBiolab = -1;
        String topperPhysics = "", topperChemistry = "", topperBiology = "";
        String topperPhylab = "", topperChemlab = "", topperBiolab = "";

        for (student stu : students) {
            int physics = stu.getPhysics();
            int chemistry = stu.getChemistry();
            int biology = stu.getBiology();
            int phylab = stu.getPhylab();
            int chemlab = stu.getChemlab();
            int biolab = stu.getBiolab();

            if (physics > topPhysics) {
                topPhysics = physics;
                topperPhysics = stu.getname();
            }
            if (chemistry > topChemistry) {
                topChemistry = chemistry;
                topperChemistry = stu.getname();
            }
            if (biology > topBiology) {
                topBiology = biology;
                topperBiology = stu.getname();
            }
            if (phylab > topPhylab) {
                topPhylab = phylab;
                topperPhylab = stu.getname();
            }
            if (chemlab > topChemlab) {
                topChemlab = chemlab;
                topperChemlab = stu.getname();
            }
            if (biolab > topBiolab) {
                topBiolab = biolab;
                topperBiolab = stu.getname();
            }
        }
        System.out.println("\n================= List of Toppers =================");
        System.out.println("\nTopper in Physics: " + topperPhysics + " with a score of " + topPhysics);
        System.out.println("Topper in Chemistry: " + topperChemistry + " with a score of " + topChemistry);
        System.out.println("Topper in Biology: " + topperBiology + " with a score of " + topBiology);
        System.out.println("Topper in Physics Lab: " + topperPhylab + " with a score of " + topPhylab);
        System.out.println("Topper in Chemistry Lab: " + topperChemlab + " with a score of " + topChemlab);
        System.out.println("Topper in Biology Lab: " + topperBiolab + " with a score of " + topBiolab);
        System.out.println("\n============ ============ ============ ============\n");
    }
    public static void showmarks(int n , ArrayList<student> l1){
        for(student stu : l1){
            if(stu.getroll() == n){
                System.out.println("\n============ Marks of Student Searched ============");
                System.out.println("\nPHYSICS = "+stu.getPhysics()+"  GRADE = "+showgradesub(stu.getPhysics()));
                System.out.println("CHEMISTRY = "+stu.getChemistry()+"  GRADE = "+showgradesub(stu.getChemistry()));
                System.out.println("BIOLOGY = "+stu.getBiology()+"  GRADE = "+showgradesub(stu.getBiology()));
                System.out.println("PHYSICS LAB = "+stu.getPhylab()+"  GRADE = "+showgradesub(stu.getPhylab()));
                System.out.println("CHEMISTRY LAB = "+stu.getChemlab()+"  GRADE = "+showgradesub(stu.getChemlab()));
                System.out.println("BIOLOGY LAB = "+stu.getBiolab()+"  GRADE = "+showgradesub(stu.getBiolab()));
                System.out.println("OVERALL PERCENTAGE = "+showpercentage(n,l1)+"%  GRADE = "+showgradesub(showpercentage(n,l1)));
                System.out.println("\n============ ============ ============ ============\n");
                break;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<student> l1 = new ArrayList<student>();

        Scanner sc = new Scanner(System.in);
        while(true){
            clearScreen();
            System.out.println("1) Add a student .");
            System.out.println("2) Show details of a student .");
            System.out.println("3) Show marks of a student .");
            System.out.println("4) Show list of students .");
            System.out.println("5) Show the percentage and grade of the student .");
            System.out.println("6) Show the toppers of the Subject .");
            System.out.println("-1) Exit the program .");
            System.out.print("\n\nenter you choice :- ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    boolean done = true;
                    while(done) {
                        boolean find = false;
                        clearScreen();
                        System.out.println("\n============ Enter details ============\n");
                        System.out.print("enter the roll :- ");
                        int roll = sc.nextInt();
                        for (student stu : l1) {
                            if (stu.getroll() == roll) {
                                clearScreen();
                                System.out.println("A student with same roll no already existed .");
                                showdetails(roll, l1);
                                sc.nextLine();
                                System.out.print("\nDo you want to add details of another student (Yes/No) :- ");
                                String choiceAddAnother = sc.nextLine();

                                if (choiceAddAnother.equals("Yes")) {
                                    find = true;
                                } else{
                                    done = false;
                                    find = true;
                                }
                                break;
                            }
                        }
                        if(find) {
                            clearScreen();
                            continue;
                        }
                        student st = new student();
                        sc.nextLine();
                        System.out.print("enter the name :- ");
                        String name = sc.nextLine();
                        System.out.print("enter the address :- ");
                        String address = sc.nextLine();
                        System.out.print("enter the email :- ");
                        String email = sc.nextLine();
                        System.out.print("enter the physics marks :- ");
                        int phy = sc.nextInt();
                        System.out.print("enter the chemistry marks :- ");
                        int chm = sc.nextInt();
                        System.out.print("enter the biology marks :- ");
                        int bio = sc.nextInt();
                        System.out.print("enter the physics_lab marks :- ");
                        int phl = sc.nextInt();
                        System.out.print("enter the chemistry_lab marks :- ");
                        int chl = sc.nextInt();
                        System.out.print("enter the biology_lab marks :- ");
                        int bil = sc.nextInt();
                        st.setdetails(name, address, email, roll, phy, chm, bio, phl, chl, bil);
                        l1.add(st);
                        System.out.println("succesfully registered");
                        System.out.println("\n========= ========= ========= =========\n");
                        sc.nextLine();
                        System.out.print("Do you want to add details of more students (Yes/No) :- ");
                        String choice = sc.nextLine();
                        if (choice.equals("Yes")) {
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                    sccheck();
                    break;
                case 2:
                    clearScreen();
                    while(true) {
                        System.out.print("enter the roll no :- ");
                        int n = sc.nextInt();
                        showdetails(n, l1);
                        System.out.print("\n\nDo you want to see the marks of the Student (Yes/No) :- ");
                        sc.nextLine();
                        String choice = sc.nextLine();
                        if (choice.equals("Yes")) {
                            showmarks(n, l1);
                        }
                        System.out.print("Do you want to see details of more students (Yes/No) :- ");
                        choice = sc.nextLine();
                        if (choice.equals("Yes")) {
                            continue;
                        } else{
                            break;
                        }
                    }
                    sccheck();
                    break;
                case 3:
                    clearScreen();
                    System.out.print("enter the roll no :- ");
                    int nm = sc.nextInt();
                    showmarks(nm,l1);
                    sccheck();
                    break;
                case 4:
                    clearScreen();
                    for(student stu : l1) {
                        System.out.println(stu.getroll()+" - "+stu.getname());
                    }
                    sccheck();
                    break;
                case 5:
                    clearScreen();
                    while(true) {
                        System.out.print("enter the roll no :- ");
                        nm = sc.nextInt();
                        sc.nextLine();
                        int percentage = showpercentage(nm,l1);
                        if(percentage != -1){
                            System.out.println(" PERCENTAGE = " + percentage + "\n");
                            String grade = showgradesub(percentage);
                            System.out.println(" GRADE = " + grade + "\n");
                        }
                        System.out.print("Do you want to see details of more students (Yes/No) :- ");
                        String choice = sc.nextLine();
                        if (choice.equals("Yes")) {
                            continue;
                        } else{
                            break;
                        }
                    }
                    sccheck();
                    break;
                case 6:
                    clearScreen();
                    showToppers(l1);
                    sccheck();
                    break;
                case -1:
                    clearScreen();
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input.");
            }
        }
    }
}