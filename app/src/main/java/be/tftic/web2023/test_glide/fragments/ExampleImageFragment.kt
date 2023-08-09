package be.tftic.web2023.test_glide.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.tftic.web2023.test_glide.databinding.FragmentExampleImageBinding


class ExampleImageFragment : Fragment() {

    private lateinit var binding : FragmentExampleImageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentExampleImageBinding.inflate(inflater, container, false);

        // Return View
        return binding.root
    }
}