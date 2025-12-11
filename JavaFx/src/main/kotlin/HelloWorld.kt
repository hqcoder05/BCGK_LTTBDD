package org.example

import javafx.application.Application
import javafx.geometry.Pos  //required to create and
import javafx.stage.Stage //manage the graphical elements for
import javafx.scene.Scene
import javafx.scene.layout.VBox
import javafx.scene.text.Font //the “Hello, world!” application.
import javafx.scene.text.Text
class HelloWorld : Application() { //Ke thua tu Application
    override fun start(primaryStage: Stage) {
        primaryStage.title = "Application Hello World" //.title de set cho application
        val text = Text("Hello, world!")
        text.font = Font.font("Roboto", 20.0)
        val vbx = VBox(text)
        vbx.alignment = Pos.CENTER
        val scene = Scene(vbx, 300.0, 300.0)
        primaryStage.scene = scene
        primaryStage.show()
    }
}
fun main() {
    Application.launch(HelloWorld::class.java)
}