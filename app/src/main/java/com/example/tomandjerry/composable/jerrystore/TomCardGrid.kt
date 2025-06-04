package com.example.tomandjerry.composable.jerrystore

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.grid.itemsIndexed
import com.example.tomandjerry.composable.jerrystore.TomCardData


@Composable
fun TomCardGrid(cards: List<TomCardData>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        itemsIndexed(cards) { index, card ->
            TomSectionCard(
                title = card.title,
                description = card.description,
                cheeseAmount = card.cheeseAmount,
                imageResId = card.imageResId,
                discount = if (index == 0) "5" else ""
            )
        }
    }
}