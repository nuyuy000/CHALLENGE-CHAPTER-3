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
            if (binding.etViewMasa.text.toString()
                    .isNullOrEmpty() || binding.etViewPercepatan.text.toString()
                    .isNullOrEmpty() || binding.etViewTinggi.text.toString().isNullOrEmpty()
            ) {
                Toast.makeText(requireContext(), "Kolom Ada Yang Kosong !!", Toast.LENGTH_SHORT)
                    .show()

            } else {
                val percepatan = binding.etViewPercepatan.text.toString().toInt()
                val massa = binding.etViewMasa.text.toString().toInt()
                val tinggi = binding.etViewTinggi.text.toString().toInt()
                val total = (percepatan * massa * tinggi)
                    val p = ("Jika Diketahui Tinggi  = $tinggi (m) \n" +
                            " Massa = $massa (kg/m3) \n" +
                            " Percepatan = $percepatan(m/s2) \n" +
                            "Maka Tekanan Hidrostatis Kamu Adalah $total (pa) \n\n ")
                    val dataRumus = DataRumus(0, 0, 0)
                    val actionn = fragmentDuaDirections.actionFragmentDuaToFragmentTiga(p, dataRumus)
                    it.findNavController().navigate(actionn)

                }


            }

        }



}
















