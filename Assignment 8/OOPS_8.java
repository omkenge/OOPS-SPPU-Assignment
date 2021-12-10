import java.io.*;
import java.util.*;

class OOPS_8 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void Create() throws IOException {
        // Create or Modify a file for Database
        PrintWriter pw = new PrintWriter(new BufferedWriter(
                new FileWriter("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt", true)));
        String id, fname, mname, lname, Class, address;
        int age;
        long marks;
        String s;
        boolean addMore = false;
        // Read Data
        do {
            System.out.print("\nEnter ID: ");
            id = br.readLine();

            System.out.print("\nEnter First name: ");
            fname = br.readLine();

            System.out.print("Enter Middle Name: ");
            mname = br.readLine();

            System.out.print("Enter Surname: ");
            lname = br.readLine();

            System.out.print("Enter Address: ");
            address = br.readLine();

            System.out.print("Enter Class: ");
            Class = br.readLine();

            System.out.print("Enter Age: ");
            age = Integer.parseInt(br.readLine());

            System.out.print("Enter Marks: ");
            marks = Long.parseLong(br.readLine());
            // Print to File
            pw.println(id);
            pw.println(fname);
            pw.println(mname);
            pw.println(lname);
            pw.println(address);
            pw.println(Class);
            pw.println(marks);
            pw.println(age);

            System.out.print("\nRecords added successfully !\n\nDo you want to add more records ? (y/n) : ");
            s = br.readLine();
            if (s.equalsIgnoreCase("y")) {
                addMore = true;
                System.out.println();
            } else
                addMore = false;
        } while (addMore);
        pw.close();
        showMenu();
    }

    public void Display() throws IOException {
        try {
            // Open the file
            BufferedReader file = new BufferedReader(
                    new FileReader("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt"));
            String id;
            int i = 1;
            int j;
            // Read records from the file
            while ((id = file.readLine()) != null) {
                System.out.println("Sr.No. : " + (i++));
                System.out.println("-------------");
                System.out.println("ID :" + id);
                System.out.println("First Name: " + file.readLine());
                System.out.println("Father's Name : " + file.readLine());
                System.out.println("Surname : " + file.readLine());
                System.out.println("Address: " + file.readLine());
                System.out.println("Class: " + file.readLine());
                System.out.println("Marks: " + Long.parseLong(file.readLine()));
                System.out.println("Age: " + Integer.parseInt(file.readLine()));
                System.out.println();
            }
            file.close();
            showMenu();
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR : File not Found !!!");
        }
    }

    public void Delete() throws IOException {
        // Create a blank file
        PrintWriter pw = new PrintWriter(
                new BufferedWriter(new FileWriter("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt")));
        pw.close();
        System.out.println("\nAll Records cleared successfully !");
        for (int i = 0; i < 999999999; i++)
            ;
        // Wait for some time
        showMenu();
    }

    public void Search() throws IOException {
        try {
            // Open the file
            BufferedReader file = new BufferedReader(
                    new FileReader("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt"));
            String id;
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an ID of the student you want to search: ");
            String searchname = sc.next();
            // Read records from the file
            while ((id = file.readLine()) != null) {

                // String[] line = id.split(" ");
                // System.out.println(line[0]);
                if (searchname.equalsIgnoreCase(id)) {
                    System.out.println("Record found");
                    System.out.println("---------------------------------");
                    System.out.println("ID : " + id);
                    System.out.println("First Name: " + file.readLine());
                    System.out.println("Father's Name : " + file.readLine());
                    System.out.println("Surname : " + file.readLine());
                    System.out.println("Address: " + file.readLine());
                    System.out.println("Class: " + file.readLine());
                    System.out.println("Marks: " + Long.parseLong(file.readLine()));
                    System.out.println("Age: " + Integer.parseInt(file.readLine()));
                    System.out.println("");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Record not found");
            file.close();
            showMenu();
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR : File not Found !!!");
        }
    }

    public void deleteRecords() throws IOException {
        try {
            // Open the file
            BufferedReader file1 = new BufferedReader(
                    new FileReader("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("F:\\Student_Records1.txt", true)));
            String id;
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the ID of the student you want to delete: ");
            String searchname = sc.next();
            // Read records from the file
            while ((id = file1.readLine()) != null) {
                // String[] line = id.split(" ");
                // System.out.println(line[0]);
                if (!searchname.equalsIgnoreCase(id)) {
                    int counter = 0;
                    pw.println(id);
                    while (counter <= 6) {
                        id = file1.readLine();
                        pw.println(id);
                        counter++;
                    }
                    flag = 0;
                } else {
                    System.out.println("Record found");
                    int counter = 0;
                    while (counter <= 6) {
                        id = file1.readLine();
                        counter++;
                    }
                    flag = 1;
                }
            }
            file1.close();
            pw.close();

            File delName = new File("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt");
            File oldName = new File("F:\\Student_Records1.txt");
            File newName = new File("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt");
            if (delName.delete())
                System.out.println("deleted successfully");
            else
                System.out.println("Error");

            if (oldName.renameTo(newName))
                System.out.println("Renamed successfully");
            else
                System.out.println("Error");

            showMenu();
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR : File not Found !!!");
        }
    }

    public void updateRecords() throws IOException {
        try {
            // Open the file

            BufferedReader file1 = new BufferedReader(
                    new FileReader("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("F:\\Student_Records1.txt", true)));
            String id;
            int flag = 0;
            String fname, mname, lname, Class, address;
            int age;
            long marks;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the ID of the student you want to update: ");
            String searchname = sc.next();
            // Read records from the file
            while ((id = file1.readLine()) != null) {
                if (!searchname.equalsIgnoreCase(id)) {
                    int counter = 0;
                    pw.println(id);
                    while (counter <= 6) {
                        id = file1.readLine();
                        pw.println(id);
                        counter++;
                    }
                    flag = 0;
                } else {
                    System.out.println("Record found");
                    int counter = 0;
                    while (counter <= 6) {
                        id = file1.readLine();
                        counter++;
                    }
                    flag = 1;
                }
            }
            file1.close();
            pw.close();

            File delName1 = new File("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt");
            File oldName1 = new File("F:\\Student_Records1.txt");
            File newName1 = new File("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt");
            if (delName1.delete())
                System.out.println("Record deleted successfully");
            else
                System.out.println("Error11");

            if (oldName1.renameTo(newName1))
                System.out.println("Done");
            else
                System.out.println("Error12");

            // BufferedReader file2 = new BufferedReader(new
            // FileReader("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt"));
            PrintWriter pw1 = new PrintWriter(new BufferedWriter(
                    new FileWriter("G:\\OOPS College Assignment\\Assignment 8\\Student Record.txt", true)));

            System.out.print("\nEnter ID: ");
            id = br.readLine();

            System.out.print("\nEnter name: ");
            fname = br.readLine();

            System.out.print("Enter Middle Name: ");
            mname = br.readLine();

            System.out.print("Enter Surname: ");
            lname = br.readLine();

            System.out.print("Enter Address: ");
            address = br.readLine();

            System.out.print("Enter Class: ");
            Class = br.readLine();

            System.out.print("Enter Age: ");
            age = Integer.parseInt(br.readLine());

            System.out.print("Enter Marks: ");
            marks = Long.parseLong(br.readLine());
            // Print to File
            pw1.println(id);
            pw1.println(fname);
            pw1.println(mname);
            pw1.println(lname);
            pw1.println(address);
            pw1.println(Class);
            pw1.println(marks);
            pw1.println(age);
            System.out.println("\nRecord updated successfully");

            System.out.println();
            pw1.close();
            showMenu();

        } catch (FileNotFoundException e) {
            System.out.println("\nERROR : File not Found !!!");
        }
    }

    public void showMenu() throws IOException {
        System.out.print(
                "1 : Add Records\n2 : Display Records\n3 : Delete All Records\n4 : Search Record\n5 : Delete Specific Record\n6 : Update Record \n7 : Exit\n\nYour Choice : ");
        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                Create();
                break;
            case 2:
                Display();
                break;
            case 3:
                Delete();
                break;
            case 4:
                Search();
                break;
            case 5:
                deleteRecords();
                break;
            case 6:
                updateRecords();
                break;
            case 7:
                System.exit(1);
                break;
            default:
                System.out.println("\nInvalid Choice !");
                break;
        }
    }

    public static void main(String args[]) throws IOException {
        OOPS_8 ass = new OOPS_8();
        ass.showMenu();
    }
}
