package com.hoanganhtuan95ptit.draggable.widget

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener

class DragAppbarLayout @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppBarLayout(context, attrs, defStyleAttr) {

    var offset = 0

    init {
        addOnOffsetChangedListener(OnOffsetChangedListener { _, verticalOffset ->
            offset = verticalOffset
        })
    }
}