package com.example.chapter33

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.chapter33.databinding.FragmentDuaBinding

class fragmentDua : Fragment() {
    lateinit var binding: FragmentDuaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDuaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmenBtn4.setOnClickListener() {
            val nama = binding.etViewMasa.text.toString()
            if (nama.isNotEmpty()) {
                val action = fragmentDuaDirections.actionFragmentDuaToFragmentTiga(nama)
                findNavController().navigate(action)
            } else {
                Toast.makeText(activity, "Masukkan Massa Terlebih Dulu", Toast.LENGTH_SHORT).show()

            }

            binding.fragmenBtn4.setOnClickListener() {
                val namaa = binding.etViewPercepatan.text.toString()
                if (namaa.isNotEmpty()) {
                    val action = fragmentDuaDirections.actionFragmentDuaToFragmentTiga(nama)
                    findNavController().navigate(action)
                } else {
                    Toast.makeText(activity, "Masukkan Percepatan Terlebih Dulu", Toast.LENGTH_SHORT).show()

                }

            }


        }

    }
}











