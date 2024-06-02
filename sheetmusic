import java.util.ArrayList;
import java.util.List;

public class SheetMusic {
    private List<Staff> staffs;

    public SheetMusic() {
        this.staffs = new ArrayList<>();
    }

    public void addStaff(Staff staff) {
        staffs.add(staff);
    }

    public void removeStaff(Staff staff) {
        staffs.remove(staff);
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Staff staff : staffs) {
            sb.append(staff.toString()).append("\n");
        }
        return sb.toString();
    }
}
