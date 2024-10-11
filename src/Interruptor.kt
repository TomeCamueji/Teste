fun main() {
    val lamps = mutableListOf<Lamp>(
        Lamp("Lâmpada 1"),
        Lamp("Lâmpada 2"),
        Lamp("Lâmpada 3")
    )

    val switches = mutableListOf<Switch>(
        Switch("Interruptor 1"),
        Switch("Interruptor 2"),
        Switch("Interruptor 3")
    )

    // Liga o primeiro interruptor
    switches[0].turnOn()
    println("${switches[0].name} está ligado.")

    // Aguarda 5-10 minutos (simulado com Thread.sleep)
    Thread.sleep(1000) // 1 segundo para simulação (pode ser ajustado)

    // Desliga o primeiro interruptor e liga o segundo
    switches[0].turnOff()
    println("${switches[0].name} está desligado.")
    switches[1].turnOn()
    println("${switches[1].name} está ligado.")

    // Verifica o estado das lâmpadas
    checkLampsState(lamps, switches)
}

fun checkLampsState(lamps: List<Lamp>, switches: List<Switch>) {
    for (lamp in lamps) {
        println("${lamp.name} está ${lamp.state}.")
    }

    // Identifica qual interruptor controla qual lâmpada
    for (lamp in lamps) {
        when {
            lamp.isOn -> println("${switches[1].name} controla ${lamp.name}.")
            lamp.isOff && lamp.isWarm -> println("${switches[0].name} controla ${lamp.name}.")
            lamp.isOff && lamp.isCold -> println("${switches[2].name} controla ${lamp.name}.")
        }
    }
}

class Switch(val name: String) {
    var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }
}

class Lamp(val name: String) {
    var isOn: Boolean = false
    var wasPreviouslyOn: Boolean = false // Para simular se estava ligado antes

    init {
        // Randomizando o estado da lâmpada para a simulação
        if ((0..1).random() == 1) {
            isOn = true
        } else {
            wasPreviouslyOn = true
        }
    }

    val state: String
        get() = when {
            isOn -> "ligada"
            wasPreviouslyOn -> "desligada e quente"
            else -> "desligada e fria"
        }

    // Propriedades auxiliares
    val isOff: Boolean
        get() = !isOn
    val isWarm: Boolean
        get() = wasPreviouslyOn
    val isCold: Boolean
        get() = !wasPreviouslyOn
}