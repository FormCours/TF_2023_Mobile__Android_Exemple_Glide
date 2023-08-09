package be.tftic.web2023.test_glide.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.tftic.web2023.test_glide.R
import be.tftic.web2023.test_glide.databinding.FragmentExampleImageBinding
import com.bumptech.glide.Glide


class ExampleImageFragment : Fragment() {

    private lateinit var binding : FragmentExampleImageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentExampleImageBinding.inflate(inflater, container, false);

        // Loading image with Glide
        Glide.with(this)
            .load("https://www.pokepedia.fr/images/a/a0/Pichu-RFVF.png")
            .placeholder(R.drawable.not_loading)
            .fitCenter()
            .into(binding.imgFragExample);

        // Return View
        return binding.root
    }
}