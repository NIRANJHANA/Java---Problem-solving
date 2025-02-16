package Association.Unidirectional;

public class Student {
    private String name;
    private LibraryCard card;

    public Student(String name, LibraryCard card) {
        this.name = name;
        this.card = card;
    }

    public void showLibraryCard() {
        System.out.println(name + " has library card number " + card.getCardNumber());
    }
}
