package cl.samuel.apuestas_barzarena.repository

import cl.samuel.apuestas_barzarena.model.Counter

class CounterRepository {
    private var counter = Counter()

    fun getCounter(): Counter = counter

    fun increment(): Counter {
        counter = counter.copy(value = counter.value + 1)
        return counter
    }

    fun decrement(): Counter {
        counter = counter.copy(value = counter.value - 1)
        return counter
    }
}