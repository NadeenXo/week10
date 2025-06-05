package com.example.tomandjerry.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.jerrystore.Header
import com.example.tomandjerry.composable.jerrystore.PromotionBanner
import com.example.tomandjerry.composable.jerrystore.Search
import com.example.tomandjerry.composable.jerrystore.TomCardData
import com.example.tomandjerry.composable.jerrystore.TomCardGrid
import com.example.tomandjerry.composable.jerrystore.TomSectionHeader
import com.example.tomandjerry.ui.theme.LightBlue


@Composable
fun JerryStore(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = LightBlue)
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
    ) {
        Header("Hi, Jerry 👋", "Which Tom do you want to buy?")
        Search()
        PromotionBanner()
        TomSectionHeader()
        TomCardGrid(
            cards = listOf(
                TomCardData(
                    imageResId = R.drawable.tom2,
                    title = "Sport Tom",
                    description = "He runs 1 meter... trips over his boot.",
                    cheeseAmount = "3 cheeses", discount = "5"
                ),
                TomCardData(
                    imageResId = R.drawable.tom3,
                    title = "Tom the lover",
                    description = "He loves one-sidedly... and is beaten by the other side.",
                    cheeseAmount = "5 cheeses"
                ),
                TomCardData(
                    imageResId = R.drawable.tom4,
                    title = "Tom the bomb",
                    description = "He blows himself up before Jerry can catch him.",
                    cheeseAmount = "10 cheeses"
                ),
                TomCardData(
                    imageResId = R.drawable.tom5,
                    title = "Spy Tom",
                    description = "Disguises itself as a table.",
                    cheeseAmount = "12 cheeses"
                ),
                TomCardData(
                    imageResId = R.drawable.tom6,
                    title = "Frozen Tom",
                    description = "He was chasing Jerry, he froze after the first look.",
                    cheeseAmount = "10 cheeses"
                ),
                TomCardData(
                    imageResId = R.drawable.tom7,
                    title = "Sleeping Tom",
                    description = "He doesn't chase anyone, he just snores in stereo.",
                    cheeseAmount = "10 cheeses"
                )
            )
        )
    }
}


@Preview(showBackground = true, widthDp = 360, heightDp = 1085)
@Preview(showBackground = true, widthDp = 360, heightDp = 862)
@Preview(showBackground = true, widthDp = 360, heightDp = 827)
@Composable
fun PreviewJerryStore() {
    JerryStore(modifier = Modifier)
}

