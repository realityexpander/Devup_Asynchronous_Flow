import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        sendNumbers().collect {
            println("Received $it")
        }
    }
}

fun sendNumbers()
//        = flowOf("One", "Two", "Three")

//        = listOf(1, 2, 3).asFlow()

        = flow {
    for (i in 1..10)
        emit(i)
}