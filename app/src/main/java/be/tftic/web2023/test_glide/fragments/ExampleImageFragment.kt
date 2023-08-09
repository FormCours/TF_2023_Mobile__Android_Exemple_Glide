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

    // region Listener
    fun interface OnClickTestButtonListener {
        fun onClickTest(message : String)
    }
    // endregion

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

        // Set listener on Button
        binding.btnFragExampleTest.setOnClickListener { sendMessageToParent() }

        // Return View
        return binding.root
    }

    private fun sendMessageToParent() {

        // Récuperation de l'activité parent (si celle-ci implemente l'interface Listener)
        val parent = activity as? OnClickTestButtonListener

        // Déclanchement de l'action dans le code de l'activité parent
        parent?.onClickTest("J'adore pokemon ♥")

    }
}