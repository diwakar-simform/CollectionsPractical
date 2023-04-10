import java.util.Map;
import java.util.TreeMap;

class Employee{
    int id;
    String name;
    String designation;
    String techStack;

    Employee(int id, String name, String designation, String techStack){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.techStack = techStack;
    }
}
public class MyTreeMap {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1202345,"Diwakar","Trainee Engineers","JAVA");
        Employee emp2 = new Employee(1202346,"Hinal  ","Trainee Engineers","REACT");
        Employee emp3 = new Employee(1202347,"Shruti ","Trainee Engineers","PHP");
        Employee emp4 = new Employee(1202348,"Hardeek","Trainee Engineers","PYTHON");
        Employee emp5 = new Employee(1202349,"Nimit  ","Trainee Engineers","DEVOPS");

        TreeMap<Integer, Employee> EmpList = new TreeMap<>();
        EmpList.put(1,emp1);
        EmpList.put(2,emp2);
        EmpList.put(3,emp3);
        EmpList.put(4,emp4);
        EmpList.put(5,emp5);

        // iterating TreeMap through for each loop
        System.out.println("Employee Details are as follows:\n ");
        System.out.println("S.No.  \t ID \t  Name \t\tDesignation \t\tTechStack");
        for (Map.Entry<Integer, Employee> employee : EmpList.entrySet()){
            Employee emp = employee.getValue();
            System.out.println(" "+employee.getKey()+"\t   "+emp.id+"   "+emp.name+"   "+emp.designation+"     "+emp.techStack);
        }

    }
}
