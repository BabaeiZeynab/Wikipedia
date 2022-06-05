package com.zeynab.wikipedia.fragmnets

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.zeynab.wikipedia.MainActivity2
import com.zeynab.wikipedia.adapters.TrendAdapter
import com.zeynab.wikipedia.adapters.ItemEvents
import com.zeynab.wikipedia.data.ItemPost
import com.zeynab.wikipedia.databinding.FragmentTrendBinding

class TrendFragment : Fragment(), ItemEvents {

    lateinit var binding: FragmentTrendBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTrendBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataTrend = arrayListOf<ItemPost>(
                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Beethoven.jpg/440px-Beethoven.jpg",
                        "Ludwig van Beethoven", "German composer & pianist",
                        "",
                        true,
                        "+899K",
                        "\t17 December 1770",
                        "From 1802 - 1827",
                        "Beethoven was born in Bonn. His musical talent was obvious at an early age. He was initially harshly and intensively taught by his father Johann van Beethoven"
                ),
                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Oprah_in_2014.jpg/440px-Oprah_in_2014.jpg",
                        "Oprah Winfrey",
                        "Queen of All Media",
                        "scsdcs",
                        true,
                        "+530K",
                        "January 29, 1954",
                        "1973–present",
                        "Winfrey was born into poverty in rural Mississippi to a single teenage mother and later raised in inner-city Milwaukee."

                ),

                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Volodymyr_Zelensky_Official_portrait.jpg/440px-Volodymyr_Zelensky_Official_portrait.jpg",
                        "Volodymyr Zelenskyy",
                        "Ukrainian politician",
                        "",
                        true,
                        "+900K",
                        "25 January 1978",
                        "(2018–presen)",
                        "Volodymyr Oleksandrovych Zelenskyy was born to Jewish parents on 25 January 1978 in Kryvyi Rih, then in the Ukrainian Soviet Socialist Republic.His father, Oleksandr Zelenskyy, is a professor and computer scientist"
                ),
                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Elon_Musk_Royal_Society_%28crop2%29.jpg/440px-Elon_Musk_Royal_Society_%28crop2%29.jpg",
                        "Elon Musk",
                        "Wealthiest person in the world ",
                        "",
                        true,
                        "+345K",
                        "June 28, 1971",
                        "1994 - present",
                        "Elon Reeve Musk was born on June 28, 1971, in Pretoria, a segregated suburb of apartheid South Africa. His mother is Maye Musk a model"
                ),
                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Bill_Gates_2017_%28cropped%29.jpg/440px-Bill_Gates_2017_%28cropped%29.jpg",
                        "Bill Gates",
                        "Business magnate",
                        "",
                        true,
                        "+560K",
                        "October 28, 1955",
                        "1972–present",
                        "Bill Gates was born in Seattle, Washington on October 28, 1955. He is the son of William H. Gates Sr.(1925–2020) and Mary Maxwell Gates (1929–1994)"
                ),
                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Donald_Trump_official_portrait.jpg/440px-Donald_Trump_official_portrait.jpg",
                        "Donald Trump",
                        "45th president of USA",
                        "hshssa",
                        true,
                        "+420K",
                        "June 14, 1946",
                        "2012–present",
                        "Donald John Trump was born on June 14, 1946, at Jamaica Hospital in the borough of Queens in New York City,[2][3] the fourth child of Fred Trump "

                ),
                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Trudeau_visit_White_House_for_USMCA_%28cropped%29.jpg/440px-Trudeau_visit_White_House_for_USMCA_%28cropped%29.jpg",
                        "Justin Trudeau",
                        "Prime minister of Canada \n born December 25, 1971)  ",
                        "",
                        true,
                        "+290K",
                        "December 25, 1971",
                        "2015- present",
                        "On June 23, 1971, the Prime Minister's Office (PMO) announced that Prime Minister Pierre Trudeau's wife of four months, the former Margaret Sinclair,was pregnant and due in December"

                ),
                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/7/76/Rebel_Heart_3_%28cropped%29.jpg",
                        "Madonna",
                        "Queen of Pop",
                        "",
                        true,
                        "+233K",
                        "August 16, 1958",
                        "1979–present",
                        "Madonna Louise Ciccone was born on August 16, 1958, in Bay City, Michigan, to Catholic parents Madonna Louise (née Fortin) and Silvio Anthony \"Tony\" Ciccone."
                ),
                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Boris_Johnson_official_portrait_%28cropped%29.jpg/440px-Boris_Johnson_official_portrait_%28cropped%29.jpg",
                        "Boris Johnson",
                        "Prime Minister of the UK",
                        "",
                        true,
                        "+129K",
                        "Boris Johnson",
                        "24 July 2019",
                        "Alexander Boris de Pfeffel Johnson was born on 19 June 1964 on the Upper East Side of Manhattan, New York City,to 23-year-old Stanley Johnson, then studying economics at Columbia University"
                ),
                ItemPost(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Jay-Z_%40_Shawn_%27Jay-Z%27_Carter_Foundation_Carnival_%28crop_2%29.jpg/440px-Jay-Z_%40_Shawn_%27Jay-Z%27_Carter_Foundation_Carnival_%28crop_2%29.jpg",
                        "Jay-Z",
                        "American rapper",
                        "",
                        true,
                        "246K",
                        "December 4, 1969",
                        "1986–present",
                        "Jay-Z was born as Shawn Corey Carter in the Brooklyn borough of New York City on 4 December 1969.He was raised in Marcy Houses"
                )
        )
        val myAdapter = TrendAdapter(dataTrend, this)

        binding.txtNumberItems.text = dataTrend.size.toString()

        // recycler layout

        binding.recyclerTrend.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerTrend.adapter = myAdapter


    }


    override fun onItemClicked(itemPost: ItemPost) {
            val intent = Intent(activity, MainActivity2::class.java)
            intent.putExtra("sendData", itemPost)
            startActivity(intent)
    }


}