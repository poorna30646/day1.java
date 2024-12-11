import java.io.PrintWriter;
public class Printwriter
{
    public static void main(String args[])
    {
        Printwriter pw = new PrintWriter(System.out);
        pw.println("Hello world!");
        pw.print("This is a");
        pw.print("print statement");
        pw.close();
    }
}
