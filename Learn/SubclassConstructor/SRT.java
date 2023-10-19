package Learn.SubclassConstructor;

public class SRT extends Student {
    String name;
    double atk;

    SRT(String name, double atk){
        super(name, atk);
    }

    // constructor biasa(gk error krn ada constructor kosong di superclass)
    SRT(String name){
        this.name = name;
    }
}
