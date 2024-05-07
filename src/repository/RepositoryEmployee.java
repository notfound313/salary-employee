package repository;

import java.util.ArrayList;
import java.util.List;

import model.child.job.Analyst;
import model.child.job.Programmer;
import model.child.job.ProjectLeader;
import model.parent.EmployeeUmum;
import model.parent.Placement;

public class RepositoryEmployee {

    public List<EmployeeUmum> getAllEmployee(){

        List<EmployeeUmum> listEmployee = new ArrayList<>();


        /*
         * Placement
         */
        Placement garut = new Placement("Garut",1961085 );
        Placement bandung = new Placement("Bandung",3742276 );
        Placement jakarta = new Placement("Jakarta",4453935 );
        Placement bekasi = new Placement("Bekasi",4782935 );
        Placement bogor = new Placement("Bogor",4330249 );
        

        /*
         * employee umum
         */
        EmployeeUmum emp1 = new EmployeeUmum("Emp-001","Susi" , "Bandung", 27, "Admin", jakarta);
        EmployeeUmum emp2 = new EmployeeUmum("Emp-002","Anto" , "Bandung", 35, "Office Boy", bandung);
        EmployeeUmum emp3 = new EmployeeUmum("Emp-003","Riman" , "Jakarta", 28, "Human Resource Dev", bandung);

        /*
         * Employee tech
         */
        EmployeeUmum programmer1 = new Programmer("Prog-001","Budi","Bandung",  25, "Back End Dev" , jakarta, "Java", 2);
        EmployeeUmum programmer2 = new Programmer("Prog-002","Ani","Bandung",  30, "Front End Dev", bandung, "React Js", 6);
        EmployeeUmum programmer3 = new Programmer("Prog-003","UJang","Jakarta",  28, "Full Stack Dev", bandung, "Kotlin", 4);

        EmployeeUmum lead1 = new ProjectLeader("PL-001", "Ahmad", "Bandung", 25, "Project Leader", garut, 2 );
        EmployeeUmum lead2 = new ProjectLeader("PL-002", "Dani", "Bandung", 30, "Scrum Master", bekasi, 1 );
        EmployeeUmum lead3 = new ProjectLeader("PL-003", "Cecep", "Jakarta", 28, "Project Owner", bogor, 4 );

        EmployeeUmum  anlyst1 = new Analyst("AL-001", "Indah", "Garut", 25, "Analyst", jakarta);
        EmployeeUmum  anlyst2 = new Analyst("AL-002", "Indah", "Garut", 30, "Analyst", bekasi);
        EmployeeUmum  anlyst3 = new Analyst("AL-003", "Indah", "Garut", 28, "Analyst", bogor);

        listEmployee.add(emp1);
        listEmployee.add(emp2);
        listEmployee.add(emp3);

        listEmployee.add(programmer1);
        listEmployee.add(programmer2);
        listEmployee.add(programmer3);

        listEmployee.add(lead1);
        listEmployee.add(lead2);
        listEmployee.add(lead3);

        listEmployee.add(anlyst1);
        listEmployee.add(anlyst2);
        listEmployee.add(anlyst3);




        return listEmployee;
    }
}
