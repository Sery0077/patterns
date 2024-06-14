package behavioral.snapshot.example

import java.io.Serializable

class EditText {
    private var text: String = ""
    private var cursorPosition: Int = 0
    private var selectionStart: Int? = null
    private var selectionEnd: Int? = null
    private var mask: String? = null

    fun getText() = text

    fun clearSelection() {
        selectionStart = null
        selectionEnd = null
    }

    fun setMask(mask: String) {
        this.mask = mask
    }

    fun removeMask() {
        mask = null
    }

    fun createSnapshot(): State {
        return State(
            text = text,
            cursorPosition = cursorPosition,
            selectionStart = selectionStart,
            selectionEnd = selectionEnd,
            mask = mask
        )
    }

    fun restoreState(state: State) {
        text = state.text
        cursorPosition = state.cursorPosition
        selectionStart = state.selectionStart
        selectionEnd = state.selectionEnd
        mask = state.mask
    }

    class State(
        val text: String = "",
        val cursorPosition: Int = 0,
        val selectionStart: Int? = null,
        val selectionEnd: Int? = null,
        val mask: String? = null,
    ) : Serializable
}

