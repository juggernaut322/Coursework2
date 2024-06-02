import java.util.ArrayList;
import java.util.List;

public class Staff {
    private List<Note> notes;

    public Staff() {
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void removeNote(Note note) {
        notes.remove(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Note note : notes) {
            sb.append(note.toString()).append("\n");
        }
        return sb.toString();
    }
}
