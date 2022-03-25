package hr.ferit.dominikzivko.inspiringpeople.data

interface PeopleRepository {

    fun getInspiringPeople(): List<InspiringPerson>
    fun getInspiringPerson(id: Int): InspiringPerson?
    fun saveInspiringPerson(person: InspiringPerson)
}