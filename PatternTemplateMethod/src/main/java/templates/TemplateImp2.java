package templates;

public class TemplateImp2 extends Template{
    @Override
    protected int param1() {
        return 8;
    }

    @Override
    protected double param2(int a, int b) {
        return a*Math.sin(b);
    }
}
