package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiLamp: ImageVector
    get() {
        if (_SiLamp != null) {
            return _SiLamp!!
        }
        _SiLamp = ImageVector.Builder(
            name = "Filled.SiLamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 21f)
                curveToRelative(0f, -0.64f, -0.458f, -1f, -0.818f, -1f)
                lineTo(8.818f, 20f)
                curveToRelative(-0.36f, 0f, -0.818f, 0.36f, -0.818f, 1f)
                close()
                moveTo(23f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.182f)
                curveTo(16.822f, 18f, 18f, 19.44f, 18f, 21f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(7f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.56f, 1.179f, -3f, 2.818f, -3f)
                lineTo(11f, 18f)
                verticalLineToRelative(-4f)
                lineTo(2f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-1f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.925f, 11f, 11f)
                close()
            }
        }.build()

        return _SiLamp!!
    }

@Suppress("ObjectPropertyName")
private var _SiLamp: ImageVector? = null
