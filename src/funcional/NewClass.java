
package funcional;

public class NewClass {
    
    private sub subHelper;
    private soma somaHelper;
    
    public NewClass() {
        subHelper = new sub();
        somaHelper = new soma();
    }
    
    public int sub(int a, int b) {
        return subHelper.execute(a,b);
    }
    
    public int soma(int a, int b) {
        return somaHelper.execute(a,b);
    }
}
