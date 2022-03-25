package hr.ferit.dominikzivko.inspiringpeople.data

import androidx.recyclerview.widget.DiffUtil
import java.time.LocalDate
import kotlin.random.Random

data class InspiringPerson(
    val id: Int,
    var name: String,
    var birthDate: String,
    val quotes: List<String>
) {
    fun getRandomQuote(): String? {
        return if (quotes.isNotEmpty()) quotes[Random.nextInt(quotes.size)] else null
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<InspiringPerson>() {
            override fun areItemsTheSame(
                oldItem: InspiringPerson,
                newItem: InspiringPerson
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: InspiringPerson,
                newItem: InspiringPerson
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}
