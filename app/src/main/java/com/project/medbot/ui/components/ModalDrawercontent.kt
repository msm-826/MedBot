package com.project.medbot.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ClearAll
import androidx.compose.material.icons.rounded.Contacts
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import com.project.medbot.R
import kotlinx.coroutines.launch

@Composable
fun ModalDrawerContent(
    drawerState: DrawerState,
    modifier: Modifier = Modifier
) {
    val scope = rememberCoroutineScope()
    val drawerItems = listOf(
        "Home", "Contacts", "Clear chat"
    )
    val selectedDrawerItem = remember { mutableStateOf(drawerItems[0]) }

    ModalDrawerSheet {
        Text(
            text = "MedBot",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_large)),
            fontWeight = FontWeight.Bold
        )
        Divider()
        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.padding_medium)))
        drawerItems.forEach { item ->
            NavigationDrawerItem(
                label = { Text(text = item) },
                icon = {
                    when(item) {
                        "Home" -> Icon(Icons.Rounded.Home, contentDescription = null)
                        "Contacts" -> Icon(Icons.Rounded.Contacts, contentDescription = null)
                        "Clear chat" -> Icon(Icons.Rounded.ClearAll, contentDescription = null)
                    }
                },
                selected = item == selectedDrawerItem.value,
                onClick = {
                    scope.launch { drawerState.close() }
                    selectedDrawerItem.value = item
                },
                modifier = modifier
            )
        }
    }
}
