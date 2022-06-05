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
import com.zeynab.wikipedia.databinding.FragmentDialogWriterBinding

class dialogWriterFragment : DialogFragment() {

    lateinit var binding: FragmentDialogWriterBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val dialog = AlertDialog.Builder(context)
        val dialogXML = FragmentDialogWriterBinding.inflate(layoutInflater, null, false)
        val dialogView =  dialog.setView(dialogXML.root)
        return dialogView.create()


    }

}