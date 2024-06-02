import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SheetMusicTest {

    @Test
    public void testAddNote() {
        SheetMusic sheetMusic = new SheetMusic();
        Note note = new Note("C4", 4, "mf", "staccato");
        Staff staff = new Staff();
        staff.addNote(note);
        sheetMusic.addStaff(staff);

        assertEquals(1, sheetMusic.getStaffs().get(0).getNotes().size());
    }

    @Test
    public void testRemoveNote() {
        SheetMusic sheetMusic = new SheetMusic();
        Note note = new Note("C4", 4, "mf", "staccato");
        Staff staff = new Staff();
        staff.addNote(note);
        sheetMusic.addStaff(staff);
        staff.removeNote(note);

        assertEquals(0, sheetMusic.getStaffs().get(0).getNotes().size());
    }
}
