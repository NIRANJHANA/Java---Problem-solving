package Association.Unidirectional;

public class Main {
    public static void main(String[] args) { 
        LibraryCard lc1 = new LibraryCard(1001);
        Student s1 = new Student("Manju", lc1);
    
        s1.showLibraryCard();
    }
}
