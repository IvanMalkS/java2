public class Employee {
    final private String name;
    final private Department department;

    public Employee(String name, Department department) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (department == null) {
            throw new IllegalArgumentException("Department cannot be null");
        }

        this.name = name;
        this.department = department;
        this.department.setEmployee(this);
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        if (department != null) {
            if (department.getBoss() == this) {
                return name + " начальник отдела " + department.getName();
            } else {
                return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getBoss().getName();
            }

        } else {
            throw new IllegalArgumentException("Department is null");
        }
    }
}
