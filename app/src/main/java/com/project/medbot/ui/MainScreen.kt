package com.project.medbot.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.project.medbot.R
import com.project.medbot.ui.theme.MedBotTheme

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_large)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomTextField(
                onValueChange = { /*TODO*/ },
                onMicButtonClicked = { /*TODO*/ },
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(dimensionResource(id = R.dimen.padding_small)))
            SendButton(onSendButtonClicked = { /*TODO*/ })
        }
    }
}

@Composable
fun BottomTextField(
    onValueChange: () -> Unit,
    onMicButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = "",
        onValueChange = { onValueChange() },
        modifier = modifier,
        placeholder = { Text(text = "Message") },
        leadingIcon = {
            IconButton(
                onClick = onMicButtonClicked
            ) {
                Icon(
                    imageVector = Icons.Default.Mic,
                    contentDescription = stringResource(R.string.mic_button)
                )
            }
        },
        maxLines = 3,
        shape = MaterialTheme.shapes.extraLarge,
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun SendButton(
    onSendButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    FilledIconButton( // enabled based on input
        onClick = onSendButtonClicked,
        modifier = modifier,
        shape = CircleShape
    ) {
        Icon(
            imageVector = Icons.Rounded.ArrowForward,
            contentDescription = stringResource(R.string.send_button)
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MainScreenPreview() {
    MedBotTheme {
        Surface {
            MainScreen()
        }
    }
}