package behavioral.controller.example

import behavioral.controller.example.button.CancelButton
import behavioral.controller.example.button.OkButton
import behavioral.controller.example.mediators.OkCancelDialogMediator

class Dialog(private val mediator: OkCancelDialogMediator) {

    fun draw() {
        OkButton(mediator)
        CancelButton(mediator)
    }
}