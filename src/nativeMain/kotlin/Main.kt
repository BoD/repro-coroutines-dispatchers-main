import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
    runBlocking {
        withContext(Dispatchers.Main) {
            println("Hello, World!")
        }
    }
}
