

package com.danny.mapswithgeofencing.ui.main.fragments.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.danny.mapswithgeofencing.databinding.ItemRecyclerCategoryBinding
import com.danny.mapswithgeofencing.ui.viewholders.CategoryVh
import com.danny.mapswithgeofencing.utils.hGetCategroyList


class CategoriesAdapter(
        hContext: Context,
) : RecyclerView.Adapter<RecyclerView.ViewHolder?>() {

    private var hCategoriesCallback: ((Category) -> Unit)? = null
    private var hCategoriesList: List<Category> = hGetCategroyList(hContext)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CategoryVh(
                ItemRecyclerCategoryBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                )
        )
    }


    override fun getItemCount(): Int {
        return hCategoriesList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        hBindCategoryVh(holder as CategoryVh, position)
    }

    private fun hBindCategoryVh(categoryVh: CategoryVh, position: Int) {
        val hCategoryItem = hCategoriesList.get(position)
        categoryVh.hItemRecyclerCategoryBinding.hCategoriesChip.text = hCategoryItem.name

        categoryVh.hItemRecyclerCategoryBinding.hCategoriesChip.chipIcon = hCategoryItem.icon
        categoryVh.hItemRecyclerCategoryBinding.hCategoriesChip.setOnClickListener {
            hCategoriesCallback?.invoke(hCategoryItem)
        }
    }

    fun hSetCategoriesCallback(categoriesCallback: (Category) -> Unit) {
        hCategoriesCallback = categoriesCallback
    }

}