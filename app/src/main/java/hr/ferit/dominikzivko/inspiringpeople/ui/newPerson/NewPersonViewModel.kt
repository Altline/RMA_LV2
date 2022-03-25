package hr.ferit.dominikzivko.inspiringpeople.ui.newPerson

import androidx.lifecycle.ViewModel
import hr.ferit.dominikzivko.inspiringpeople.App
import hr.ferit.dominikzivko.inspiringpeople.data.InspiringPerson

class NewPersonViewModel : ViewModel() {
    private val repository by lazy { App.repository }

    private val nextId get() = repository.getInspiringPeople().size

    private var onSavePerson: (() -> Unit)? = null

    val person = InspiringPerson(nextId, "", "", emptyList())

    fun setOnSavePerson(action: () -> Unit) {
        onSavePerson = action
    }

    fun savePerson() {
        repository.saveInspiringPerson(person)

        onSavePerson?.let { it() }
    }
}