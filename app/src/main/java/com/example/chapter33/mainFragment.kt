package com.example.chapter33

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.example.chapter33.databinding.ActivityMainBinding
import com.example.chapter33.databinding.FragmentMainBinding

class mainFragment : Fragment()  {
private lateinit var binding: FragmentMainBinding
companion object {
    const val OBJECT_PARCELABLE = "PARCELABLE"
    const val MASSA = "MESSAGE"
    const val PERCEPATAN = "AGE"
    const val TINGGI = "BUNGKUSAN"

}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentMainBinding.inflate(inflater,container, false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentBtn.setOnClickListener() {
            it.findNavController().navigate(R.id.action_mainFragment_to_fragmentSatu3)
        }

    }


    }




