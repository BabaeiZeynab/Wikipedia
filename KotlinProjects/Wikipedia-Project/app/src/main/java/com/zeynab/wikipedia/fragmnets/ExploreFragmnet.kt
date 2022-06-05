package com.zeynab.wikipedia.fragmnets

import android.content.ClipData
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zeynab.wikipedia.MainActivity2
import com.zeynab.wikipedia.R
import com.zeynab.wikipedia.adapters.ExploreAdapter
import com.zeynab.wikipedia.adapters.ItemEvents
import com.zeynab.wikipedia.data.ItemPost
import com.zeynab.wikipedia.databinding.FragmentExploreFragmnetBinding


class ExploreFragmnet : Fragment(), ItemEvents {

    lateinit var binding: FragmentExploreFragmnetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExploreFragmnetBinding.inflate(layoutInflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // craeet our data
        val dataExplore = arrayListOf<ItemPost>(

            ItemPost(
                "https://cdn.pixabay.com/photo/2022/02/19/11/31/singer-7022384__480.png",
                "Michael Jackson",
                "Michael Joseph Jackson was an American singer",
                "Michael Joseph Jackson (August 29, 1958 – June 25, 2009) was an American singer, songwriter, and dancer. Dubbed the \"King of Pop\", he is regarded as one of the most significant cultural figures of the 20th century. Over a four-decade career, his contributions to music, dance, and fashion, along with his publicized personal life, made him a global figure in popular culture. Jackson influenced artists across many music genres; through stage and video performances, he popularized complicated dance moves such as the moonwalk, to which he gave the name, as well as the robot",
                false,
                "",
                "August 29, 1958",
                "1964–2009",
                "Michael Joseph Jackson[9][10] was born in Gary, Indiana, on August 29, 1958.[11][12] He was the eighth of ten children in the Jackson family, a working-class African-American family living in a two-bedroom house on Jackson Street.[13][14] His mother, Katherine Esther Jackson (née Scruse), played clarinet and piano, had aspired to be a country-and-western performer, and worked part-time at Sears.[15] She was a Jehovah's Witness.[16] His father, Joseph Walter \"Joe\" Jackson, a former boxer, was a crane operator at U.S. Steel and played guitar with a local rhythm and blues band, the Falcons, to supplement the family's income.[17][18] Joe's great-grandfather, July \"Jack\" Gale, was a US Army scout; family lore held that he was also a Native American medicine man.[19] Michael grew up with three sisters (Rebbie, La Toya, and Janet) and five brothers (Jackie, Tito, Jermaine, Marlon, and Randy).[17] A sixth brother, Marlon's twin Brandon, died shortly after birth. In 2012, Depp was one of the world's biggest film stars,[1][2] and was listed by the Guinness World Records as the world's highest-paid actor, with earnings of US\$75 million.[3] During the 2010s Depp began producing films through his company, Infinitum Nihil, and formed the rock supergroup Hollywood Vampires with Alice Cooper and Joe Perry, before starring as Gellert Grindelwald in the Warner Bros. Wizarding World films Fantastic Beasts and Where to Find Them (2016) and Fantastic Beasts: The Crimes of Grindelwald (2018).\n" +
                        "\n" +
                        "From 2015 to 2017, Depp was married to actress Amber Heard. Their divorce drew media attention as Heard alleged that Depp had been abusive throughout their relationship. In 2018, Depp claimed that Heard had abused him before he unsuccessfully sued the publishers of British tabloid The Sun for defamation under English law. Depp later sued Heard for defamation in Virginia after she wrote an op-ed saying she was a public victim of domestic violence. The trial Depp v. Heard began in 2022. Depp was also in a relationship with French singer Vanessa Paradis between 1998 and 2012; they have two children, including the actress and model Lily-Rose Depp. The eighth child of the Jackson family, Jackson made his professional debut in 1964 with his elder brothers Jackie, Tito, Jermaine, and Marlon as a member of the Jackson 5 (later known as the Jacksons). Jackson began his solo career in 1971 while at Motown Records. He became a solo star with his 1979 album Off the Wall. His music videos, including those for \"Beat It\", \"Billie Jean\", and \"Thriller\" from his 1982 album Thriller, are credited with breaking racial barriers and transforming the medium into an artform and promotional tool. He helped propel the success of MTV and continued to innovate with videos for the albums Bad (1987), Dangerous (1991), and HIStory: Past, Present and Future, Book I (1995). Thriller became the best-selling album of all time, while Bad was the first album to produce five U.S. Billboard Hot 100 number-one singles.[nb 1]\n" +
                        "\n" +
                        "From the late 1980s, Jackson became a figure of controversy and speculation due to his changing appearance, relationships, behavior, and lifestyle. In 1993, he was accused of sexually abusing the child of a family friend. The lawsuit was settled out of civil court; Jackson was not indicted due to lack of evidence. In 2005, he was tried and acquitted of further child sexual abuse allegations and several other charges. The FBI found no evidence of criminal conduct on Jackson's behalf in either case. In 2009, while preparing for a series of comeback concerts, This Is It, Jackson died from an overdose of propofol administered by his personal physician, Conrad Murray, who was convicted in 2011 of involuntary manslaughter."
            ),

            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Johnny_Depp-2757_%28cropped%29.jpg/440px-Johnny_Depp-2757_%28cropped%29.jpg",
                "John Christopher Depp",
                "an American actor",
                "He is the recipient of multiple accolades, including a Golden Globe Award and a Screen Actors Guild Award",
                false,
                " ",
                "June 9, 1963 ",
                "\t1984–present",
                "John Christopher Depp II was born on June 9, 1963, in Owensboro, Kentucky,[4][5][6] the youngest of four children of waitress Betty Sue Palmer (née Wells)[7] and civil engineer John Christopher Depp.[8][9] Depp's family moved frequently during his childhood, eventually settling in Miramar, Florida, in 1970.[10] His parents divorced in 1978 when he was 15,[10][11] and his mother later married Robert Palmer, whom Depp has called \"an inspiration\".[12][13]\n" +
                        "\n" +
                        "Depp's mother gave him a guitar when he was 12, and he began playing in various bands.[10] He dropped out of Miramar High School at 16 in 1979 to become a rock musician. He attempted to go back to school two weeks later, but the principal told him to follow his dream of being a musician.[10] In 1980, Depp began playing in a band called The Kids. After modest local success in Florida, the band moved to Los Angeles in pursuit of a record deal, changing its name to Six Gun Method. In addition to the band, Depp worked a variety of odd jobs, such as in telemarketing. In December 1983, Depp married makeup artist Lori Anne Allison,[5] the sister of his band's bassist and singer. "
            ),

            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Mac_Miller_2017.jpg/440px-Mac_Miller_2017.jpg",
                "Mac Miller",
                " American rapper and record",
                "Miller began his career in Pittsburgh's hip hop scene in 2007, at the age of fifteen.",
                false,
                " ",
                "January 19, 1992",
                "2007–2018",
                "XXL featured Miller in its annual \"Freshman Class\" list of 2011, alongside 10 other rappers including Kendrick Lamar and Meek Mill.[17][18] Miller released his fifth mixtape, Best Day Ever, in March 2011.[19] Its single \"Donald Trump\" became his first song to chart on the US Billboard Hot 100,[20] peaking at number 75,[21] and received a platinum certification from the Recording Industry Association of America (RIAA).[22] Also in March 2011, he released a six-track EP, On and On and Beyond. Intended to target a new audience, four of its tracks were previously included on his mixtapes.[23] The EP was his first entry into the US Billboard 200 albums chart at number 55.[24]\n" +
                        "\n" +
                        "Miller's debut studio album, Blue Slide Park, released on November 8, 2011.[25] With 144,000 first week sales, it debuted atop the Billboard 200, the first independently distributed debut album to do so since Tha Dogg Pound's Dogg Food in 1995.[26] Three songs from the album, \"Smile Back\", \"Frick Park Market\", and \"Party on Fifth Ave.\" charted on the Billboard Hot 100, peaking at number 55, 60, and 64, respectively.[21] Blue Slide Park was certified gold in the United States and Canada.[27][28] Despite its impressive commercial performance, Blue Slide Park received a generally mixed critical response.\n" +
                        "\n" +
                        "On March 23, 2012, Miller released his seventh mixtape, Macadelic.[29] The single \"Loud\" peaked at number 53 on the Billboard Hot 100.[21] In mid-2012, Miller premiered two songs produced by Pharrell Williams, from a planned collaboration EP, Pink Slime.[30] At least ten tracks were completed by August 2012 according to Miller,[30] but the project was not released despite a multi-year effort.[31][32] Miller released an EP, You, under the alias Larry Lovestein & The Velvet Revival on November 21, 2012. Rather than rap, the EP features Miller crooning over lounging jazz instrumentals.[33] .Malcolm James McCormick was born on January 19, 1992,[2] in the Point Breeze neighborhood of Pittsburgh.[3] He was the son of Karen Meyers, a photographer, and Mark McCormick, an architect,[4] and had an older brother, Miller.[5] His mother is Jewish, and his father is Christian.[6] While he and his brother were raised Jewish,[3][7] he attended a Catholic grade school to \"ensure a good education and a chance to play football and lacrosse.\"[3] He later went to Winchester Thurston School,[8] and graduated from Taylor Allderdice High School.[9]"
            ),


            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/President_Trump_Meets_with_Sentencing_Commutation_Recipients_%2849624188912%29_%28cropped%29.jpg/440px-President_Trump_Meets_with_Sentencing_Commutation_Recipients_%2849624188912%29_%28cropped%29.jpg",
                "Kim Kardashian",
                "American socialite, model, media",
                "Chemistry is the scientific study of the properties and behavior of matter.It is a natural science that covers the elements that make up matter to the compounds composed of atoms, molecules and ions: their composition, structure, properties, behavior and the changes they undergo during a reaction with other substances",
                false,
                " ",
                "October 21, 1980",
                "2003–present",
                "Kimberly Noel Kardashian was born on October 21, 1980, in Los Angeles, California, to Robert and Kris Kardashian (née Houghton).[18] She has an older sister, Kourtney, a younger sister, Khloé, and a younger brother, Rob.[19] Their mother is of Dutch, English, Irish, and Scottish ancestry,[20] while their father was a third-generation Armenian-American.[21] After their parents divorced in 1991, her mother married again that year, to Bruce Jenner,[b] the 1976 Summer Olympics decathlon winner.[23] Through their marriage, Kim Kardashian gained step-brothers Burton \"Burt\", Brandon, and Brody; step-sister Casey; and half-sisters Kendall and Kylie Jenner.[24]\n" +
                        "\n" +
                        "Kardashian attended Marymount High School, a Roman Catholic all-girls school in Los Angeles.[25] In 1994, her father represented football player O. J. Simpson during his murder trial. Simpson is Kardashian's godfather.[26] Kardashian's father died in 2003 of cancer.[27] In her 20s, she was the close friend and stylist of socialite Paris Hilton, through whom Kardashian first garnered media attention.[4][28] Kardashian appeared as a guest on various episodes of Hilton's reality television series The Simple Life between 2003 and 2006"
            ),

            ItemPost(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Mark_Zuckerberg_F8_2019_Keynote_%2832830578717%29_%28cropped%29.jpg/440px-Mark_Zuckerberg_F8_2019_Keynote_%2832830578717%29_%28cropped%29.jpg",
                "Mark Zuckerberg",
                " American media magnate,",
                "Zuckerberg attended Harvard University",
                false,
                " ",
                "May 14, 1984",
                "2004–present",
                "Mark Elliot Zuckerberg was born in White Plains, New York, on May 14, 1984,[7] the son of psychiatrist Karen (née Kempner) and dentist Edward Zuckerberg.[8] He and his three sisters (Arielle, businesswoman Randi, and writer Donna) were raised in a Reform Jewish household[9][10] in Dobbs Ferry, New York.[11] His great-grandparents were Jewish emigrants from Austria, Germany, and Poland.[12] He attended high school at Ardsley High School before transferring to Phillips Exeter Academy. He was captain of the fencing team.[13][14][15]\n" +
                        "\n" +
                        "Software development\n" +
                        "Early years\n" +
                        "Zuckerberg began using computers and writing software in middle school. In high school, he built a program that allowed all the computers between his house and his father's dental office to communicate with each other.[16][17] During Zuckerberg's high-school years, he worked to build a music player called the Synapse Media Player. The device used machine learning to learn the user's listening habits, which was posted to Slashdot[18] and received a rating of 3 out of 5 from PC Magazine.[19] A New Yorker profile said of Zuckerberg: \"some kids played computer games. Mark created them.Following the official launch of the Facebook social media platform, the three filed a lawsuit against Zuckerberg that resulted in a settlement.[31] The agreed settlement was for 1.2 million Facebook shares and \$20 million in cash.[32]\n" +
                        "\n" +
                        "Zuckerberg's Facebook started off as just a \"Harvard thing\" until Zuckerberg decided to spread it to other schools, enlisting the help of roommate Dustin Moskovitz.[33] They began with Columbia, New York University, Stanford, Dartmouth, Cornell, University of Pennsylvania, Brown, and Yale.[34]\n" +
                        "\n" +
                        "Zuckerberg dropped out of Harvard in his sophomore year in order to complete the project.[35] Zuckerberg, Moskovitz and the other co-founders moved to Palo Alto, California, where they leased a small house that served as an office. Over the summer, Zuckerberg met Peter Thiel, who invested in the company. They got their first office in mid-2004. According to Zuckerberg, the group planned to return to Harvard, but they eventually decided to remain in California, where Zuckerberg appreciated the \"mythical place\" of Silicon Valley, the center of computer technology in California.[36][37] They had already turned down offers by major corporations to buy the company. Kardashian developed a significant presence online and across numerous social media platforms, including hundreds of millions of followers on Twitter and Instagram.[4][5][6] She has released a variety of products tied to her name, including the 2014 mobile game Kim Kardashian: Hollywood, a variety of clothing and products, the 2015 photo book Selfish and her eponymous personal app. Her relationship with rapper Kanye West has also received significant media coverage; they married in 2014 and have four children together.[7] As an actress, Kardashian has appeared in films including Disaster Movie (2008), Deep in the Valley (2009), and Temptation: Confessions of a Marriage Counselor (2013).\n" +
                        "\n" +
                        "In recent years, Kardashian has focused on her own businesses by founding KKW Beauty and KKW Fragrance in 2017.[8] In 2019, she launched shapewear company Skims, which was previously called \"Kimono\" but changed its name following widespread backlash.[9] Kardashian has also become more politically active by lobbying president Donald Trump for prison reform and lobbying for Alice Marie Johnson to be granted clemency.[10] She has advocated for the recognition of the Armenian genocide on numerous occasions. Kardashian is also planning to become a lawyer by doing a four-year law apprenticeship that is supervised by the legal nonprofit #cut50, which was co-founded by Van Jones.[11][12][13]"
            ),

            ItemPost(
                "https://cdn.pixabay.com/photo/2016/12/27/06/38/albert-einstein-1933340_1280.jpg",
                "Albert Einstein",
                "Albert Einstein was a theoretical physicist",
                "In 1905, a year sometimes described as his annus mirabilis ('miracle year'), Einstein published four groundbreaking papers. These outlined the theory of the photoelectric effect, explained Brownian motion, introduced special relativity, and demonstrated mass-energy equivalence. Einstein thought that the laws of classical mechanics could no longer be reconciled with those of the electromagnetic field, which led him to develop his special theory of relativity. ",
                false,
                " ",
                "14 March 1879",
                "1902-1933",
                "Albert Einstein was born in Ulm,[7] in the Kingdom of Württemberg in the German Empire, on 14 March 1879 into a family of secular Ashkenazi Jews.[20][21] His parents were Hermann Einstein, a salesman and engineer, and Pauline Koch. In 1880, the family moved to Munich, where Einstein's father and his uncle Jakob founded Elektrotechnische Fabrik J. Einstein & Cie, a company that manufactured electrical equipment based on direct current.[7]\n" +
                        "\n" +
                        "Albert attended a Catholic elementary school in Munich, from the age of five, for three years. At the age of eight, he was transferred to the Luitpold-Gymnasium (now known as the Albert-Einstein-Gymnasium), where he received advanced primary and secondary school education until he left the German Empire seven years later.[22]\n" +
                        "\n" +
                        "In 1894, Hermann and Jakob's company lost a bid to supply the city of Munich with electrical lighting because they lacked the capital to convert their equipment from the direct current (DC) standard to the more efficient alternating current (AC) standard.[23] The loss forced the sale of the Munich factory. In search of business, the Einstein family moved to Italy, first to Milan and a few months later to Pavia. When the family moved to Pavia, Einstein, then 15, stayed in Munich to finish his studies at the Luitpold Gymnasium. His father intended for him to pursue electrical engineering, but Einstein clashed with the authorities and resented the school's regimen and teaching method. He later wrote that the spirit of learning and creative thought was lost in strict rote learning. At the end of December 1894, he traveled to Italy to join his family in Pavia, convincing the school to let him go by using a doctor's note.[24] During his time in Italy he wrote a short essay with the title \"On the Investigation of the State of the Ether in a Magnetic Field. Einstein excelled at math and physics from a young age, reaching a mathematical level years ahead of his peers. The 12-year-old Einstein taught himself algebra and Euclidean geometry over a single summer.[27] Einstein also independently discovered his own original proof of the Pythagorean theorem at age 12.[28] A family tutor Max Talmud says that after he had given the 12-year-old Einstein a geometry textbook, after a short time \"[Einstein] had worked through the whole book. He thereupon devoted himself to higher mathematics... Soon the flight of his mathematical genius was so high I could not follow.\"[29] His passion for geometry and algebra led the 12-year-old to become convinced that nature could be understood as a mathematical structure"
            ),


            )
        // set adapter to get data
        val myAdapter = ExploreAdapter(dataExplore, this)

        // use layoutmanager for adapter with the help of binding

        binding.recyclerExplore.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recyclerExplore.adapter = myAdapter



        binding.search.addTextChangedListener { userInput ->

            if (userInput!!.isNotEmpty()) {

                val cloneList = dataExplore.clone() as ArrayList<ItemPost>
                val filterList = cloneList.filter { itemPost ->
                    (itemPost.txtTitle.contains(userInput))

                }
                myAdapter.setData(ArrayList(filterList))


            } else if (userInput.isEmpty()) {
                myAdapter.setData(dataExplore.clone() as ArrayList<ItemPost>)
            }


        }
    }


        override fun onItemClicked(itemPost: ItemPost) {
            val intent = Intent(activity, MainActivity2::class.java)
            intent.putExtra("sendData", itemPost)
            startActivity(intent)
        }







}