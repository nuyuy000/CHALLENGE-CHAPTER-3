package com.example.chapter33

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.chapter33.databinding.FragmentSatuBinding
import com.example.chapter33.databinding.FragmentTigaBinding
import kotlinx.coroutines.currentCoroutineContext


class fragmentTiga : Fragment() {
    lateinit var binding: FragmentTigaBinding
    val args: fragmentTigaArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTigaBinding.inflate(inflater,container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nama = args.nama
        binding.navNama.text = nama

        val hasil = args.hasil
        binding.navHasil.text = hasil

        binding.fragmentBtn3.setOnClickListener() {
            it.findNavController().navigate(R.id.action_fragmentTiga_to_fragmentDua)
        }
    }


    }




