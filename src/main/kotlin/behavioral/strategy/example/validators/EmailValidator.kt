package behavioral.strategy.example.validators

class EmailValidator : TextValidator {
    override fun validate(text: String): Boolean {
        return text.contains("@")
    }
}