package hr.ferit.dominikzivko.inspiringpeople

import android.app.Application
import hr.ferit.dominikzivko.inspiringpeople.data.InMemoryDb
import hr.ferit.dominikzivko.inspiringpeople.data.InspiringPersonDao
import hr.ferit.dominikzivko.inspiringpeople.data.PeopleRepository
import hr.ferit.dominikzivko.inspiringpeople.data.PeopleRepositoryImpl

class App : Application() {

    companion object {
        val personDao: InspiringPersonDao by lazy { InMemoryDb() }

        val repository: PeopleRepository by lazy { PeopleRepositoryImpl(personDao) }
    }
}