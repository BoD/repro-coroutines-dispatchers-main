import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
    println(0)
    runBlocking {
        withContext(Dispatchers.Main) {
            println(1)
        }
    }
}
