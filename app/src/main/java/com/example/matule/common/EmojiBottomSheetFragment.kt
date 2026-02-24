package com.example.matule.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.matule.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class EmojiBottomSheetFragment : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Загружаем layout шторки
        return inflater.inflate(R.layout.bottom_sheet_emoji, container, false)
    }
}