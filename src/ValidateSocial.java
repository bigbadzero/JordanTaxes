import java.util.regex.*;

public class ValidateSocial {
    private String socialRegex = "^(?!666|000|9\\d{2})\\d{3}"
            + "-(?!00)\\d{2}-"
            + "(?!0{4})\\d{4}$";
    private String _social;

    public ValidateSocial(String social) {
        _social = social;
    }

    boolean Validate(){
        Pattern p = Pattern.compile(socialRegex);
        Matcher m = p.matcher(_social);
        return m.matches();
    }
}
