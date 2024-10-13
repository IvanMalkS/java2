public class Name {
    final private String firstName;
    final private String lastName;
    final private String patronymic;

    public Name(String firstName, String lastName, String patronymic) {
        validateInput(firstName, "firstName");
        validateInput(lastName, "lastName");
        validateInput(patronymic, "patronymic");

        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    private void validateInput(String input, String fieldName) {
        if (input != null && !input.isEmpty()) {
            if (!Character.isUpperCase(input.charAt(0))) {
                throw new IllegalArgumentException("Invalid input for " + fieldName + ": " + input + " must start with an uppercase letter.");
            }
            if (!input.matches("[a-zA-Zа-яА-ЯёЁ ]*")) {
                throw new IllegalArgumentException("Invalid input for " + fieldName + ": " + input + " contains invalid characters.");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(firstName);
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(patronymic);
        }
        return sb.toString();
    }
}
