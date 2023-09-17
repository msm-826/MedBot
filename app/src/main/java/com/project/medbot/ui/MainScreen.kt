package com.project.medbot.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.project.medbot.R
import com.project.medbot.ui.components.AppBar
import com.project.medbot.ui.components.BottomTextField
import com.project.medbot.ui.components.ModalDrawerContent
import com.project.medbot.ui.components.SendButton
import com.project.medbot.ui.theme.MedBotTheme
import kotlinx.coroutines.launch

@Composable
fun MainScreen() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerContent(
                drawerState = drawerState,
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small))
            )
        },
        drawerState = drawerState,
        gesturesEnabled = true
    ) {
        MainScreenContent(
            drawerState = drawerState
        )
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
                .padding(innerPadding)
                .fillMaxSize()
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