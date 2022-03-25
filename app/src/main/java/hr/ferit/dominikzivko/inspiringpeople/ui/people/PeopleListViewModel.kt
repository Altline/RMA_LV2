package hr.ferit.dominikzivko.inspiringpeople.ui.people

import androidx.lifecycle.ViewModel
import hr.ferit.dominikzivko.inspiringpeople.App

class PeopleListViewModel : ViewModel() {

    private val repository by lazy { App.repository }

    val people = repository.getInspiringPeople()
}