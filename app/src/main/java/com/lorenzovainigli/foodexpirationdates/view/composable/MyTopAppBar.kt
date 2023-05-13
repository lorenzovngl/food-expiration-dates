package com.lorenzovainigli.foodexpirationdates.view.composable

import Marquee
import MarqueeParams
import androidx.compose.animation.core.LinearEasing
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(
    title: String,
    actions: @Composable RowScope.() -> Unit = {},
    navigationIcon: @Composable () -> Unit = {}
) {
    TopAppBar(
        title = {
            Marquee(
                modifier = Modifier,
                params = MarqueeParams(
                    period = 7500,
                    gradientEnabled = true,
                    gradientEdgeColor = MaterialTheme.colorScheme.primary,
                    direction = LocalLayoutDirection.current,
                    easing = LinearEasing
                )
            ) {
                Text(
                    text = title,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
        },
        actions = actions,
        navigationIcon = navigationIcon,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}