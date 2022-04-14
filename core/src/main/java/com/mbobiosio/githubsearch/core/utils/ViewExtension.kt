package com.mbobiosio.githubsearch.core.utils

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import coil.load
import com.google.android.material.imageview.ShapeableImageView
import com.mbobiosio.githubsearch.core.R
import com.google.android.material.snackbar.Snackbar
import java.text.ParseException
import java.text.SimpleDateFormat


fun View.gone() {
    this.visibility = View.GONE
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun SwipeRefreshLayout.showLoading() {
    this.isRefreshing = true
}

fun SwipeRefreshLayout.hideLoading() {
    this.isRefreshing = false
}

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Fragment.navigate(action: NavDirections) {
    this.view?.let { Navigation.findNavController(it).navigate(action) }
}

/**
 * @param text text of snackbar
 * @param onRetry callback if user clicked retry button
 *
 * @return displaying Snackbar
 *
 */
fun View.showErrorSnackBar(
    text: String,
    onRetry: (() -> Unit)
) {
    val snackBar = Snackbar.make(this, text, Snackbar.LENGTH_LONG).apply {
        setBackgroundTint(ContextCompat.getColor(this.context, R.color.cinnabar))
        setTextColor(ContextCompat.getColor(this.context, R.color.white))
        setActionTextColor(ContextCompat.getColor(this.context, R.color.white))
        setAction(this.context.getText(R.string.txt_retry_snackbar)) {
            onRetry()
        }
    }
    snackBar.show()
}

/**
 * @param path url of the image
 * @param errorColor error color
 * @return displaying image from Glide
 *
 */
fun ShapeableImageView.cacheImage(path: String, errorColor: Int) {
    load(path) {
        crossfade(true)
        error(errorColor)
    }
}

/**
 * @param inputFormat format dateTime that will be convert
 * @param outputFormat format dateTIme for result
 * @return return new date time format based on outputFormat
 *
 * @see DateFormat for supported DateFormat
 */
@SuppressLint("SimpleDateFormat")
fun String?.dateTimeConvert(inputFormat: String, outputFormat: String): String {
    return try {
        val sdf = SimpleDateFormat(inputFormat)
        val convertDate = sdf.parse(this.orEmpty())
        SimpleDateFormat(outputFormat).format(convertDate!!)
    } catch (e: ParseException) {
        ""
    }
}