package com.example.test_taskk.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.test_taskk.adapters.MusicItemRecyclerViewAdapter
import com.example.test_taskk.database.DataBase
import com.example.test_taskk.database.DataBaseImp
import com.example.test_taskk.databinding.FragmentListBinding

class FragmentList : Fragment() {

    private val dataBase: DataBase = DataBaseImp()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = FragmentListBinding.inflate(layoutInflater, container, false)
        view.root.adapter = MusicItemRecyclerViewAdapter(dataBase.getMediaItems())
        return view.root
    }

    companion object {

        fun newInstance(): FragmentList {
            Log.e("Logs", "created")
            return FragmentList()
        }
    }
}