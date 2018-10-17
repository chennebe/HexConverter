package chennebe;

public class Driver {

    public static void main(String[] args){
        HexConverter hc = new HexConverter();
        String input;
        input = "4846200048";
        System.out.println(hc.convert(input));
    }
}
