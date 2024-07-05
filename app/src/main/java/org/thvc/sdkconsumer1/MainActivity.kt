package org.thvc.sdkconsumer1

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.FragmentActivity
import org.thvc.sdk.WebViewFragment
import org.thvc.sdkconsumer1.databinding.MainActivityLayoutBinding

class MainActivity : FragmentActivity() {

    private lateinit var layoutBinding: MainActivityLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutBinding = MainActivityLayoutBinding.inflate(LayoutInflater.from(this))
        setContentView(layoutBinding.root)
        loadFragment()
    }

    private fun loadFragment() {
        supportFragmentManager.beginTransaction()
            .add(layoutBinding.fragmentView.id, WebViewFragment())
            .commit()
    }
}

