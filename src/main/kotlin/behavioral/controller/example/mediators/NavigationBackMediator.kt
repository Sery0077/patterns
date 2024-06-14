package behavioral.controller.example.mediators

class NavigationBackMediator : OkCancelDialogMediator {
    override fun okClicked() {
        println("Ok clicked, navigation back...")
    }

    override fun cancelClicked() {
        println("Cancel clicked, dialog dismissed")
    }
}