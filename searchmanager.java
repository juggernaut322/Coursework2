import java.util.ArrayList;
import java.util.List;

public class SearchManager {
    public List<Note> searchNotes(SheetMusic sheetMusic, String query) {
        List<Note> result = new ArrayList<>();
        for (Staff staff : sheetMusic.getStaffs()) {
            for (Note note : staff.getNotes()) {
                if (note.getPitch().equalsIgnoreCase(query)) {
                    result.add(note);
                }
            }
        }
        return result;
    }

    public void replaceNotes(SheetMusic sheetMusic, String query, Note replacement) {
        for (Staff staff : sheetMusic.getStaffs()) {
            List<Note> notes = staff.getNotes();
            for (int i = 0; i < notes.size(); i++) {
                if (notes.get(i).getPitch().equalsIgnoreCase(query)) {
                    notes.set(i, replacement);
                }
            }
        }
    }
}
