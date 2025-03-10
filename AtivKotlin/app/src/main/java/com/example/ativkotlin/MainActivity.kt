package com.example.ativkotlin

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ativkotlin.ui.theme.AtivKotlinTheme
import com.example.ativkotlin.ui.theme.Minhacor
import com.example.ativkotlin.ui.theme.Purple40
import com.example.ativkotlin.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AtivKotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProdutoItem()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ProdutoItem() {
    var nome by remember { mutableStateOf("")}
    var telefone by remember{ mutableStateOf( "")}
    var curso by remember{ mutableStateOf( "")}
    var serie by remember{ mutableStateOf( "")}

    // Main container for the product item
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Image and text content
        Box(
            modifier = Modifier
                .height(170.dp) // Ajuste a altura do Box conforme necessário
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Purple500, Minhacor, Purple40)
                    )
                )
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.lll),
                contentDescription = "Descrição da imagem",
                modifier = Modifier
                    .offset(y = 50.dp) // Ajuste o valor de offset conforme necessário
                    .clip(CircleShape)
                    .align(Alignment.BottomCenter)
                    .height(200.dp)  // Defina a altura desejada
                    .width(250.dp)   // Defina a largura desejada (ajuste conforme necessário)
            )
        }

        Spacer(modifier = Modifier.height(70.dp))  // Espaço adicional abaixo da imagem

        Column(
            modifier = Modifier
                .fillMaxWidth() // Preenche toda a largura disponível
                .padding(bottom = 16.dp), // Adiciona padding na parte inferior
            horizontalAlignment = Alignment.CenterHorizontally, // Centraliza o conteúdo horizontalmente
            verticalArrangement = Arrangement.Center // Opcional, centraliza verticalmente se houver espaço
        ) {
            Text(
                text = "Não é cadastrado? Se cadastre!!",
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold, // Altere para negrito
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                color = Color.Magenta,
                style = TextStyle(
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // Espaço entre o texto e o TextField


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp), // Adiciona padding na parte inferior
            horizontalArrangement = Arrangement.Center
        ) {
            TextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Nome:") },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    focusedLabelColor = Color.Magenta,
                    unfocusedLabelColor = Color.Magenta
                )
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            TextField(
                value = telefone,
                onValueChange = { telefone = it },
                label = { Text("Telefone:") },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    focusedLabelColor = Color.Magenta,
                    unfocusedLabelColor = Color.Magenta
                )
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        // Curso input TextField
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            TextField(
                value = curso,
                onValueChange = { curso = it },
                label = { Text("Curso:") },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    focusedLabelColor = Color.Magenta,
                    unfocusedLabelColor = Color.Magenta
                )
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        // Série input TextField
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            TextField(
                value = serie,
                onValueChange = { serie = it },
                label = { Text("Série:") },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    focusedLabelColor = Color.Magenta,
                    unfocusedLabelColor = Color.Magenta
                )
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        // Cadastrar Button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    nome = ""
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .width(120.dp)
                    .height(50.dp) // Ajuste a altura do botão
                    .clip(RoundedCornerShape(12.dp)) // Arredonda as bordas do botão
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple40, Minhacor, Purple500
                            )
                        )
                    )
            ) {
                Text(
                    text = "Cadastrar",
                    color = Color.White,
                    fontSize = 15.sp
                )
            }
        }
    }
}
