package hr.ferit.dominikzivko.inspiringpeople.data

interface InspiringPersonDao {

    fun getPeople(): List<InspiringPerson>
    fun getPerson(id: Int): InspiringPerson?
    fun savePerson(person: InspiringPerson)
}