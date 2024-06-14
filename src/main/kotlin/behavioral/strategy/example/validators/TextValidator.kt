package behavioral.strategy.example.validators

// Общий интерфейс стратегий валидации текста
interface TextValidator {
    fun validate(text: String): Boolean
}