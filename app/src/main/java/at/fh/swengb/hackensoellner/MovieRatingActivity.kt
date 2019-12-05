package at.fh.swengb.hackensoellner

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import at.fh.swengb.hackensoellner.MovieRepository.rateMovie
import kotlinx.android.synthetic.main.activity_movie_rating.*

class MovieRatingActivity : AppCompatActivity() {

    companion object{
        val EXTRA_MOVIE_ID_RATING_RETURN = "MOVIE_ID_RATING_RETURN_EXTRA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_rating)

        val movieId = intent.getStringExtra(MovieDetailActivity.EXTRA_MOVIE_ID_RATING)

        if (movieId == null) {
            finish()

        } else {

            //output movie title
            rating_movie_title.text = MovieRepository.movieById(movieId)?.title

            rating_movie_btn_rateThisMovie.setOnClickListener {

                val myMovieReviewObject = Review(
                    rating_movie_ratingbar.rating.toDouble(),
                    rating_movie_feedback.text.toString()
                )
                rateMovie(movieId, myMovieReviewObject)

                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_MOVIE_ID_RATING_RETURN, movieId)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }
        }
    }
}
