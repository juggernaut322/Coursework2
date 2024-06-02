public class UIController {
    private SheetMusic sheetMusic;
    private FileManager fileManager;
    private SearchManager searchManager;

    public UIController() {
        this.sheetMusic = new SheetMusic();
        this.fileManager = new FileManager();
        this.searchManager = new SearchManager();
    }

    public void createNewSheetMusic() {
        this.sheetMusic = new SheetMusic();
    }

    public void addNoteToStaff(Note note, Staff staff) {
        staff.addNote(note);
    }

    public void removeNoteFromStaff(Note note, Staff staff) {
        staff.removeNote(note);
    }

    public void importSheetMusic(String filePath) {
        fileManager.importFile(filePath);
    }

    public void exportSheetMusic(String filePath) {
        fileManager.exportFile(filePath, sheetMusic);
    }

    public void searchNotes(String query) {
        List<Note> notes = searchManager.searchNotes(sheetMusic, query);
        for (Note note : notes) {
            System.out.println(note);
        }
    }

    public void replaceNotes(String query, Note replacement) {
        searchManager.replaceNotes(sheetMusic, query, replacement);
    }
}
