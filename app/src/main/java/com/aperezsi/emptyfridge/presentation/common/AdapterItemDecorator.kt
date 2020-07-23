package com.aperezsi.emptyfridge.presentation.common

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.aperezsi.emptyfridge.R

class AdapterItemDecorator(private val verticalSpaceResource: Int = R.dimen.spaceSmall) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val dimen = parent.context.resources.getDimension(verticalSpaceResource)
        val position = parent.getChildAdapterPosition(view)
        if (position != state.itemCount - 1) {
            outRect.bottom = dimen.toInt()
        }
    }
}