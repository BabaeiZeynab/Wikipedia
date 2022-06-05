package com.zeynab.wikipedia.fragmnets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.zeynab.wikipedia.R
import com.zeynab.wikipedia.databinding.FragmentWriterBinding


class WriterFragment : Fragment() {

    lateinit var binding: FragmentWriterBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentWriterBinding.inflate(layoutInflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnregisterNow.setOnClickListener {


            val writerDialog = dialogWriterFragment()
            writerDialog.show(parentFragmentManager, null)




        }

//       val ares = listOf<String>(
//
//           "Thornhill",
//           "North York",
//           "Richmon hill",
//           "Finch",
//           "Oshowa",
//           "Old Toronto"
//       )
//
//
//        val areAdapter = ArrayAdapter(view.context, R.layout.item_area, ares)
//        ( binding.textInputArea.editText as AutoCompleteTextView).setAdapter(areAdapter)
    }

}