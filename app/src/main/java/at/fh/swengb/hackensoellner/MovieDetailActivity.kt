package at.fh.swengb.hackensoellner

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MOVIE_ID_RATING = "MOVIE_ID_RATING_EXTRA"
        val ADD_OR_EDIT_RATING_REQUEST = 1
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movieId = intent.getStringExtra(MainActivity.EXTRA_MOVIE_ID)

        if (movieId == null){
            Log.e("PASSING_ERROR","no Movie Id")
            finish()
        } else {

            //output movie details
            outputMovieDetails(movieId)

            //open next activity
            detail_movie_btn_rate.setOnClickListener{
                val intent = Intent(this, MovieRatingActivity ::class.java)
                intent.putExtra(EXTRA_MOVIE_ID_RATING, MovieRepository.movieById(movieId)?.id)
                startActivityForResult(intent, ADD_OR_EDIT_RATING_REQUEST)
            }

            detail_movie_btn_watch_trailer.setOnClickListener{
                val openTrailerURL = Intent(Intent.ACTION_VIEW)
                openTrailerURL.data = Uri.parse(MovieRepository.movieById(movieId)?.trailer)
                startActivity(openTrailerURL)
            }
        }

    }

    private fun outputMovieDetails(inputId: String){
        //Private because of encapsulation
        //Use provided movie Id
        detail_movie_title.text =  MovieRepository.movieById(inputId)?.title
        detail_movie_director_output.text = MovieRepository.movieById(inputId)?.director?.name
        detail_movie_actors_output.text = MovieRepository.movieById(inputId)?.actors?.joinToString { it.name }
        detail_movie_genre_output.text = MovieRepository.movieById(inputId)?.genre.toString()
        detail_movie_avg_ratingbar.rating = MovieRepository.movieById(inputId)?.ratingAverage()?.toFloat() ?: 0.toFloat() //safe call with default vale using Elvis operator
        detail_movie_avg_ratings.text = MovieRepository.movieById(inputId)?.ratingAverage().toString()
        detail_movie_rating_count.text = MovieRepository.movieById(inputId)?.reviews?.count().toString()
        detail_movie_release_output.text = MovieRepository.movieById(inputId)?.release
        detail_movie_plot_description.text = MovieRepository.movieById(inputId)?.plot
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ADD_OR_EDIT_RATING_REQUEST && resultCode == Activity.RESULT_OK) {
            //Output updated content
            val movieReturnId = data?.getStringExtra(MovieRatingActivity.EXTRA_MOVIE_ID_RATING_RETURN)
            if(movieReturnId != null){
                outputMovieDetails(movieReturnId)
            }

            /* possible solution - could cause flickering
                finish()
                startActivity(intent)
             */
        }
    }




}
