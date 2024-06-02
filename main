public class Main {
    public static void main(String[] args) {
        UIController controller = new UIController();

        // Create a new sheet music project
        controller.createNewSheetMusic();

        // Add notes to a staff
        Note note1 = new Note("C4", 4, "mf", "staccato");
        Note note2 = new Note("D4", 2, "p", "legato");
        Staff staff = new Staff();
        controller.addNoteToStaff(note1, staff);
        controller.addNoteToStaff(note2, staff);

        // Add the staff to the sheet music
        controller.sheetMusic.addStaff(staff);

        // Export the sheet music to a file
        controller.exportSheetMusic("sheet_music.txt");

        // Search for a note
        controller.searchNotes("C4");

        // Replace a note
        Note replacementNote = new Note("E4", 4, "f", "marcato");
        controller.replaceNotes("C4", replacementNote);

        // Display the updated sheet music
        System.out.println(controller.sheetMusic);
    }
}
