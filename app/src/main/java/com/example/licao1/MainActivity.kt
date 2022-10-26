package com.example.licao1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() { //serve para criar a aplicação
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { //define o layout da atividade em que as funções de composição são chamadas
            MessageCard("Rafael") // recebe um nome e o usa para configurar o elemento de texto
        }
    }
}

        @Composable //torna uma função composta
        fun MessageCard(name: String) {
            Text(text = "Hello $name!") //mostra um identificador de texto na tela.
        }

        @Preview //permite visualizar as funções de composição
        @Composable //torna uma função composta
        fun PreviewMessageCard() {
            MessageCard("Rafael") // recebe um nome e o usa para configurar o elemento de texto

        }
