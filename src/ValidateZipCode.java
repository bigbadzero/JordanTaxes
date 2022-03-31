import java.util.regex.*;

public class ValidateZipCode {
    private String _zipCode;
    private String zipRegex = "\\d{5}";

    public ValidateZipCode(String zipCode) {
        _zipCode = zipCode;
    }

    boolean Validate(){
        Pattern p = Pattern.compile(zipRegex);
        Matcher m = p.matcher(_zipCode);
        return m.matches();
    }
}


