import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // For integer inputs
        Scanner s1 = new Scanner(System.in); // For string inputs
        List<Employee> c = new ArrayList<Employee>();
        int choice = -1;
        do {
            try {
                System.out.println("Enter 1 to Insert data: ");
                System.out.println("Enter 2 to Display data ");
                System.out.println("Enter 3 to Search data ");
                System.out.println("Enter 4 to Delete data ");
                System.out.println("Enter 5 to Update data ");
                System.out.println("Enter 6 to View Salary ");
                System.out.println("Enter 7 to view Name ");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1: // Insert
                        System.out.println("Enter Employee ID: ");
                        int eid = sc.nextInt();
                        System.out.println("Enter Employee name: ");
                        String ename = s1.nextLine();
                        System.out.println("Enter Employee Salary: ");
                        int sal = sc.nextInt();
                        c.add(new Employee(eid, ename, sal));
                        break;

                    case 2: // Display
                        System.out.println("-------------------------");
                        for (Employee e : c) {
                            System.out.println(e);
                        }
                        System.out.println("-------------------------");
                        break;

                    case 3: // Search
                        boolean found = false;
                        System.out.print("Enter Employee ID to Search: ");
                        int empno = sc.nextInt();
                        System.out.println("-------------------------");
                        for (Employee e : c) {
                            if (e.getEmpid() == empno) {
                                System.out.println(e);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Record Not Found :( ");
                        }
                        System.out.println("-------------------------");
                        break;

                    case 4: // Delete
                        boolean deleted = false;
                        System.out.print("Enter Employee ID to Delete data: ");
                        int empIdToDelete = sc.nextInt();
                        System.out.println("-------------------------");
                        Iterator<Employee> i = c.iterator();
                        while (i.hasNext()) {
                            Employee e = i.next();
                            if (e.getEmpid() == empIdToDelete) {
                                i.remove();
                                deleted = true;
                                break;
                            }
                        }
                        if (!deleted) {
                            System.out.println("Record Not Found :( ");
                        } else {
                            System.out.println("Record is Deleted Successfully..!");
                        }
                        System.out.println("-------------------------");
                        break;

                    case 5: // Update
                        boolean updated = false;
                        System.out.print("Enter Employee ID to Update data: ");
                        int empIdToUpdate = sc.nextInt();
                        System.out.println("-------------------------");
                        ListIterator<Employee> li = c.listIterator();
                        while (li.hasNext()) {
                            Employee e = li.next();
                            if (e.getEmpid() == empIdToUpdate) {
                                System.out.println("Enter new name: ");
                                String newName = s1.nextLine();
                                System.out.println("Enter new Salary: ");
                                int newSalary = sc.nextInt();
                                li.set(new Employee(empIdToUpdate, newName, newSalary));
                                updated = true;
                                break;
                            }
                        }
                        if (!updated) {
                            System.out.println("Record Not Found :( ");
                        } else {
                            System.out.println("Record is Updated Successfully..!");
                        }
                        System.out.println("-------------------------");
                        break;

                    case 6: // View Salary
                        System.out.print("Enter EmpID to get salary: ");
                        int empIdToGetSalary = sc.nextInt();
                        System.out.println("-------------------------");
                        for (Employee e : c) {
                            if (e.getEmpid() == empIdToGetSalary) {
                                System.out.println("Salary: " + e.getSalary());
                                break;
                            }
                        }
                        System.out.println("-------------------------");
                        break;
                    case 7:
                        System.out.println("Enter EmpId to view their name ");
                        int empIdtoGetname = sc.nextInt();
                        System.out.println("-------------------------");
                        for(Employee e: c){
                            if(e.getEmpid()==empIdtoGetname){
                                System.out.println("Name: " + e.getEmpname());
                                break;
                            }
                        }
                        System.out.println("-------------------------");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input choice, enter a number listed.");
                sc.nextLine(); // Clear the invalid input
            }
        } while (choice != 0);

        sc.close(); // Close the Scanner
        s1.close(); // Close the second Scanner
    }
}
