public class Main
{
    public static void main(String[]arg)
    {
        System.out.println("Reverse Order:");
       personcolor color2 = new personcolor(new person("person one"));

        color2.insert(new person("person Two"), 0);

        color2.insert(new person("person Three"), 0);


        color2.print();
    }
}
