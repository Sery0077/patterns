package behavioral.strategy.example

import behavioral.strategy.example.validators.PhoneValidator

fun main() {
    val editText = EditText()
    editText.setText("71111111111")
    editText.validateText(PhoneValidator()) // Text is valid: true
}