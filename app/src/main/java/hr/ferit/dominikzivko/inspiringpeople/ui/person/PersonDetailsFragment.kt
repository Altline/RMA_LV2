package hr.ferit.dominikzivko.inspiringpeople.ui.person

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import hr.ferit.dominikzivko.inspiringpeople.databinding.FragmentPersonDetailsBinding

class PersonDetailsFragment : Fragment() {

    private val viewModel: PersonDetailsViewModel by viewModels()
    private val args: PersonDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentPersonDetailsBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        viewModel.person.observe(viewLifecycleOwner) {} // something is unstable without this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setPerson(args.personId)
    }

}