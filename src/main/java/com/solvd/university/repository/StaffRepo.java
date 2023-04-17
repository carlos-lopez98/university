package main.java.com.solvd.university.repository;

import main.java.com.solvd.university.models.Staff;
import java.util.List;

public class StaffRepo {

    private List<Staff> staffList;

    public StaffRepo(List<Staff> staff){
        this.staffList = staff;
    }
    public List<Staff> getStaffList() {
        return staffList;
    }
    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
