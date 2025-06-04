package com.example.tomandjerry.composable.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.DarkBlueGradiant
import com.example.tomandjerry.ui.theme.LightBlueGradiant

@Composable
fun PromotionBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(105.dp)
            .clipToBounds() // clip outside the card
            .padding(top = 10.dp)
    ) {

        // Background Banner
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(85.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(DarkBlueGradiant, LightBlueGradiant)
                    ),
                    shape = RoundedCornerShape(12.dp)
                )
                .clipToBounds() // clip outside the card

                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Buy 1 Tom and get 2 for free",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Adopt Tom! (Free Fail-Free Guarantee)",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
//                .padding(end = 16.dp)
                .offset(x = 2.dp, y = (-10).dp),
            contentAlignment = Alignment.TopEnd
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse2),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .offset(x = 20.dp, y = (10).dp),

                )
            Image(
                painter = painterResource(id = R.drawable.ellipse1),
                contentDescription = null,
                modifier = Modifier
                    .size(130.dp)
                    .offset(x = 20.dp, y = (10).dp),

                )
            Image(
                painter = painterResource(id = R.drawable.tom11),
                contentDescription = "Tom",
                modifier = Modifier
//                    .height(500.dp),

//                    .size(400.dp)
//                    .align(Alignment.TopEnd)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPromotionBanner() {
    PromotionBanner()
}