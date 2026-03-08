package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiLink: ImageVector
    get() {
        if (_SiLink != null) {
            return _SiLink!!
        }
        _SiLink = ImageVector.Builder(
            name = "Filled.SiLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.241f, 13.281f)
                curveToRelative(0f, -0.722f, -0.282f, -1.416f, -0.785f, -1.934f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.436f, -1.393f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.654f)
                lineToRelative(-0.003f, 0.004f)
                lineToRelative(-3.913f, 3.992f)
                arcToRelative(4.62f, 4.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.618f, 0f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.008f, -6.664f)
                lineTo(5.957f, 11.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.448f, 1.38f)
                lineTo(4.8f, 15.317f)
                lineToRelative(-0.009f, 0.01f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.18f, 3.678f)
                lineToRelative(0.18f, 0.202f)
                verticalLineToRelative(0.001f)
                arcToRelative(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.754f, 0f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(3.914f, -3.995f)
                curveToRelative(0.5f, -0.518f, 0.781f, -1.21f, 0.781f, -1.93f)
                moveTo(20f, 6.732f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.79f, -1.94f)
                verticalLineToRelative(-0.001f)
                arcToRelative(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.754f, 0f)
                lineToRelative(-0.003f, 0.003f)
                lineToRelative(-4.049f, 4.12f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.232f, 3.612f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.2f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.4f, -6.207f)
                lineToRelative(0.004f, -0.003f)
                lineToRelative(4.05f, -4.123f)
                arcToRelative(4.62f, 4.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.615f, 0.002f)
                arcToRelative(4.777f, 4.777f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.019f, 6.654f)
                lineTo(17.95f, 12.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.469f, -1.359f)
                lineToRelative(2.71f, -2.93f)
                lineToRelative(0.018f, -0.02f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.79f, -1.94f)
            }
        }.build()

        return _SiLink!!
    }

@Suppress("ObjectPropertyName")
private var _SiLink: ImageVector? = null
