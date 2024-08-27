package P2;

public class Serial extends  Media{
    int kolS;
    double ocenkaS;

    public Serial(String name, int prod, int kolS, double ocenkaS) {
        super(name, prod);
        this.kolS = kolS;
        this.ocenkaS = ocenkaS;
    }
}
