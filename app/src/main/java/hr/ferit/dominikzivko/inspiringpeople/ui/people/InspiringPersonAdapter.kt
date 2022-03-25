package hr.ferit.dominikzivko.inspiringpeople.ui.people

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.dominikzivko.inspiringpeople.data.InspiringPerson
import hr.ferit.dominikzivko.inspiringpeople.databinding.ItemPersonBinding

class InspiringPersonAdapter(
    private val onItemClicked: (Int) -> Unit
) :
    ListAdapter<InspiringPerson, InspiringPersonAdapter.ViewHolder>(InspiringPerson.DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPersonBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), onItemClicked)
    }

    inner class ViewHolder(private val binding: ItemPersonBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(person: InspiringPerson, onItemClicked: (Int) -> Unit) {
            binding.item = person
            binding.onClick = onItemClicked
        }
    }
}