package at.fh.swengb.hackensoellner

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object  MovieRepository{

    //private val movies: List<Movie>


    // Local movie-repo not needed anymore
    /*
    init {
        movies = listOf(
            Movie("0","The Imitation Game","22.01.2015",
                "During World War II, the English mathematical genius Alan Turing tries to crack the German Enigma code with help from fellow mathematicians.",
                MovieGenre.DRAMA, Person("Morten Tyldum","19.05.1967"),
                listOf(Person("Benedict Cumberbatch","19.07.1976"), Person("Keira Knightley", "26.03.1985")),
                mutableListOf(), "https://www.youtube.com/watch?v=xNjgSKGqjno"
            ),

            Movie("1","The Dark Knight","21.08.2008",
                "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.",
                MovieGenre.ACTION, Person("Christopher Nolan","30.07.1970"),
                listOf(Person("Christian Bale","30.01.1974"), Person("Heath Ledger", "04.04.1979")),
                mutableListOf(), "https://www.youtube.com/watch?v=EXeTwQWrcwY"
            ),

            Movie("2","Venom","02.10.2018",
                "A failed reporter is bonded to an alien entity, one of many symbiotes who have invaded Earth. But the being takes a liking to Earth and decides to protect it.",
                MovieGenre.ACTION, Person("Ruben Fleischer","31.10.1974"),
                listOf(Person("Tom Hardy","15.09.1977"), Person("Riz Ahmed", "01.12.1982")),
                mutableListOf(), "https://www.youtube.com/watch?v=u9Mv98Gr5pY"
            ),

            Movie("3","The Nightmare Before Christmas","08.12.1994",
                "Jack Skellington, king of Halloween Town, discovers Christmas Town, but his attempts to bring Christmas to his home causes confusion.",
                MovieGenre.HORROR, Person("Henry Selick","30.11.1952"),
                listOf(Person("Danny Elfman","29.05.1953"), Person("Chris Sarandon", "24.07.1942")),
                mutableListOf(), "https://www.youtube.com/watch?v=wr6N_hZyBCk"
            ),

            Movie("4","Memento","13.12.2001",
                "A man with short-term memory loss attempts to track down his wife's murderer.",
                MovieGenre.ACTION, Person("Christopher Nolan","30.07.1970"),
                listOf(Person("Guy Pearce","05.10.1967"), Person("Carrie-Anne Moss", "21.08.1967")),
                mutableListOf(), "https://www.youtube.com/watch?v=0vS0E9bBSL0"
            ),

            Movie("5","Pulp Fiction","03.11.1994",
                "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
                MovieGenre.ACTION, Person("Quentin Tarantino","27.03.1963"),
                listOf(Person("John Travolta","18.02.1954"), Person("Samuel L. Jackson", "21.12.1948")),
                mutableListOf(), "https://www.youtube.com/watch?v=s7EdQ4FqbhY"
            ),

            Movie("6","Joker","10.10.2019",
                "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.",
                MovieGenre.DRAMA, Person("Todd Phillips","20.12.1970"),
                listOf(Person("Joaquin Phoenix","28.10.1974"), Person("Robert De Niro", "17.08.1943")),
                mutableListOf(), "https://www.youtube.com/watch?v=-_DJEzZk2pc"
            ),

            Movie("7","Avengers: Age of Ultron","23.04.2015",
                "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's mightiest heroes to stop the villainous Ultron from enacting his terrible plan.",
                MovieGenre.ACTION, Person("Joss Whedon","23.06.1964"),
                listOf(Person("Robert Downey Jr.","04.04.1965"), Person("Chris Evans", "13.06.1981")),
                mutableListOf(), "https://www.youtube.com/watch?v=tmeOjFno6Do"
            ),

            Movie("8","The Shawshank Redemption","09.03.1995",
                "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
                MovieGenre.DRAMA, Person("Frank Darabont","28.01.1959"),
                listOf(Person("Tim Robbins","16.10.1958"), Person("Morgan Freeman", "01.06.1937")),
                mutableListOf(), "https://www.youtube.com/watch?v=NmzuHjWmXOc"
            ),

            Movie("9","Watchmen","05.03.2005",
                "In 1985 where former superheroes exist, the murder of a colleague sends active vigilante Rorschach into his own sprawling investigation, uncovering something that could completely change the course of history as we know it.",
                MovieGenre.ACTION, Person("Zack Snyder","01.03.1966"),
                listOf(Person("Jackie Earle Haley","14.07.1961"), Person("Patrick Wilson", "03.07.1973")),
                mutableListOf(), "https://www.youtube.com/watch?v=wglmbroElU0"
            ),

            Movie("10","The Notebook","02.09.2004",
                "A poor yet passionate young man falls in love with a rich young woman, giving her a sense of freedom, but they are soon separated because of their social differences.",
                MovieGenre.ROMANCE, Person("Nick Cassavetes","21.03.1959"),
                listOf(Person("Gena Rowlands","19.06.1930"), Person("James Garner", "07.04.1928")),
                mutableListOf(), "https://www.youtube.com/watch?v=FC6biTjEyZw"
            ),

            Movie("11","The Great Dictator","26.08.1958",
                "Dictator Adenoid Hynkel tries to expand his empire while a poor Jewish barber tries to avoid persecution from Hynkel's regime.",
                MovieGenre.COMEDY, Person("Charles Chaplin","16.04.1889"),
                listOf(Person("Charles Chaplin","16.04.1889"), Person("Paulette Goddard", "03.06.1910")),
                mutableListOf(), "https://www.youtube.com/watch?v=zroWIN-lS8E"
            ),

            Movie("12","Arrival","24.11.2016",
                "A linguist works with the military to communicate with alien lifeforms after twelve mysterious spacecraft appear around the world.",
                MovieGenre.ACTION, Person("Denis Villeneuve","03.10.1967"),
                listOf(Person("Amy Adams","20.08.1974"), Person("Jeremy Renner", "07.01.1971")),
                mutableListOf(), "https://www.youtube.com/watch?v=tFMo3UJ4B4g"
            ),

            Movie("13","Full Metal Jacket","08.10.1987",
                "A pragmatic U.S. Marine observes the dehumanizing effects the Vietnam War has on his fellow recruits from their brutal boot camp training to the bloody street fighting in Hue.",
                MovieGenre.ACTION, Person("Stanley Kubrick","26.07.1928"),
                listOf(Person("R. Lee Ermey","24.03.1944"), Person("Matthew Modine", "22.03.1959")),
                mutableListOf(), "https://www.youtube.com/watch?v=Ks_MbPPkhmA"
            ),

            Movie("14","Intouchables","05.01.2012",
                "After he becomes a quadriplegic from a paragliding accident, an aristocrat hires a young man from the projects to be his caregiver.",
                MovieGenre.COMEDY, Person("Olivier Nakache","15.04.1973"),
                listOf(Person("Francois Cluzet","21.09.1955"), Person("Omar Sy", "20.01.1978")),
                mutableListOf(), "https://www.youtube.com/watch?v=34WIbmXkewU"
            ),

            Movie("15","Transformers","01.08.2007",
                "An ancient struggle between two Cybertronian races, the heroic Autobots and the evil Decepticons, comes to Earth, with a clue to the ultimate power held by a teenager.",
                MovieGenre.ACTION, Person("Michael Bay","17.02.1965"),
                listOf(Person("Shia LaBeouf","11.06.1986"), Person("Megan Fox", "16.03.1986")),
                mutableListOf(), "https://www.youtube.com/watch?v=kY2OOPGKr68"
            ),

            Movie("16","The Revenant","07.01.2016",
                "A frontiersman on a fur trading expedition in the 1820s fights for survival after being mauled by a bear and left for dead by members of his own hunting team.",
                MovieGenre.ACTION, Person("Alejandro G. Inarritu","15.08.1963"),
                listOf(Person("Leonardo DiCaprio","11.11.1974"), Person("Tom Hardy", "15.09.1977")),
                mutableListOf(), "https://www.youtube.com/watch?v=LoebZZ8K5N0"
            ),

            Movie("17","Gladiator","25.03.2000",
                "A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery.",
                MovieGenre.ACTION, Person("Ridley Scott","30.11.1937"),
                listOf(Person("Russell Crowe","07.04.1964"), Person("Joaquin Phoenix", "28.10.1974")),
                mutableListOf(), "https://www.youtube.com/watch?v=owK1qxDselE"
            ),

            Movie("18","300","05.04.2007",
                "King Leonidas of Sparta and a force of 300 men fight the Persians at Thermopylae in 480 B.C.",
                MovieGenre.ACTION, Person("Zack Snyder","01.03.1966"),
                listOf(Person("Gerard Butler","13.11.1969"), Person("Lena Headey", "03.10.1973")),
                mutableListOf(), "https://www.youtube.com/watch?v=UrIbxk7idYA"
            ),

            Movie("19","Raiders of the Lost Ark","29.10.1981",
                "In 1936, archaeologist and adventurer Indiana Jones is hired by the U.S. government to find the Ark of the Covenant.",
                MovieGenre.ACTION, Person("Steven Spielberg","18.12.1946"),
                listOf(Person("Harrison Ford","13.07.1942"), Person("Karen Allen", "05.10.1951")),
                mutableListOf(), "https://www.youtube.com/watch?v=Rh_BJXG1-44"
            ),

            Movie("20","Big Hero 6","22.01.2015",
                "The special bond that develops between plus-sized inflatable robot Baymax, and prodigy Hiro Hamada, who team up with a group of friends to form a band of high-tech heroes.",
                MovieGenre.ACTION, Person("Don Hall","08.03.1969"),
                listOf(Person("Ryan Potter","12.09.1995"), Person("Scott Adsit", "26.11.1965")),
                mutableListOf(), "https://www.youtube.com/watch?v=z3biFxZIJOQ"
            )
        )

    }
     */

    /* -- Old function for the movieList
    //func to return a MovieList
    fun movieList(): List<Movie>{
        return movies
    }
     */

    fun movieList(success: (movieList: List<Movie>) -> Unit, error: (errorMessage: String) -> Unit) {
        MovieApi.retrofitService.movies().enqueue(object: Callback<List<Movie>> {
            override fun onFailure(call: Call<List<Movie>>, t: Throwable) {
                error("API call failed") //TODO how to use the string resource
            }

            override fun onResponse(call: Call<List<Movie>>, response: Response<List<Movie>>) {
                val responseBody = response.body()
                if (response.isSuccessful && responseBody != null) {
                    success(responseBody)
                } else {
                    error("Something went wrong") //TODO string resource
                }
            }

        })
    }


    /* Old function to find movie by ID
    //func to find a movie by it's Id
    fun movieById(id: String): Movie?{
        return movies.find { it.id == id }
    }
     */

    //TODO brauch ich da movieByIDDEtail
    //TODO brauch ich eigene movieByID mit nur Movie

    fun movieById(id:String, success: (movie: MovieDetail) -> Unit, error: (errorMessage: String) -> Unit){
        MovieApi.retrofitService.movieByID(id).enqueue(object: Callback<MovieDetail> {
            override fun onFailure(call: Call<MovieDetail>, t: Throwable) {
                error("The call failed")
            }

            override fun onResponse(call: Call<MovieDetail>, response: Response<MovieDetail>) {
                val responseBody = response.body()
                if (response.isSuccessful && responseBody != null) {
                    success(responseBody)
                } else {
                    error("Something went wrong")
                }
            }

        })

    }



    /* Old function to rate a movie
    //func to rate a given movie
    fun rateMovie(id: String, review: Review){
        movieById(id)?.reviews?.add(review)
    }
     */
    fun rateMovie(id: String, rating: Review, success: (Unit: Unit) -> Unit, error: (errorMessage: String) -> Unit){
        MovieApi.retrofitService.rateMovie(id, rating).enqueue(object: Callback<Unit> {
            override fun onFailure(call: Call<Unit>, t: Throwable) {
                error("The call failed")
            }

            override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
                val responseBody = response.body()
                if (response.isSuccessful && responseBody != null) {
                    success(responseBody)
                } else {
                    error("Something went wrong")
                }
            }
        })
    }




}