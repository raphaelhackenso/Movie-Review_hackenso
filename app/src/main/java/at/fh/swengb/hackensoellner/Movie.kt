package at.fh.swengb.hackensoellner

class Movie(val id: String,
            val title: String,
            val release: String,
            val plot: String,
            val genre: MovieGenre,
            val director: Person,
            val actors: List<Person>,
            val reviews: MutableList<Review>,
            val trailer: String //Addition to the given UML-diagram
             ) {

    fun ratingAverage(): Double{
        var average = reviews.map { it.reviewValue }.average()

        if (average.isNaN()){
            return 0.0 // returning a default value if there is no review
        }
        return  average
    }
}