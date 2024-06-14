package behavioral.strategy.example.validators

class PhoneValidator : TextValidator {
    override fun validate(text: String): Boolean {
        return text.length == 11
    }
}