import java.math.RoundingMode;
import java.text.DecimalFormat;
public class TaxReturn {
    private double _income;
    private String _social;
    private String _zipcode;
    private String _maritalCode;
    private String _lastName;
    private String _firstName;
    private String _streetAddress;
    private String _city;
    private String _state;
    private double _taxLiability;
    private double _taxLiabilityPercentage;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    

    public TaxReturn(double income, String social, String zipcode, String maritalCode, String lastName,
            String firstName, String streetAddress, String city, String state) throws Exception {
        this._income = income;
        this._social = social;
        this. _zipcode = zipcode;
        this._maritalCode = maritalCode;
        this._lastName = lastName;
        this._firstName = firstName;
        this._streetAddress = streetAddress;
        this._city = city;
        this. _state = state;
        this._taxLiabilityPercentage = CalculateTaxLiabilityPercentage(income, maritalCode);
        this._taxLiability = CalculateTaxLiability(income, this._taxLiabilityPercentage);
    }

    double CalculateTaxLiabilityPercentage(double income, String maritalCode) {
        if (income < 20000) {
            if (maritalCode.startsWith("s") || maritalCode.startsWith("S")) {
                _taxLiabilityPercentage = 15;
            } else {
                _taxLiabilityPercentage = 14;
            }
        }
        if (income > 20000 && income <= 50000) {
            if (maritalCode.startsWith("s") || maritalCode.startsWith("S")) {
                _taxLiabilityPercentage = 22;
            } else {
                _taxLiabilityPercentage = 20;
            }

        } else {
            if (maritalCode.startsWith("s") || maritalCode.startsWith("S")) {
                _taxLiabilityPercentage = 30;
            } else {
                _taxLiabilityPercentage = 28;
            }

        }
        return _taxLiabilityPercentage;
    }

    double CalculateTaxLiability(double income, double taxLiabilityPercentage){
        double taxLiability = income * (taxLiabilityPercentage * .01);
        return taxLiability;
    }

    void printTaxReturn(){
        System.out.println("\n");
        System.out.println("First Name: " + _firstName);
        System.out.println("Last Name: " + _lastName);
        System.out.println("Street Address: " + _streetAddress);
        System.out.println("Marital Status: " + _maritalCode);
        System.out.println("City: " + _city);
        System.out.println("State: " + _state);
        System.out.println("ZipCode: " +  _zipcode);
        System.out.println("Social: " + _social);
        System.out.println("Income: " + df.format(_income));
        System.out.println("TaxLiability: " + df.format(_taxLiability));

    }
}