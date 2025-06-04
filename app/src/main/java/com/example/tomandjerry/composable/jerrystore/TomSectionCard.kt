package com.example.tomandjerry.composable.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.LightBlue
import com.example.tomandjerry.ui.theme.SecondaryTextColor
import com.example.tomandjerry.ui.theme.White

@Composable
fun TomSectionCard(
    title: String,
    description: String,
    cheeseAmount: String,
    imageResId: Int,
    discount: String = ""
) {
    Box(
        modifier = Modifier
            .size(width = 160.dp, height = 240.dp)
            .background(
                color = LightBlue,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(top = 16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = White,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {

            Box(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .offset(x = 0.dp, y = (-25).dp)
            ) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = description,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = SecondaryTextColor,
                    textAlign = TextAlign.Center
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(

                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = LightBlue)
                        .width(100.dp)
                        .padding(8.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.money_bag),
                        contentDescription = "Money Bag Icon",
                        tint = DarkBlue
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = discount,
                        fontSize = 10.sp,
                        color = DarkBlue,
                        style = TextStyle(
                            textDecoration = TextDecoration.LineThrough
                        )
                    )
                    Spacer(modifier = Modifier.width(4.dp))

                    Text(
                        text = cheeseAmount,
                        fontSize = 10.sp,
                        color = DarkBlue
                    )

                }

                Box(
                    modifier = Modifier

                        .clip(RoundedCornerShape(10.dp))
                        .border(
                            width = 1.dp,
                            color = DarkBlue,
                            shape = RoundedCornerShape(12.dp)
                        )
                        .padding(8.dp)
                ) {
                    Icon(
                        modifier = Modifier.size(14.dp),
                        painter = painterResource(R.drawable.add_to_cart_icon),
                        contentDescription = "cart",
                        tint = DarkBlue
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewTomCard() {
    TomSectionCard(
        title = "Sport Tom",
        description = "He runs 1 meter... trips over his boot.",
        cheeseAmount = "3 cheeses",
        imageResId = R.drawable.tom2,
        discount = "5"
    )
}