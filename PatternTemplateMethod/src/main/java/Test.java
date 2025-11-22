import templates.Template;
import templates.TemplateImp1;
import templates.TemplateImp2;

public class Test {
    public static void main(String[] args) {
        Template template = new TemplateImp1();
        System.out.println(template.perform(3,6));
        Template template2 = new TemplateImp2();
        System.out.println(template2.perform(3,6));
    }
}
