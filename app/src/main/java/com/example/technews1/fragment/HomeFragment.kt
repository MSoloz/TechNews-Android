package com.example.technews1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.technews1.adapter.NewsAdapter
import com.example.technews1.databinding.FragmentHomeBinding
import com.example.technews1.viewModel.HomeViewModel


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val view = binding.root

        val list : RecyclerView = binding.newsList

         list.layoutManager = LinearLayoutManager(context)

        val viewModel :HomeViewModel by viewModels()




        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}