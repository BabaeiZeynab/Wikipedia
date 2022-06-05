package com.zeynab.wikipedia.fragmnets


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zeynab.wikipedia.databinding.FragmentProfileFragmnetBinding


class ProfileFragmnet : Fragment() {

    lateinit var binding: FragmentProfileFragmnetBinding



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileFragmnetBinding.inflate(layoutInflater,container, false)
        return binding.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         binding.btnBackProfile.setOnClickListener {
             childFragmentManager.beginTransaction().apply {
                 add(binding.framLayoutProfile.id, ExploreFragmnet())
                 addToBackStack(null)
                 commit()
             }

         }

       binding.experienceCradView.setOnClickListener {

           parentFragmentManager.beginTransaction().apply {
              replace(binding.framLayoutProfile.id, expereinceFragmnet())
               addToBackStack(null)
               commit()


           }
       }

        binding.cardViewEducation.setOnClickListener {

            parentFragmentManager.beginTransaction().apply {
                replace(binding.framLayoutProfile.id, EducationFragment())
                addToBackStack(null)
                commit()
            }
        }



        binding.CardViewSkills.setOnClickListener {

            parentFragmentManager.beginTransaction().apply {
                replace(binding.framLayoutProfile.id, SkillsFragment())
                addToBackStack(null)
                commit()
            }
        }




        binding.CardViewCertificate.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(binding.framLayoutProfile.id, CertificateFragment())
                addToBackStack(null)
                commit()
            }
        }

    }

}