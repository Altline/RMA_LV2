package hr.ferit.dominikzivko.inspiringpeople.ui.people

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import hr.ferit.dominikzivko.inspiringpeople.databinding.FragmentPeopleListBinding

class PeopleListFragment : Fragment() {

    private val viewModel: PeopleListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentPeopleListBinding.inflate(inflater)
        setUpPeopleList(binding)
        binding.fab.setOnClickListener { navigateToNewPerson() }
        return binding.root
    }

    private fun setUpPeopleList(binding: FragmentPeopleListBinding) {
        val adapter = InspiringPersonAdapter() { personId ->
            navigateToPersonDetails(personId)
        }
        binding.peopleList.adapter = adapter
        adapter.submitList(viewModel.people)
    }

    private fun navigateToPersonDetails(personId: Int) {
        val action =
            PeopleListFragmentDirections.actionPeopleListFragmentToPersonDetailsFragment(personId)
        findNavController().navigate(action)
    }

    private fun navigateToNewPerson() {
        val action = PeopleListFragmentDirections.actionPeopleListFragmentToNewPersonFragment()
        findNavController().navigate(action)
    }
}