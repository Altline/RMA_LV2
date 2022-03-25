package hr.ferit.dominikzivko.inspiringpeople.ui.newPerson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import hr.ferit.dominikzivko.inspiringpeople.databinding.FragmentNewPersonBinding

class NewPersonFragment : Fragment() {

    private val viewModel: NewPersonViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentNewPersonBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        viewModel.setOnSavePerson {
            navigateUp()
        }
        return binding.root
    }

    private fun navigateUp() {
        findNavController().navigateUp()
    }

}