package behavioral.strategy.example

import behavioral.strategy.example.validators.TextValidator

class EditText {
    private var text: String = ""

    fun setText(text: String) {
        this.text = text
    }

    fun validateText(validator: TextValidator) {
        println("Text is valid: ${validator.validate(text)}")
    }
}