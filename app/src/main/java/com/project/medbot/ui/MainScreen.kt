package com.project.medbot.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Android
import androidx.compose.material.icons.rounded.Person2
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.medbot.R
import com.project.medbot.data.SampleDataSource
import com.project.medbot.ui.components.AppBar
import com.project.medbot.ui.components.BottomTextFieldAndButton
import com.project.medbot.ui.components.MessageBubble
import com.project.medbot.ui.components.ModalDrawerContent
import com.project.medbot.ui.theme.MedBotTheme
import kotlinx.coroutines.launch

@Composable
fun MainScreen() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerContent(
                drawerState = drawerState,
                modifier = Modifier.padding(
                    vertical = dimensionResource(id = R.dimen.padding_small),
                    horizontal = dimensionResource(id = R.dimen.padding_medium)
                )
            )
        },
        drawerState = drawerState,
        gesturesEnabled = true
    ) {
        MainScreenContent(drawerState = drawerState)
    }
}

@Composable
fun MainScreenContent(
    drawerState: DrawerState,
    modifier: Modifier = Modifier
) {
    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = modifier,
        topBar = { AppBar(onMenuButtonClicked = { scope.launch { drawerState.open() } }) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentPadding = innerPadding
            ) {
                items(SampleDataSource.sampleData) {item ->
                    MessageBubble(
                        sender = item.sender,
                        imageVector = if (item.sender == "USER") Icons.Rounded.Person2 else Icons.Rounded.Android,
                        message = item.messageContent,
                        modifier = Modifier.fillMaxWidth()
                    )

                    if (item.sender == "BOT") {
                        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_very_large)))
                    } else {
                        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_small)))
                    }
                }
            }
            BottomTextFieldAndButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp)
            )
        }
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