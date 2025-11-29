package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.dam.andy.app.ui.theme.AppTheme

@Composable
fun Layout3() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Row(verticalAlignment = Alignment.Top) {

            // Caja 1
            Box(
                modifier = Modifier
                    .size(50.dp, 50.dp)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) { Text("1", color = Color.White) }

            Spacer(modifier = Modifier.width(4.dp))

            // Caja 2
            Box(
                modifier = Modifier
                    .size(50.dp, 25.dp)
                    .background(Color.Blue),
                contentAlignment = Alignment.Center
            ) { Text("2", color = Color.White) }

            Spacer(modifier = Modifier.width(4.dp))

            // Caja 4
            Box(
                modifier = Modifier
                    .size(75.dp, 50.dp)
                    .background(Color(0xFF32CD32)),
                contentAlignment = Alignment.Center
            ) { Text("4", color = Color.White) }
        }

        Row {
            Spacer(modifier = Modifier.width(104.dp))
            Box(
                modifier = Modifier
                    .size(25.dp, 100.dp)
                    .background(Color(0xFF006400)),
                contentAlignment = Alignment.Center
            ) { Text("3", color = Color.White) }
        }


        Row(verticalAlignment = Alignment.Top) {

            // Caja 5
            Box(
                modifier = Modifier
                    .padding(top = (-50).dp)
                    .size(75.dp, 25.dp)
                    .background(Color(0xFF800080)),
                contentAlignment = Alignment.Center
            ) { Text("5", color = Color.White) }

            Spacer(modifier = Modifier.width(4.dp))

            // Caja 6
            Box(
                modifier = Modifier
                    .padding(top = (-25).dp)
                    .size(50.dp, 25.dp)
                    .background(Color.Cyan),
                contentAlignment = Alignment.Center
            ) { Text("6", color = Color.White) }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLayout3() {
    AppTheme {
        Layout3()
    }
}
