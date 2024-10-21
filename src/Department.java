import java.util.ArrayList;
import java.util.List;

public class Department {
    private String title;
    private Employee boss;

    List<Employee> employees = new ArrayList<>();

    public Employee getBoss() {
        return boss; // сделать недоступным для изменений по ссылке
    }

    public String getTitle() {
        return title;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void addEmployee(Employee employee) {
        if (employee == null) return;
        if (employee.getDepartment() == this && employees.contains(employee)) return;
        if (employee.getDepartment() != this) employee.setDepartment(this);
        if (!employees.contains(employee)) employees.add(employee);
    }

    public void addBoss(Employee boss) {
        if (this.boss == boss) return;
        if (boss != null && boss.getDepartment() != this) addEmployee(boss);
        this.boss = boss;

    }

    public void removeEmployee(Employee employee){
        if(employee == null) return;
        if (employees.contains(employee)) employees.remove(employee);
    }
    public  void removeBoss(Employee boss){
        if( this.boss == boss) this.boss = null;
    }
}
