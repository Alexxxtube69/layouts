package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.AppTheme

@Composable
fun Layout2() {
    Column() {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
                .weight(1f),

        ) {

            Text(
                text = "Alexsander",
                color = Color.Black,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .wrapContentHeight(Alignment.CenterVertically),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Green)
                .weight(1f)
        ) {

            Text(
                text = "Alexsander",
                color = Color.Black,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .wrapContentHeight(Alignment.CenterVertically),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Blue)
                .weight(1f)
        ) {

            Text(
                text = "Alexsander",
                color = Color.Black,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .wrapContentHeight(Alignment.CenterVertically),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
        }

    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLayout2() {
    AppTheme {
        Layout2()
    }
}
