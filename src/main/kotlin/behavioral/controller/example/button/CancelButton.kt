package behavioral.controller.example.button

import behavioral.controller.example.mediators.OkCancelDialogMediator

class CancelButton(private val mediator: OkCancelDialogMediator) : Button {
    override val text: String
        get() = "Cancel"

    override fun performClick() {
        mediator.cancelClicked()
    }
}