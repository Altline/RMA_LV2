package hr.ferit.dominikzivko.inspiringpeople.ui.person

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import hr.ferit.dominikzivko.inspiringpeople.App

class PersonDetailsViewModel : ViewModel() {

    private val repository by lazy { App.repository }

    private val personId = MutableLiveData<Int>()
    val person = Transformations.map(personId) { id ->
        repository.getInspiringPerson(id)
    }

    fun setPerson(id: Int) {
        personId.value = id
    }
}