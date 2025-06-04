package com.example.tomandjerry.composable.jerrystore

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.DarkBlue

@Composable
fun TomSectionHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Cheap tom section", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Spacer(modifier = Modifier.weight(1f))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "View all",
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                color = DarkBlue
            )
            Icon(
                painter = painterResource(R.drawable.arrow_right),
                contentDescription = "arrow", tint = DarkBlue
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTomSection() {
    TomSectionHeader()
}