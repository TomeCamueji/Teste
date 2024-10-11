fun main() {
    // Definindo a string de exemplo (pode ser substituída por uma entrada de usuário)
    val inputString = "Esta é uma string de exemplo para contar a letra A ou a"

    // Convertendo a string para minúsculas para facilitar a contagem
    val lowerCaseString = inputString.toLowerCase()

    // Contando o número de ocorrências da letra 'a'
    val count = lowerCaseString.count { it == 'a' }

    // Verificando se a letra 'a' existe e imprimindo o resultado
    if (count > 0) {
        println("A letra 'a' aparece $count vezes na string.")
    } else {
        println("A letra 'a' não foi encontrada na string.")
    }
}