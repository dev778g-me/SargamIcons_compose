package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiThumbDown: ImageVector
    get() {
        if (_SiThumbDown != null) {
            return _SiThumbDown!!
        }
        _SiThumbDown = ImageVector.Builder(
            name = "Filled.SiThumbDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 13.174f)
                horizontalLineToRelative(1.665f)
                curveToRelative(0.337f, 0f, 0.652f, 0.17f, 0.837f, 0.451f)
                lineToRelative(4.578f, 6.981f)
                curveToRelative(0.325f, -0.314f, 0.502f, -0.67f, 0.581f, -1.032f)
                curveToRelative(0.131f, -0.604f, 0.009f, -1.33f, -0.378f, -2.027f)
                lineToRelative(-0.004f, -0.007f)
                lineToRelative(-0.64f, -1.174f)
                lineToRelative(-0.02f, -0.04f)
                curveToRelative(-0.326f, -0.669f, -0.438f, -1.477f, -0.031f, -2.174f)
                curveToRelative(0.416f, -0.711f, 1.184f, -0.987f, 1.932f, -0.978f)
                horizontalLineToRelative(3.236f)
                curveToRelative(0.238f, 0f, 0.826f, -0.042f, 1.32f, -0.411f)
                curveToRelative(0.427f, -0.32f, 0.992f, -1.043f, 0.917f, -2.85f)
                curveToRelative(-0.066f, -1.517f, -0.73f, -2.784f, -1.47f, -3.685f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.038f, -1.011f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.148f, 5f)
                horizontalLineTo(7f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(11.273f)
                curveToRelative(0.321f, 0f, 0.61f, 0.13f, 0.773f, 0.212f)
                curveToRelative(0.202f, 0.102f, 0.417f, 0.24f, 0.633f, 0.4f)
                curveToRelative(0.432f, 0.32f, 0.924f, 0.777f, 1.391f, 1.348f)
                curveToRelative(0.875f, 1.068f, 1.719f, 2.6f, 1.895f, 4.484f)
                lineToRelative(0.026f, 0.382f)
                verticalLineToRelative(0.002f)
                curveToRelative(0.096f, 2.304f, -0.642f, 3.733f, -1.718f, 4.537f)
                curveToRelative(-1.01f, 0.755f, -2.127f, 0.809f, -2.517f, 0.809f)
                horizontalLineTo(15.5f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.169f, 0.014f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.082f, 0.253f)
                lineToRelative(0.62f, 1.135f)
                lineToRelative(0.103f, 0.197f)
                curveToRelative(0.5f, 0.988f, 0.718f, 2.128f, 0.48f, 3.225f)
                curveToRelative(-0.261f, 1.203f, -1.051f, 2.249f, -2.377f, 2.9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.277f, -0.35f)
                lineToRelative(-4.837f, -7.374f)
                horizontalLineTo(7f)
                verticalLineToRelative(0.026f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.2f, 17f)
                horizontalLineTo(2.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 15.2f)
                verticalLineTo(2.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.8f, 1f)
                horizontalLineToRelative(2.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2.8f)
                close()
            }
        }.build()

        return _SiThumbDown!!
    }

@Suppress("ObjectPropertyName")
private var _SiThumbDown: ImageVector? = null
