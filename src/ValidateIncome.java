public class ValidateIncome {
    private double _income;
    public boolean _validIncome;

    public ValidateIncome(double income) {
        _income = income;
    }

    boolean Validate(){
        if(_income > 0){
            _validIncome = true;
            return _validIncome;
        }
        else{
            _validIncome = false;
            return _validIncome;
        }
    }
}
