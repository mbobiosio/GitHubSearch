package com.mbobiosio.githubsearch.core.ui.search

import android.content.Context
import com.mbobiosio.githubsearch.core.R
import com.mbobiosio.githubsearch.core.databinding.ItemListSearchUserBinding
import com.mbobiosio.githubsearch.core.domain.model.profile.Profile
import com.mbobiosio.githubsearch.core.utils.ViewBindingKotlinModel
import com.mbobiosio.githubsearch.core.utils.cacheImage

class SearchUserModel(
    private val context: Context,
    private val user: Profile,
    private val onUserClickCallback: ((String) -> Unit)
) : ViewBindingKotlinModel<ItemListSearchUserBinding>(R.layout.item_list_search_user) {

    override fun ItemListSearchUserBinding.bind() {
        user.apply {
            ivImage.cacheImage(avatarUrl, R.color.alto)
            tvName.text = name
            tvUsername.text = context.getString(R.string.txt_username, login)
            tvBio.text = bio
            userSearchLayout.setOnClickListener { onUserClickCallback.invoke(login) }
        }
    }
}