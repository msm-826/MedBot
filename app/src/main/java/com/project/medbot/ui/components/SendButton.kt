package com.project.medbot.ui.components

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.project.medbot.R

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