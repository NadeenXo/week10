package com.example.tomandjerry.screen

import androidx.compose.foundation.rememberScrollState
import androidx.compose.ui.draw.shadow
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Blue
import com.example.tomandjerry.ui.theme.DarkBlue
import com.example.tomandjerry.ui.theme.LightBlue
import com.example.tomandjerry.ui.theme.LightBlueGradiant
import com.example.tomandjerry.ui.theme.LightGray
import com.example.tomandjerry.ui.theme.LighterBlue
import com.example.tomandjerry.ui.theme.SecondaryTextColor
import com.example.tomandjerry.ui.theme.White

@Composable
fun TomKitchen(modifier: Modifier) {
    // Main content
    Column(
        modifier = modifier
            .background(Blue)
    ) {
        // Header Section
        HeaderTom()
        // Content Section
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(LightBlue)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(LightBlue)
                    .padding(horizontal = 16.dp, vertical = 34.dp)
            ) {
                // Title
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Electric Tom pasta",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier.weight(1f)
                    )
                    Icon(
                        painter = painterResource(R.drawable.favorite_icon),
                        contentDescription = null,
                        tint = DarkBlue,
                        modifier = Modifier
                            .size(24.dp)
                            .offset(y = (12).dp)
                    )
                }

                // Cheese badge
                Box(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(color = LighterBlue)
                        .padding(horizontal = 8.dp, vertical = 8.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Icon(
                            painter = painterResource(id = R.drawable.money_bag), // Replace with your icon
                            contentDescription = "Cheese Icon",
                            tint = DarkBlue,
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "5 cheeses",
                            color = DarkBlue,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }

                // Description
                Text(
                    text = """
                        Pasta cooked with a charger cable and 
                        sprinkled with questionable cheese. Make sure 
                        to unplug it before eating (or not, you decide).
                    """.trimIndent(),
                    modifier = Modifier.padding(top = 8.dp),
                    textAlign = TextAlign.Justify,
                    color = SecondaryTextColor,
                    fontWeight = FontWeight.Normal
                )

                DetailsSection()

                PreparationSection()

                AddToCartBtn()
            }
        }
    }
}

@Composable
private fun AddToCartBtn() {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = DarkBlue
        ),

        ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Add to cart",
                color = Color.White
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = ".",
                color = SecondaryTextColor,
                fontSize = 32.sp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .offset(y = -(5).dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "3 cheeses",
                color = Color.White,
                fontSize = 12.sp,
            )
            Text(
                text = "5 cheeses",
                color = Color.White,
                fontSize = 10.sp,
                style = TextStyle(textDecoration = TextDecoration.LineThrough)
            )
        }
    }
}

@Composable
private fun PreparationSection() {
    Text(
        text = "Preparation method",
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 16.dp),
        fontSize = 20.sp
    )

    Column(
        modifier = Modifier.padding(horizontal = 2.dp, vertical = 8.dp)
    ) {
        InstructionItem(step = 1, description = "Put the pasta in a toaster.")
        InstructionItem(step = 2, description = "Pour battery juice over it.")
        InstructionItem(step = 3, description = "Wait for the spark to ignite.")
        InstructionItem(step = 4, description = "Serve with an insulating glove.")
    }
}

@Composable
private fun DetailsSection() {
    Text(
        text = "Details",
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 18.dp),
        fontSize = 20.sp
    )

    Row(
        modifier = Modifier
            .padding(top = 8.dp)
            .height(120.dp)
            .horizontalScroll(rememberScrollState())
    ) {
        DetailCard(
            iconRes = R.drawable.money_bag, // Replace with your icon
            title = "1000 V",
            subtitle = "Temperature"
        )
        DetailCard(
            iconRes = R.drawable.money_bag, // Replace with your icon
            title = "3 sparks",
            subtitle = "Time"
        )
        DetailCard(
            iconRes = R.drawable.money_bag, // Replace with your icon
            title = "1M 12K",
            subtitle = "No. of deaths"
        )
    }
}

@Composable
private fun HeaderTom() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .padding(bottom = 16.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse3),
                contentDescription = "Pasta Image",
                modifier = Modifier

            )
        }
        // Icons and text at the top left
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .offset(x = (-50).dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {

            Row(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.money_bag), //todo Replace with your icon
                    contentDescription = "High Tension Icon",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "High tension",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }

            Row(
                modifier = Modifier
                    .padding(start = 16.dp, bottom = 16.dp)
//                    .align(Alignment.BottomStart)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.money_bag), //todo Replace with your icon
                    contentDescription = "Shocking Foods Icon",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Shocking foods",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .offset(x = -(20).dp, y = (25).dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.pasta),
                contentDescription = "Pasta Image",
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(200.dp)
            )
        }

    }
}

@Composable
fun DetailCard(
    iconRes: Int,
    title: String,
    subtitle: String
) {
    Card(
        modifier = Modifier
            .width(120.dp)
            .padding(end = 8.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = LighterBlue)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                tint = DarkBlue,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = subtitle,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}

@Composable
fun InstructionItem(step: Int, description: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(
                color = White,
                shape = RoundedCornerShape(10.dp)
            ),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "$step",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(0.1f)
                .offset(x = (-4).dp)
                .clip(shape = CircleShape)
                .background(color = White)
                .border(color = LighterBlue, width = 1.5.dp, shape = CircleShape)
                .padding(horizontal = 13.dp, vertical = 10.dp),
            color = DarkBlue,
            textAlign = TextAlign.Center,

            )
        Text(
            text = description,
            modifier = Modifier.weight(0.9f),
            color = SecondaryTextColor,
            fontWeight = FontWeight.Normal
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTomKitchen() {
    TomKitchen(modifier = Modifier)
}

