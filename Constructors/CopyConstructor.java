package Constructors;

public class CopyConstructor {
    int x;

    CopyConstructor(int x) {
        this.x = x;
    }

    // copy constructor
    CopyConstructor(CopyConstructor obj) {
        // this.x = obj.x;
        this(obj.x);
    }
}
