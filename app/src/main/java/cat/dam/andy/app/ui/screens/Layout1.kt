package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.AppTheme

@Composable
fun Layout1() {
    Column() {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f)
        ) {
            Text(
                text = "7",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "8",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "9",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "%",
                color = Color.White,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color.Red),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f)

        ) {
            Text(
                text = "4",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "5",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "6",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "x",
                color = Color.White,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color.Red),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f)

        ) {
            Text(
                text = "1",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "2",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "3",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "-",
                color = Color.White,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color.Red),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .weight(1f)

        ) {
            Text(
                text = ".",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "0",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "=",
                color = Color.White,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "+",
                color = Color.White,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color.Red),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLayout() {
    AppTheme {
        Layout1();
    }
}
