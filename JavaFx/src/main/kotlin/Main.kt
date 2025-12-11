import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.canvas.Canvas
import javafx.scene.canvas.GraphicsContext
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.text.Text
import javafx.stage.Stage

class HelloWorld : Application() {
    override fun start(stage: Stage) {
        val canvas = Canvas(400.0, 200.0)
        val gc = canvas.graphicsContext2D

        drawRectangle(gc)
        val root = Pane(canvas)
        stage.scene = Scene(root)
        stage.show()

    }
    private fun drawRectangle(gc: GraphicsContext) {
        with(gc) {
            stroke = Color.RED
            strokeRect(100.0, 50.0, 200.0, 100.0)
        }
    }
}
fun main() {
    Application.launch(HelloWorld::class.java)
}

