package com.example.licao1

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() { //serve para criar a aplicação
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { //define o layout da atividade em que as funções de composição são chamadas
            MessageCard(Message("Rafael", "Osvaldo Vanderlei"))  // recebe um nome e o usa para configurar o elemento de texto
        }
    }

    data class Message(val author: String, val body: String)

    @Composable //torna uma função composta
    fun MessageCard(msg: Message) {

        // Adiciona preenchimento ao redor de nossa mensagem
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(R.drawable.profile_picture),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Define o tamanho da imagem para 40 dp
                    .size(40.dp)
                    //Recorta a imagem a ser moldada como um círculo
                    .clip(CircleShape)
            )

            // Adiciona um espaço horizontal entre a imagem e a coluna
            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(text = msg.author)
                // Adiciona um espaço vertical entre o autor e os textos da mensagem
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = msg.body)
            }
        }
    }

    @Preview //permite visualizar as funções de composição
    @Composable //torna uma função composta
    fun PreviewMessageCard() {
        MessageCard(
            msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it´s great!")
        )
    }
}
