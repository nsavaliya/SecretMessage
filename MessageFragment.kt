package com.example.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val back = view.findViewById<Button>(R.id.back)

        back.setOnClickListener {
            view.findNavController().navigate(R.id.action_messageFragment2_to_welcomeFragment2)
        }
        return view

    }
}