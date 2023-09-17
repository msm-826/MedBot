package com.project.medbot.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.project.medbot.R

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