package com.example.chapter33

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.chapter33.databinding.FragmentMainBinding
import com.example.chapter33.databinding.FragmentSatuBinding

class fragmentSatu : Fragment() {
    lateinit var binding: FragmentSatuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSatuBinding.inflate(inflater,container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentBtn.setOnClickListener() {
            it.findNavController().navigate(R.id.action_mainFragment_to_fragmentSatu3)
        }


    }
}