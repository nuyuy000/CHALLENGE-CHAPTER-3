package com.example.chapter33

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isGone
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.chapter33.databinding.FragmentDuaBinding
import com.example.chapter33.databinding.FragmentSatuBinding
import com.example.chapter33.databinding.FragmentTigaBinding
import kotlinx.coroutines.currentCoroutineContext


class fragmentTiga : Fragment() {
    lateinit var binding: FragmentTigaBinding
    val args: fragmentTigaArgs by navArgs()
    companion object{
        const val NAMA = "NAMA" }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTigaBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hasil = args.hasil
        val nama = args.nama
        binding.navNama.text = "\n\nSelamat Datang \n\n $nama \n\n"

        binding.fragmentBtn3.setOnClickListener() {
            it.findNavController().navigate(R.id.action_fragmentTiga_to_fragmentDua)

        }
    }

}













