fun main() {
    // a) Sequência: 1, 3, 5, 7, ____
    val nextA = 9 // Próximo número ímpar
    println("a) Próximo elemento: $nextA") // 9

    // b) Sequência: 2, 4, 8, 16, 32, 64, ____
    val nextB = 128 // Próximo número na sequência das potências de 2
    println("b) Próximo elemento: $nextB") // 128

    // c) Sequência: 0, 1, 4, 9, 16, 25, 36, ____
    val nextC = 49 // Próximo quadrado perfeito (7 * 7)
    println("c) Próximo elemento: $nextC") // 49

    // d) Sequência: 4, 16, 36, 64, ____
    val nextD = 100 // Próximo quadrado perfeito (10 * 10)
    println("d) Próximo elemento: $nextD") // 100

    // e) Sequência: 1, 1, 2, 3, 5, 8, ____
    val sequenceE = mutableListOf(1, 1)
    for (i in 2 until 7) {
        sequenceE.add(sequenceE[i - 1] + sequenceE[i - 2])
    }
    val nextE = sequenceE.last() // O último elemento da sequência de Fibonacci
    println("e) Próximo elemento: $nextE") // 13

    // f) Sequência: 2, 10, 12, 16, 17, 18, 19, ____
    val nextF = 20 // Próximo número natural sequencial
    println("f) Próximo elemento: $nextF") // 20
}