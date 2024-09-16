//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Olá\te\tbem vindo(a)!\n");
        int i = 1, j = 5;
        for (; i <= 5; i++, j--)
        {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
        System.out.println(i+" "+j);
    }
}