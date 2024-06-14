package behavioral.controller.example.button

import behavioral.controller.example.mediators.OkCancelDialogMediator

class OkButton(private val mediator: OkCancelDialogMediator) : Button {
    override val text: String
        get() = "Ok"

    override fun performClick() {
        mediator.okClicked()
    }
}