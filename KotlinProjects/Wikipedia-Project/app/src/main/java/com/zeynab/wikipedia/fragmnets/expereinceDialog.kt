package com.zeynab.wikipedia.fragmnets

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.zeynab.wikipedia.R
import com.zeynab.wikipedia.databinding.FragmentExpereinceDialogBinding


class expereinceDialog : DialogFragment() {

    lateinit var binding: FragmentExpereinceDialogBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        // how to craete dialog fragmnet
        val dialog = AlertDialog.Builder(context)

        // create view
       //val view = LayoutInflater.from(context).inflate(R.layout.fragment_expereince_dialog, null, false)

        binding = FragmentExpereinceDialogBinding.inflate(layoutInflater, null, false)
        val view = binding.root
        dialog.setView(view)
        return dialog.create()
    }
}