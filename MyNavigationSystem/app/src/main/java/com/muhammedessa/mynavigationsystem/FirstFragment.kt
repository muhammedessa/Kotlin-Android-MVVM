package com.muhammedessa.mynavigationsystem

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.muhammedessa.mynavigationsystem.databinding.FragmentFirstBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_first,container,false)

        binding.button.setOnClickListener {
            if (!TextUtils.isEmpty(binding.editTextText.text.toString())){
                var bundle = bundleOf("name" to binding.editTextText.text.toString())
                it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment,bundle)
            }else{
                Toast.makeText(activity,"Empty field",Toast.LENGTH_SHORT).show()
            }



        }


        return  binding.root
    }


}