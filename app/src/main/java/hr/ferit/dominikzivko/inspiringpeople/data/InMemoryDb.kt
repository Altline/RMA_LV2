package hr.ferit.dominikzivko.inspiringpeople.data

class InMemoryDb : InspiringPersonDao {
    private val people = mutableListOf<InspiringPerson>()

    init {
        repeat(10) { i ->
            val n = i + 1
            val quotes = List(5) { j -> "Famous quote ${j + 1}"}
            val person = InspiringPerson(i, "Person $n", "$n.12.1975.", quotes)
            savePerson(person)
        }
    }

    override fun getPeople(): List<InspiringPerson> {
        return people
    }

    override fun getPerson(id: Int): InspiringPerson? {
        return people.find { it.id == id }
    }

    override fun savePerson(person: InspiringPerson) {
        people += person
    }
}