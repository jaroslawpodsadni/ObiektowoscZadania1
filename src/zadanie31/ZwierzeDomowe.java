package zadanie31;

public abstract class ZwierzeDomowe extends Zwierze{
    final protected String nazwa;

    public ZwierzeDomowe(double masa, String nazwa) {
        super(masa);
        this.nazwa = nazwa;
    }

}
