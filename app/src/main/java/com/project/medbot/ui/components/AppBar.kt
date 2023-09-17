package com.project.medbot.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.project.medbot.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    onMenuButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        title = { },
        modifier = modifier,
        navigationIcon = {
            IconButton(
                onClick = onMenuButtonClicked
            ) {
                Icon(
                    imageVector = Icons.Rounded.Menu,
                    contentDescription = stringResource(R.string.menu_button)
                )
            }
        }

    )
}