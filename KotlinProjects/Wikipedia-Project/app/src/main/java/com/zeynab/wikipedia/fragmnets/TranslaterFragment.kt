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
import com.zeynab.wikipedia.databinding.FragmentTranslaterBinding


class TranslaterFragment : DialogFragment() {

    lateinit var binding : FragmentTranslaterBinding


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

         val dialog = AlertDialog.Builder(context)
        val dialogXML = FragmentTranslaterBinding.inflate(layoutInflater, null, false)
        val view = dialogXML.root
       val dialogTranslater =  dialog.setView(view)
        return dialogTranslater.create()
    }



}