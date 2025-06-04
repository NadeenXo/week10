package com.example.tomandjerry.composable.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.PrimaryTextColor
import com.example.tomandjerry.ui.theme.SecondaryTextColor
import com.example.tomandjerry.ui.theme.White

@Composable
fun Header(title: String, subtitle: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.jerry),
            contentDescription = "Jerry Image",
            modifier = Modifier
                .size(48.dp)
                .clip(shape = RoundedCornerShape(12.dp))
        )
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            Column(
                Modifier.padding(0.dp, 8.dp)
            ) {

                Text(
                    text = title,//"Hi, Jerry 👋"
                    color = PrimaryTextColor,
//                fontFamily = ibmFont,
                    fontSize = 14.sp,
//                fontWeight = FontWeight.Bold
                )
                Text(
                    text = subtitle,//"Which Tom do you want to buy?"
                    color = SecondaryTextColor,
//                fontFamily = ibmFont,
                    fontSize = 12.sp,
//                fontWeight = FontWeight.Light
                )
            }
        }
        Box(
//            modifier = Modifier.padding(4.dp,0.dp)

        ) {

            Icon(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = SecondaryTextColor.copy(alpha = 0.5f),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(8.dp),
                painter = painterResource(R.drawable.notification_01),
                contentDescription = "notification"


            )
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 4.dp, y = (-4).dp)
                    .background(color = DarkBlue, shape = CircleShape)
                    .padding(4.dp, 1.dp)
            ) {
                Text(
                    text = "3",
                    color = White,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 10.sp
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHeader() {
    Header("Hi, Jerry 👋", "Which Tom do you want to buy?")
}