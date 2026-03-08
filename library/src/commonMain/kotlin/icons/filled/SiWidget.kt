package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiWidget: ImageVector
    get() {
        if (_SiWidget != null) {
            return _SiWidget!!
        }
        _SiWidget = ImageVector.Builder(
            name = "Filled.SiWidget",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.2f, 13f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.8f, 1.8f)
                verticalLineToRelative(5.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.2f, 22f)
                lineTo(3.8f, 22f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20.2f)
                verticalLineToRelative(-5.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.8f, 13f)
                close()
                moveTo(17.5f, 13f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 9f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -9f)
                moveTo(5.325f, 2.492f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.409f, 0.124f)
                lineToRelative(3.111f, 3.111f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.545f)
                lineToRelative(-3.111f, 3.111f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.545f, 0f)
                lineToRelative(-3.112f, -3.11f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.546f)
                lineTo(5.19f, 2.616f)
                close()
                moveTo(17.983f, 11.346f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.063f, 0.004f)
                lineToRelative(0.529f, -0.85f)
                close()
                moveTo(20.337f, 5.632f)
                curveToRelative(0f, -0.658f, -0.505f, -1.132f, -1.062f, -1.132f)
                curveToRelative(-0.388f, 0f, -0.746f, 0.227f, -0.935f, 0.598f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.783f, 0f)
                arcToRelative(1.06f, 1.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.934f, -0.598f)
                curveToRelative(-0.557f, 0f, -1.063f, 0.477f, -1.063f, 1.132f)
                curveToRelative(0f, 0.774f, 0.477f, 1.607f, 1.316f, 2.42f)
                curveToRelative(0.403f, 0.391f, 0.922f, 0.79f, 1.36f, 1.1f)
                quadToRelative(0.109f, 0.077f, 0.209f, 0.143f)
                quadToRelative(0.095f, -0.063f, 0.198f, -0.136f)
                curveToRelative(0.432f, -0.308f, 0.958f, -0.711f, 1.39f, -1.117f)
                curveToRelative(0.916f, -0.86f, 1.304f, -1.616f, 1.304f, -2.41f)
                moveToRelative(2f, 0f)
                curveToRelative(0f, 1.467f, -0.71f, 2.654f, -1.727f, 3.668f)
                lineToRelative(-0.207f, 0.2f)
                curveToRelative(-0.526f, 0.494f, -1.134f, 0.955f, -1.597f, 1.286f)
                curveToRelative(-0.234f, 0.168f, -0.438f, 0.306f, -0.583f, 0.402f)
                lineToRelative(-0.173f, 0.114f)
                lineToRelative(-0.048f, 0.031f)
                lineToRelative(-0.012f, 0.009f)
                lineToRelative(-0.005f, 0.002f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.535f, -0.844f)
                lineToRelative(-0.529f, 0.85f)
                lineToRelative(-0.006f, -0.004f)
                lineToRelative(-0.013f, -0.01f)
                lineToRelative(-0.05f, -0.031f)
                lineToRelative(-0.178f, -0.115f)
                curveToRelative(-0.15f, -0.098f, -0.357f, -0.238f, -0.595f, -0.407f)
                curveToRelative(-0.47f, -0.332f, -1.084f, -0.799f, -1.594f, -1.294f)
                curveToRelative(-0.986f, -0.956f, -1.924f, -2.28f, -1.924f, -3.857f)
                curveToRelative(0f, -1.697f, 1.34f, -3.132f, 3.063f, -3.132f)
                curveToRelative(0.69f, 0f, 1.32f, 0.235f, 1.826f, 0.621f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.826f, -0.621f)
                curveToRelative(1.722f, 0f, 3.062f, 1.43f, 3.062f, 3.132f)
            }
        }.build()

        return _SiWidget!!
    }

@Suppress("ObjectPropertyName")
private var _SiWidget: ImageVector? = null
