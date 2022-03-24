package com.example.chapter33

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.chapter33.databinding.FragmentDuaBinding
import com.example.chapter33.databinding.FragmentSatuBinding

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
            if (binding.etViewMasa.text.toString().isNotEmpty()) {
                val hasil = binding.etViewMasa.text.toString()
                val action = fragmentDuaDirections.actionFragmentDuaToFragmentTiga(hasil)
                findNavController().navigate(hasil)
            } else {
                Toast.makeText(activity, "Masukkan Massa Terlebih Dulu", Toast.LENGTH_SHORT).show()
            }
        }
        binding.fragmenBtn4.setOnClickListener {
            if(binding.etViewMasa.text.isNotEmpty()){
                val animal = data(
                    binding.etAnmName.text.toString(),
                    binding.etAnmColor.text.toString(),
                    binding.etAnmLegs.text.toString().toInt(),
                    binding.etAnmEnv.text.toString()
                )

                val intentParcelable = Intent(this, ParcelableActivity::class.java).apply {
                    putExtra(OBJECT_PARCELABLE, animal)
                }

    }
}






