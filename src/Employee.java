public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;

        department.addEmployee(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (this.department == department) return;
        if(this.department != null) this.department.removeEmployee(this);
        if (this.department != null && this.department.getBoss() == this) this.department.removeBoss(this);
        this.department = department;
        if(department != null) this.department.addEmployee(this);
    }

    @Override
    public String toString() {
        if (this == department.getBoss()) {
            return name + " начальник отдела " + department.getTitle();
        }
        return name + " работает в отделе " + department.getTitle() + ", начальник которого " + department.getBoss().name;
    }
}

