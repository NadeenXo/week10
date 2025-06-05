package com.example.tomandjerry.screen

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Black
import com.example.tomandjerry.ui.theme.Blue
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.LightBlue
import com.example.tomandjerry.ui.theme.SecondaryTextColor
import com.example.tomandjerry.ui.theme.White


@Composable
fun TomAccount(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(DarkBlue)
    ) {
        // Top Profile Header
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .background(DarkBlue)
                .padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.tom_img),
                contentDescription = "Tom Image",
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Text(text = "Tom", color = White, fontSize = 16.sp)
            Text(text = "specializes in failure!", color = White, fontSize = 12.sp)
            Text(
                text = "Edit foolishness",
                color = White,
                fontSize = 12.sp,
                modifier = Modifier
                    .background(White.copy(alpha = 0.1f), RoundedCornerShape(16.dp))
                    .padding(horizontal = 16.dp, vertical = 4.dp)
            )
        }

        // Main Content Box
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(LightBlue)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {

                // Stats Row
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        StatCard(
                            "2M 12K",
                            "No. of quarrels",
                            R.drawable.quarrels_icon,
                            Black,
                            backgroundColor = Color(0xFFD0E5F0)
                        )
                        StatCard(
                            "+500 h",
                            "Chase time",
                            R.drawable.chase_icon,
                            Black,
                            backgroundColor = Color(0xFFDEEECD)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        StatCard(
                            "2M 12K",
                            "Hunting times",
                            R.drawable.hunting_icon,
                            Black,
                            backgroundColor = Color(0xFFF2D9E7)
                        )
                        StatCard(
                            "3M 7K",
                            "Heartbroken",
                            R.drawable.heart_icon,
                            Black,
                            backgroundColor = Color(0xFFFAEDCF)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Settings
                Text("Tom settings", color = Black, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                SettingsItem("Change sleeping place", R.drawable.bed_icon)
                SettingsItem("Meow settings", R.drawable.cat_icon)
                SettingsItem("Password to open the fridge", R.drawable.fridge_icon)

                Spacer(modifier = Modifier.height(8.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(.7.dp)
                        .background(color = SecondaryTextColor)
                )

                Spacer(modifier = Modifier.height(8.dp))
                // Favorite Foods
                Text(
                    "His favorite foods",
                    color = Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                SettingsItem("Mouses", R.drawable.icon_i)
                SettingsItem("Last stolen meal", R.drawable.meal_icon)
                SettingsItem("Change sleep mood", R.drawable.sleep_icon)

                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("v.TomBeta")
                }
            }
        }
    }
}

@Composable
fun StatCard(
    value: String,
    label: String,
    iconRes: Int,
    textColor: Color,
    backgroundColor: Color = White
) {
    Box(
        modifier = Modifier
            .width(175.dp)
            .background(backgroundColor, RoundedCornerShape(12.dp))
            .padding(10.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = "Image",
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = value, color = textColor)
                Text(text = label, color = textColor, fontSize = 12.sp)
            }
        }
    }
}

@Composable
fun SettingsItem(text: String, iconRes: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(32.dp)
//                .background(DarkBlue, RoundedCornerShape(6.dp))
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = "Pasta Image",
                modifier = Modifier.size(32.dp)

            )
//            Spacer(modifier = Modifier.padding(8.dp))
        }
        Text(
            text = text,
            modifier = Modifier.padding(start = 12.dp),
            color = Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTomAccount() {
    TomAccount(modifier = Modifier)
}