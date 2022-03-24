package com.example.chapter33
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.chapter33.databinding.FragmentSatuBinding

class fragmentSatu : Fragment() {
    lateinit var binding : FragmentSatuBinding

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

        binding.fragmenBtn2.setOnClickListener() {
           if (binding.etViewNama.text.toString().isNotEmpty()) {
                val nama =  binding.etViewNama.text.toString()
                val action = fragmentSatuDirections.actionFragmentSatuToFragmentTiga(nama)
                it.findNavController().navigate(action)
           }
            else {
               Toast.makeText(activity, "Masukkan Nama Terlebih Dulu", Toast.LENGTH_SHORT).show()

           }
        }
    }
}