package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(19.dp), Arrangement.SpaceBetween, Alignment.CenterHorizontally
        ) {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 39.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = stringResource(R.string.app_logo),
                    modifier = Modifier
                        .size(110.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Column {
                    Text(
                        text = "Lion",
                        color = Color(0xFF395185),
                        fontSize = 34.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "School",
                        color = Color(0xFF395185),
                        fontSize = 34.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)
                    .padding(top = 60.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.course_description),
                        color = Color(0xFF395185),
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Card(
                        modifier = Modifier
                            .padding(top = 18.dp)
                            .width(95.dp)
                            .height(10.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFDC84B)
                        )
                    ) {}

                    Text(
                        modifier = Modifier
                            .padding(top = 28.dp)
                            .padding(horizontal = 20.dp),
                        text = stringResource(R.string.course_details),
                        color = Color.Gray,
                        fontSize = 21.sp,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(188.dp))

                    Button(
                        onClick = { },
                        modifier = Modifier
                            .height(60.dp)
                            .width(300.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFDC84B)
                        )
                    ) {
                        Text(
                            text = stringResource(R.string.start_button_text),
                            color = Color(0xFF395185),
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(80.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(
                            painter = painterResource(R.drawable.youtube),
                            contentDescription = stringResource(R.string.social_youtube),
                            modifier = Modifier.size(40.dp)
                        )
                        Image(
                            painter = painterResource(R.drawable.twitter),
                            contentDescription = stringResource(R.string.social_twitter),
                            modifier = Modifier.size(40.dp)
                        )
                        Image(
                            painter = painterResource(R.drawable.instagram),
                            contentDescription = stringResource(R.string.social_instagram),
                            modifier = Modifier.size(40.dp)
                        )
                        Image(
                            painter = painterResource(R.drawable.facebook),
                            contentDescription = stringResource(R.string.social_facebook),
                            modifier = Modifier.size(40.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    HomeScreen()
}
