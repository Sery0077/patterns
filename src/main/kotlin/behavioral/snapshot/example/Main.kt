package behavioral.snapshot.example

fun main() {
    val editText = EditText()
    val snapshot = editText.createSnapshot()
    editText.restoreState(snapshot)
}