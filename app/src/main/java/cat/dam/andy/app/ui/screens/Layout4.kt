package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.AppTheme

@Composable
fun Layout4() {
    var menos = 0

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Clients: $menos", color = Color.Black, fontSize = 40.sp)
        Row(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Button(onClick = {menos --}) {
                Text("-")
            }
            Button(onClick = {menos ++}) {
                Text("+")
            }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLayout4() {
    AppTheme {
        Layout4()
    }
}
