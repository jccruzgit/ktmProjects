package com.example.blogmultiplatform.styles

import com.example.blogmultiplatform.models.Theme
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.outline
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.focus
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val LoginInputStyle = CssStyle {
    base {
        Modifier
            .width(350.px)
            .height(54.px)
            .padding(leftRight = 20.px)
            .margin(topBottom = 8.px)
            .border(1.px, color = Colors.Gray)
            .borderRadius(8.px)
            .outline(
                color = Theme.Primary.rbg,
                width = 0.5.px,
                style = LineStyle.Solid
            )
            .backgroundColor(Colors.White)
            .transition(transition = Transition.of("border", duration = 300.ms))
    }

    focus{
        Modifier.border(
            width = 2.px,
            style = LineStyle.Solid,
            color = Theme.Primary.rbg
        )
    }

}