package be.tftic.web2023.test_glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import be.tftic.web2023.test_glide.fragments.ExampleImageFragment

class MainActivity : AppCompatActivity(), ExampleImageFragment.OnClickTestButtonListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClickTest(message: String) {

        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}