package behavioral.controller.example

import behavioral.controller.example.mediators.NavigationBackMediator
import behavioral.controller.example.mediators.RetryActionMediator

fun main() {
    Dialog(RetryActionMediator()).draw()
    Dialog(NavigationBackMediator()).draw()
}