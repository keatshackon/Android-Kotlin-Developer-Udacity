

package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import com.keatssalazar.androidquizapp.R


class TitleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = null; // DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)
        return binding.root
    }

}
