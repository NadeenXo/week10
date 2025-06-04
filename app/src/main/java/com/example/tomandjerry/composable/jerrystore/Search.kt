package com.example.tomandjerry.composable.jerrystore


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.SecondaryTextColor
import com.example.tomandjerry.ui.theme.White

@Composable
fun Search() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Search bar
        Row(
            modifier = Modifier
                .weight(1f)
                .border(
                    width = 1.dp,
                    color = SecondaryTextColor.copy(alpha = 0.5f),
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.search_normal),
                contentDescription = "Search Icon",
                modifier = Modifier.padding(end = 8.dp),
                tint = SecondaryTextColor
            )
            Text(
                text = "Search about Tom ...",
                color = SecondaryTextColor,
                fontSize = 14.sp
            )
        }

        // Filter icon
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(DarkBlue)
                .border(
                    width = 1.dp,
                    color = SecondaryTextColor.copy(alpha = 0.2f),
                    shape = RoundedCornerShape(12.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(R.drawable.filter_horizontal),
                contentDescription = "Filter Icon",
                modifier = Modifier.size(24.dp),
                tint = White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSearch() {
    Search()
}