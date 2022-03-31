public class ValidateMaritalCode {
    private String _maritalCode;

    public ValidateMaritalCode(String maritalCode) {
        _maritalCode = maritalCode;
    }

    boolean Validate(){
        if(_maritalCode.startsWith("S") || _maritalCode.startsWith("s") || _maritalCode.startsWith("M") || _maritalCode.startsWith("m")){
            return true;
        }
        else return false;
    }
}
