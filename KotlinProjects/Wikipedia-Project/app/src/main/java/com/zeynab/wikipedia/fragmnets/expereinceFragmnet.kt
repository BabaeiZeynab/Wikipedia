package com.zeynab.wikipedia.fragmnets

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zeynab.wikipedia.R
import com.zeynab.wikipedia.databinding.FragmentExpereinceFragmnetBinding


class expereinceFragmnet : Fragment() {

    lateinit var binding: FragmentExpereinceFragmnetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExpereinceFragmnetBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.fab.setOnClickListener {
      // when we want to use our dialog we have to craeet object of our dialog class

            val experinceDialog = expereinceDialog()
            experinceDialog.show(parentFragmentManager, null)


        }



    }

}