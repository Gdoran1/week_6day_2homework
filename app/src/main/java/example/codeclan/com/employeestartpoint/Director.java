package example.codeclan.com.employeestartpoint;

/**
 * Created by graemedoran on 31/10/2017.
 */

public class Director extends Manager {
    private String budget;

    public Director(int id, String name, String socialSecurityNumber, double salary, String deptName) {
        super(id, name, socialSecurityNumber, salary, deptName);

        this.budget = budget;
    }
}
