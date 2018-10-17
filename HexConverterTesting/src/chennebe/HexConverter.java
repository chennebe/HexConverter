package chennebe;

public class HexConverter {

    public HexConverter(){

    }

    public String convert(String input){
        String ret = "";
        for (int i = 0; i < input.length(); i += 2){
            int hex = Integer.parseInt(input.substring(i, i+2), 16);
            ret += (char) hex;
        }
        return ret;
    }
}
