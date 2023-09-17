package com.project.medbot.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.project.medbot.R
import com.project.medbot.ui.components.AppBar
import com.project.medbot.ui.components.BottomTextFieldAndButton
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
                    .weight(1f)
                    .padding(horizontal = dimensionResource(id = R.dimen.padding_large)),
                contentPadding = innerPadding
            ) {
                items(100) {index ->
                    Text("Item $index")
                }
            }
            BottomTextFieldAndButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(id = R.dimen.padding_large))
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