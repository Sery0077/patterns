package behavioral.controller.example.mediators

class RetryActionMediator : OkCancelDialogMediator {
    override fun okClicked() {
        println("Ok clicked, retry getting data...")
    }

    override fun cancelClicked() {
        println("Cancel clicked, dialog dismissed")
    }
}