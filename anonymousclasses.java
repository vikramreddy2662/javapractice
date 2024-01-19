package lambdaexpressions;
interface  Employ{
    public void add(int a, int b);
}
public class anonymousclasses {
    public static void main(String[] args) {
        Employ e = new Employ() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            }
        };
        e.add(21,34);

    }}
