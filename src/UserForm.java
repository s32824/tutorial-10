public record UserForm(String email, String password, int age) {
    public UserForm {
        if (email.isBlank() || password.isBlank()) {
            throw new IllegalArgumentException("Email and password cannot be blank");
        }
    }
}