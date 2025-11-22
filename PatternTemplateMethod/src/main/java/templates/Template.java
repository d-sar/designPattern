package templates;

public abstract class Template {
    public double perform(int a, int b){
        int n = param1();
       double sum = 0;
       for(int i=0; i<n; i++){
           double stap1 = param2(a,b);
           sum += stap1;
       }
       return sum;
    }
    protected abstract int param1();
    protected abstract double param2(int a, int b);
}
