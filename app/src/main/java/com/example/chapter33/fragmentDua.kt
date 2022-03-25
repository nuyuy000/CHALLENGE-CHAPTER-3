package com.example.chapter33

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.chapter33.databinding.FragmentDuaBinding
import com.example.chapter33.databinding.FragmentTigaBinding

@Suppress("UNUSED_EXPRESSION")
class fragmentDua : Fragment() {
    lateinit var binding: FragmentDuaBinding
    val args: fragmentTigaArgs by navArgs()
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
            if (binding.etJari.text.toString()
                    .isNullOrEmpty() || binding.etViewradius.text.toString()
                    .isNullOrEmpty() || binding.etViewTinggi.text.toString().isNullOrEmpty()
            ) {
                Toast.makeText(requireContext(), "Kolom Ada Yang Kosong !!", Toast.LENGTH_SHORT)
                    .show()

            } else {
                val radius = binding.etViewradius.text.toString().toInt()
                val diameter= binding.etJari.text.toString().toInt()
                val tinggi = binding.etViewTinggi.text.toString().toInt()
                val rumus = radius * (diameter*diameter) *tinggi
                val a = ("\n\nPhi = $radius Jari-Jari = $diameter\n Tinggi = $tinggi\n Hasil Volume Tabung = $rumus\n")
                val hasil = DataRumus (0,0,0,0)

                    val actionn = fragmentDuaDirections.actionFragmentDuaToFragmentTiga(a, hasil )
                    it.findNavController().navigate(actionn)

                }


            }

        }



}
















