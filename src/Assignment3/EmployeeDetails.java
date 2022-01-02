package Assignment3;

import java.io.*;
import java.util.*;

public class EmployeeDetails {
    public static void main(String[] args) throws Exception {

        try {
            int num;
            Scanner sc = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);

            File file = new File("D:\\Files\\Employee.txt");
            ArrayList<Employee> arrayList = new ArrayList<Employee>();

            ObjectOutputStream objectOutputStream;
            ObjectInputStream objectInputStream;
            ListIterator li;

            if (file.isFile()) {
                objectInputStream = new ObjectInputStream(new FileInputStream(file));
                arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                objectInputStream.close();
            }
            do {
                System.out.println("1.Insert an Employee Details:");
                System.out.println("2.Display an Employee Details");
                System.out.println("3.Search an Employee Details:");
                System.out.println("4.Delete an Employee Details:");
                System.out.println("5.Update an Employee Details :");
                System.out.println("6.Exit");
                System.out.println("Enter Your choice A Number :-");
                num = sc.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("Enter How Many Employee you want to Add ");
                        int n = sc.nextInt();
                        for (int i = 0; i < n; i++) {

                            System.out.print("Enter your Employee ID : ");
                            int empID = sc.nextInt();
                            System.out.println();

                            System.out.print("Enter Your Employee Name :");
                            String empName = scanner.nextLine();
                            System.out.println();

                            System.out.print("Enter your Employee Age :");
                            int empAge = sc.nextInt();
                            System.out.println();

                            System.out.print("Enter your Employee Date-OF-Birth :");
                            int empDOB = sc.nextInt();
                            System.out.println();

                            System.out.print("Enter your Employee E-MAIL :");
                            String empEmail = scanner.nextLine();
                            arrayList.add(new Employee(empName, empEmail, empDOB, empID, empAge));
                        }
                        objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                        objectOutputStream.writeObject(arrayList);
                        objectOutputStream.close();

                        break;
                    case 2:
                        if (file.isFile()) {
                            objectInputStream = new ObjectInputStream(new FileInputStream(file));
                            arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                            objectInputStream.close();

                            System.out.println("....................................................");
                            System.out.println("Show On Employee Data");
                            li = arrayList.listIterator();
                            while (li.hasNext()) {
                                System.out.println(li.next());
                                System.out.println("................................................");
                            }
                        } else {
                            System.out.println("File Not Exists");
                        }
                        break;
                    case 3:
                        if (file.isFile()) {
                            objectInputStream = new ObjectInputStream(new FileInputStream(file));
                            arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                            objectInputStream.close();
                            boolean found = false;

                            System.out.print("Enter Employee ID Whose Details Are Required : ");
                            int empID = sc.nextInt();
                            System.out.println();
                            System.out.println(".............................................");
                            System.out.println("Employee Information");
                            li = arrayList.listIterator();
                            while (li.hasNext()) {
                                Employee emp = (Employee) li.next();
                                if (emp.empID == empID) {
                                    System.out.println(emp);
                                    found = true;
                                }
                                 if (found){
                                     System.out.println("Record found");
                                     System.exit(0);
                                 }
                            }
                            if (!found) {
                                System.out.println("Record NOT Found");
                            }
                            System.out.println(".........................................");
                        } else {
                            System.out.println("File not Exists!");
                        }
                        break;
                    case 4:
                        if (file.isFile()) {
                            objectInputStream = new ObjectInputStream(new FileInputStream(file));
                            arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                            objectInputStream.close();

                            boolean found = false;
                            System.out.print("Enter The ID Of The Employee Whose Data You Want to Delete Here :");
                            int empId = sc.nextInt();
                            System.out.println();
                            System.out.println("................................................................");
                            System.out.println("Employee Information");
                            li = arrayList.listIterator();
                            while ((li.hasNext())) {
                                Employee emp = (Employee) li.next();
                                if (emp.empID == empId) {
                                    li.remove();
                                    found = true;
                                }
                                if (found) {
                                    objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                                    objectOutputStream.writeObject(arrayList);
                                    objectOutputStream.close();
                                } else {
                                    System.out.println("Record not Found!");
                                }
                                System.out.println("...................................................");
                            }
                        } else {
                            System.out.println("File not Exists");
                        }
                        break;
                    case 5:
                        if (file.isFile()) {
                            objectInputStream = new ObjectInputStream(new FileInputStream(file));
                            arrayList = (ArrayList<Employee>) objectInputStream.readObject();
                            objectInputStream.close();

                            boolean found = false;
                            System.out.print("Enter The ID Of The Employee Whose Data You Want to Update");
                            int empID = sc.nextInt();
                            System.out.println();
                            System.out.println("...........................................");
                            System.out.println("Employee Information");
                            li = arrayList.listIterator();
                            while (li.hasNext()) {
                                Employee emp = (Employee) li.next();
                                if (emp.empID == empID) {

                                    System.out.print("Enter Employee Date-OF-Birth To Add :");
                                    int empDOB = sc.nextInt();
                                    System.out.println();

                                    System.out.print("Enter Employee Name To Add :");
                                    String empName = sc.nextLine();
                                    System.out.println();

                                    System.out.print("Enter Employee Age To Add : ");
                                    int empAge = sc.nextInt();
                                    System.out.println();

                                    System.out.print("Enter Employee Email To Add :");
                                    String empEmail = sc.nextLine();
                                    System.out.println();
                                    li.set(new Employee(empName, empEmail, empID, empDOB, empAge));
                                    found = true;
                                }
                                if (found) {
                                    objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                                    objectOutputStream.writeObject(arrayList);
                                    objectOutputStream.close();
                                    System.out.println("Record Update Successfully!");
                                } else {
                                    System.out.println("Record not Found!");
                                }
                                System.out.println("......................................");
                            }

                        } else {
                            System.out.println("File not Exists!");
                        }
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + num);
                }

            } while (true);

        } catch (InputMismatchException | FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Please Enter A Valid Input");
        }
    }
}


class Employee implements Serializable {
    public String empName;
    public String empEmail;
    int empAge;
    int empDOB;
    int empID;

    Employee(String empName, String empEmail, int empDOB, int empID, int empAge) {
        this.empName = empName;
        this.empEmail = empEmail;
        this.empDOB = empDOB;
        this.empID = empID;
        this.empAge = empAge;
    }
    public String toString() {
        return " | EMP-ID :- " + empID + " | EMP-Name :- " + empName + " | EMP-Age :- " + empAge + " | EMP-Date -OF-Birth :- " + empDOB + " | EMP-Email :- " + empEmail + "|";
    }
}