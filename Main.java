package com.surya;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        List<Employee> c = new ArrayList<Employee>();
        int choice=-1;
            do {
                    try {
                        System.out.println("Enter 1 to Insert data: ");
                        System.out.println("Enter 2 to Display data ");
                        System.out.println("Enter 3 to Search data ");
                        System.out.println("Enter 4 to Delete data ");
                        System.out.println("Enter 5 to Update data ");
                        System.out.print("Enter your choice: ");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1: //Insert
                                System.out.println("Enter Employee ID: ");
                                int eid = sc.nextInt();
                                System.out.println("Enter Employee name: ");
                                String ename = s1.nextLine();
                                System.out.println("Enter Employee Salary: ");
                                int sal = sc.nextInt();
                                c.add(new Employee(eid, ename, sal));
                                break;
                            case 2: //Display
                                System.out.println("-------------------------");
                                Iterator<Employee> i = c.iterator();
                                while (i.hasNext()) { // has next loop will execute
                                    Employee e = i.next();
                                    System.out.println(e);
                                }
                                System.out.println("-------------------------");
                                break;
                            case 3: //Search
                                boolean found = false;
                                System.out.print("Enter Employee ID to Search: ");
                                int empno = sc.nextInt();
                                System.out.println("-------------------------");
                                i = c.iterator();
                                while (i.hasNext()) { // has next Emp obj loop will execute
                                    Employee e = i.next();
                                    if (e.getEmpid() == empno) {
                                        System.out.println(e);
                                        found = true;
                                    }
                                    if (!found) {
                                        System.out.println("Record Not Found :( ");
                                    }
                                }
                                System.out.println("-------------------------");
                                break;
                            case 4:  //Delete
                                found = false;
                                System.out.print("Enter Employee ID to Delete data: ");
                                empno = sc.nextInt();
                                System.out.println("-------------------------");
                                i = c.iterator();
                                while (i.hasNext()) { // has next Emp obj loop will execute
                                    Employee e = i.next();
                                    if (e.getEmpid() == empno) {
                                        i.remove();
                                        found = true;
                                    }
                                    if (!found) {
                                        System.out.println("Record Not Found :( ");
                                    } else {
                                        System.out.println("Record is Deleted Successfully..!");
                                    }
                                }
                                System.out.println("-------------------------");
                                break;
                            case 5:  //Update
                                found = false;
                                System.out.print("Enter Employee ID to Update data: ");
                                empno = sc.nextInt();
                                System.out.println("-------------------------");
                                ListIterator<Employee> li = c.listIterator();
                                while (li.hasNext()) { // has next Emp obj loop will execute
                                    Employee e = li.next();
                                    if (e.getEmpid() == empno) {
                                        System.out.println("Enter new name: ");
                                        ename = s1.nextLine();
                                        System.out.println("Enter new Salary: ");
                                        sal = sc.nextInt();
                                        li.set(new Employee(empno, ename, sal));
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("Record Not Found :( ");
                                } else {
                                    System.out.println("Rcord is Updated Successfully..!");
                                }
                                System.out.println("-------------------------");
                                break;
                            default:
                                System.out.println("Ivalid choice");
                        }
                    }catch (InputMismatchException e){
                        System.out.println("Ivalid input choice,Enter any number that listed ");
                        sc.nextLine();
                    }

            } while (choice != 0);
    }
}
