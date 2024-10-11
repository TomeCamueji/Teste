fun main() {
    // Definir o número que queremos verificar e gerar a sequência até ele
    val numberToCheck = 21

    // Gerar a sequência de Fibonacci e verificar se o número pertence à sequência
    val fibonacciSequence = generateFibonacci(numberToCheck)

    // Exibir a sequência gerada
    println("Sequência de Fibonacci até $numberToCheck: $fibonacciSequence")

    // Verificar se o número faz parte da sequência
    if (fibonacciSequence.contains(numberToCheck)) {
        println("$numberToCheck pertence à sequência de Fibonacci.")
    } else {
        println("$numberToCheck não pertence à sequência de Fibonacci.")
    }
}

// Função que gera a sequência de Fibonacci até o número fornecido
fun generateFibonacci(limit: Int): List<Int> {
    val sequence = mutableListOf(0, 1)  // Inicia com 0 e 1, os dois primeiros números da sequência

    var a = 0
    var b = 1

    // Gerar a sequência até que o próximo número ultrapasse o valor limite
    while (b <= limit) {
        val next = a + b
        sequence.add(next)
        a = b
        b = next
    }

    return sequence
}