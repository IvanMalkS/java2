import java.util.ArrayList;

public class Department {
    final private String name;
    private Employee boss;
    private ArrayList<Employee> employees;

    public Department(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be null or empty");
        }
        this.name = name;
        this.boss = null;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        if (boss == null) {
            throw new IllegalArgumentException("Boss cannot be null");
        }
        this.boss = boss;
    }

    public void setEmployee(Employee mewEmployee) {
        if (mewEmployee == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }

        this.employees.add(mewEmployee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getEmployeesNames() {
        StringBuilder result = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null) {
                result.append(employee.getName() + "\n");
            }
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "Department name: " + name + "with boss: " + boss + ".";
    }
}

