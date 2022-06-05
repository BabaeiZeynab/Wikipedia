package com.zeynab.wikipedia

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import cn.pedant.SweetAlert.SweetAlertDialog
import com.google.android.material.snackbar.Snackbar
import com.zeynab.wikipedia.databinding.ActivityMainBinding
import com.zeynab.wikipedia.fragmnets.*

/*
   Zeynab Babaei
   Wikipedia Project
 */

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // we are seting toold bar as main action bar in the program
        setSupportActionBar(binding.toolBarMain)

        // add actionBarDrawerToggle
        val actionBarDrawerToggle = ActionBarDrawerToggle(
                this,
                binding.drawerLayoutMain,
                binding.toolBarMain,
                R.string.openDrawer,
                R.string.closeDrawer
        )


        // we will set actionBarDrawertoggle to our main Drawer
        binding.drawerLayoutMain.addDrawerListener(actionBarDrawerToggle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // this part will show our drawer which is not icon it three lines
        actionBarDrawerToggle.syncState()

        binding.navigationViewMain.setNavigationItemSelectedListener { it ->
            // check all the menuItem with id
            when (it.itemId) {

                R.id.menu_writer -> {

                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)
                }


                R.id.menu_photograph -> {

                    // create fragment and show in our activity
                    supportFragmentManager.beginTransaction().apply {
                        add(R.id.mainFramlayout, WriterFragment())
                        addToBackStack(null)
                        commit()
                    }
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)

                }

                R.id.menu_vieoMaker -> {



                    // using snackBar to show message
                    Snackbar.make(binding.root, "No Internet! ", Snackbar.LENGTH_LONG)
                            .setAction("Rety") {
                                Toast.makeText(this, "Checking Network", Toast.LENGTH_SHORT).show()
                            }.setActionTextColor(ContextCompat.getColor(this, R.color.white))
                            .setBackgroundTint(ContextCompat.getColor(this, R.color.blue))
                            .show()


                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)

                }

                R.id.menu_translator -> {
                    val dialohTrans = TranslaterFragment()
                    dialohTrans.show(supportFragmentManager, null)

                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)
                }


                R.id.menu_wikipedia -> {

                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)

                    val url: String = "https://www.wikipedia.org/"
                    openWebSite(url)

                }

                R.id.menu_wikimedia -> {

                    // if this item is clicked we will close it with below code
                    // it will close with Gravity from start part means left side
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)

                    val url: String = "https://www.wikimedia.org/"
                    openWebSite(url)

                }


            }
            true
        }


        /// call firstFragmnetToShow()
        firstFragmenttToShow()

        /// this part is for BottomNavigation

        binding.bottomNavigationMain.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.bottom_explore -> {

                    changeFragment(ExploreFragmnet())

                }


                R.id.bottom_profile -> {

                    changeFragment(ProfileFragmnet())
                }


                R.id.bottom_trend -> {

                    changeFragment(TrendFragment())
                }


            }

            true

        }
        // this is used when progrem is on the fregmnet and if fregmnet is selected it will pretend loading agin
        binding.bottomNavigationMain.setOnItemReselectedListener { }


    }

    private fun openWebSite(url: String) {
        // if you wanna open webSite you should use Intent the same as below
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFramlayout, fragment)
            addToBackStack(null)
            commit()
        }
    }

    /// this function always show for the first time Explore Fragmnet
    fun firstFragmenttToShow() {


        binding.mainFramlayout
        binding.welcome2.playAnimation()
        binding.lottieMain.playAnimation()


        // if we want to checked the icon in the bottomActionBar

        binding.bottomNavigationMain.selectedItemId = R.id.bottom_explore
    }

    // for menu as three dot on top left corner
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.bottom_explore -> {
                Toast.makeText(this, "Explore Clicked", Toast.LENGTH_SHORT).show()
            }

            R.id.bottom_profile -> {
                Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show()
            }

            R.id.bottom_trend -> {
                Toast.makeText(this, "Trend Clicked", Toast.LENGTH_SHORT).show()
            }


        }

        return true
    }


}