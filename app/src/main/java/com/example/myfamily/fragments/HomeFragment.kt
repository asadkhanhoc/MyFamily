package com.example.myfamily.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfamily.R
import com.example.myfamily.adapters.MemberAdapter
import com.example.myfamily.databinding.FragmentHomeBinding
import com.example.myfamily.models.MemberModel


class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val listMembers = listOf<MemberModel>(
            MemberModel(
                "Asad Khan",
                "12th building, 5th floor, karachi road",
                "90%",
                "220"
            ),
            MemberModel(
                "Ebad Khan",
                "12th building, 5th floor, karachi road",
                "80%",
                "210"
            ),
            MemberModel(
                "Abbu",
                "12th building, 5th floor, karachi road",
                "70%",
                "200"
            ),
            MemberModel(
                "Ammi",
                "12th building, 5th floor, karachi road",
                "60%",
                "190"
            ),
            MemberModel(
                "Pc",
                "12th building, 5th floor, karachi road",
                "60%",
                "190"
            )
        )

        val adapter = MemberAdapter(listMembers)

        binding.recyclerMember.layoutManager = LinearLayoutManager(context)
        binding.recyclerMember.adapter = adapter

    }

    companion object {
               @JvmStatic
        fun newInstance() = HomeFragment()
    }
}