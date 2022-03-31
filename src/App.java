
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // validation bools
        boolean validIncome = false;
        boolean validSocial = false;
        boolean validZipcode = false;
        boolean validMaritalCode = false;

        // taxReturn variables needed
        double _income = 0;
        String _social = "";
        String _zipcode = "";
        String _maritalCode = "";
        String _lastName = "";
        String _firstName = "";
        String _streetAddress = "";
        String _city = "";
        String _state = "";

        Scanner scanner = new Scanner(System.in);
        while (_firstName.isEmpty()) {
            System.out.println("Enter First Name: ");
            _firstName = scanner.next();
        }

        while (_lastName.isEmpty()) {
            System.out.println("Enter Last Name: ");
            _lastName = scanner.next();
        }

        while (_streetAddress.isEmpty()) {
            System.out.println("Enter Street Address: ");
            scanner.nextLine();
            _streetAddress = scanner.nextLine();
        }

        while (_city.isEmpty()) {
            System.out.println("Enter City: ");
            _city = scanner.next();
        }

        while (_state.isEmpty()) {
            System.out.println("Enter State: ");
            _state = scanner.next();
        }

        while (!validIncome) {
            System.out.println("Enter Income: ");
            _income = scanner.nextDouble();
            ValidateIncome incomeValidation = new ValidateIncome(_income);
            validIncome = incomeValidation.Validate();
        }

        while (!validSocial) {
            System.out.println("Enter Social: ");
            _social = scanner.next();
            ValidateSocial socialValidation = new ValidateSocial(_social);
            validSocial = socialValidation.Validate();
        }

        while (!validZipcode) {
            System.out.println("Enter ZipCode: ");
            _zipcode = scanner.next();
            ValidateZipCode zipCodeValidation = new ValidateZipCode(_zipcode);
            validZipcode = zipCodeValidation.Validate();
        }

        while (!validMaritalCode) {
            System.out.println("Enter Marital Code. M = married S - Single: ");
            _maritalCode = scanner.next();
            ValidateMaritalCode maritalCodeValidation = new ValidateMaritalCode(_maritalCode);
            validMaritalCode = maritalCodeValidation.Validate();
        }
        TaxReturn taxReturn = new TaxReturn(_income, _social, _zipcode, _maritalCode, _lastName, _firstName,
                _streetAddress, _city, _state);
        taxReturn.printTaxReturn();
    }
}
