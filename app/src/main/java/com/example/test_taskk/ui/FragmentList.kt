package com.example.test_taskk.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.test_taskk.adapters.MusicItemRecyclerViewAdapter
import com.example.test_taskk.database.DataSource
import com.example.test_taskk.database.DataSourceImp
import com.example.test_taskk.databinding.FragmentListBinding


class FragmentList : Fragment() {

    private val dataBase: DataSource = DataSourceImp()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = FragmentListBinding.inflate(layoutInflater, container, false)
        view.root.adapter = MusicItemRecyclerViewAdapter(dataBase.getMediaItems())
        view.root.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            ))
        return view.root
    }

    companion object {

        fun newInstance(): FragmentList {
            Log.e("Logs", "created")
            return FragmentList()
        }
    }
}