package templates;

public class TemplateImp1 extends Template {
    @Override
    protected int param1() {
        return 5;
    }

    @Override
    protected double param2(int a, int b) {
        return a+b*Math.cos(b);
    }
}
