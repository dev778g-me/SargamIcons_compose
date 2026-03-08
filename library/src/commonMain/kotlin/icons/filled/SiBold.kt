package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBold: ImageVector
    get() {
        if (_SiBold != null) {
            return _SiBold!!
        }
        _SiBold = ImageVector.Builder(
            name = "Filled.SiBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                curveToRelative(0f, -2.151f, -1.864f, -4f, -4.182f, -4f)
                horizontalLineTo(8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5.818f)
                curveTo(16.136f, 20f, 18f, 18.151f, 18f, 16f)
                moveToRelative(-3f, -9f)
                curveToRelative(0f, -1.603f, -1.394f, -3f, -3.25f, -3f)
                horizontalLineTo(8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3.75f)
                curveTo(13.606f, 10f, 15f, 8.603f, 15f, 7f)
                moveToRelative(2f, 0f)
                curveToRelative(0f, 1.276f, -0.494f, 2.42f, -1.297f, 3.291f)
                curveTo(18.168f, 11.069f, 20f, 13.325f, 20f, 16f)
                curveToRelative(0f, 3.322f, -2.827f, 6f, -6.182f, 6f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(6.75f)
                curveTo(14.594f, 2f, 17f, 4.18f, 17f, 7f)
            }
        }.build()

        return _SiBold!!
    }

@Suppress("ObjectPropertyName")
private var _SiBold: ImageVector? = null
