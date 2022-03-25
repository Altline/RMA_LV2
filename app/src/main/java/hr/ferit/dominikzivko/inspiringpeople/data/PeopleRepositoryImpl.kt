package hr.ferit.dominikzivko.inspiringpeople.data

class PeopleRepositoryImpl(
    private val personDao: InspiringPersonDao
) : PeopleRepository {

    override fun getInspiringPeople(): List<InspiringPerson> {
        return personDao.getPeople()
    }

    override fun getInspiringPerson(id: Int): InspiringPerson? {
        return personDao.getPerson(id)
    }

    override fun saveInspiringPerson(person: InspiringPerson) {
        personDao.savePerson(person)
    }
}