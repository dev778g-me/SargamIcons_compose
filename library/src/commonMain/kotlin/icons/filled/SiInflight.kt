package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiInflight: ImageVector
    get() {
        if (_SiInflight != null) {
            return _SiInflight!!
        }
        _SiInflight = ImageVector.Builder(
            name = "Filled.SiInflight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(8.855f, 5.501f)
                curveToRelative(0.468f, 0.028f, 0.892f, 0.158f, 1.288f, 0.403f)
                lineToRelative(0.167f, 0.113f)
                lineToRelative(0.029f, 0.022f)
                lineToRelative(5.329f, 4.45f)
                lineToRelative(4.227f, -0.249f)
                horizontalLineToRelative(0.037f)
                curveToRelative(1.416f, 0.017f, 2.535f, 1.203f, 2.537f, 2.587f)
                lineToRelative(0.031f, 2.166f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.507f)
                horizontalLineTo(9.999f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.161f, -0.026f)
                lineTo(3.824f, 13.42f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.28f, -0.236f)
                lineToRelative(-1.984f, -3.7f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.446f, -0.736f)
                lineToRelative(0.977f, 0.012f)
                horizontalLineToRelative(0.006f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.738f, 0.78f)
                lineToRelative(0.977f, 0.959f)
                horizontalLineToRelative(4.34f)
                lineToRelative(-2.92f, -4.209f)
                arcToRelative(0.501f, 0.501f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.408f, -0.785f)
                lineToRelative(1.29f, -0.006f)
                close()
            }
        }.build()

        return _SiInflight!!
    }

@Suppress("ObjectPropertyName")
private var _SiInflight: ImageVector? = null
