package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAirplaneAlt: ImageVector
    get() {
        if (_SiAirplaneAlt != null) {
            return _SiAirplaneAlt!!
        }
        _SiAirplaneAlt = ImageVector.Builder(
            name = "Filled.SiAirplaneAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.305f, 3.07f)
                curveToRelative(0.433f, 0.018f, 0.806f, 0.197f, 1.111f, 0.502f)
                reflectiveCurveToRelative(0.484f, 0.678f, 0.503f, 1.111f)
                curveToRelative(0.018f, 0.416f, -0.112f, 0.843f, -0.33f, 1.272f)
                curveToRelative(-0.435f, 0.85f, -1.3f, 1.866f, -2.532f, 3.097f)
                lineToRelative(-1.005f, 1.005f)
                lineToRelative(1.555f, 6.94f)
                lineToRelative(0.005f, 0.03f)
                curveToRelative(0.12f, 0.732f, -0.242f, 1.339f, -0.673f, 1.745f)
                verticalLineToRelative(0.001f)
                lineToRelative(-1.413f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.814f, -0.156f)
                lineTo(13f, 13.685f)
                lineToRelative(-3.237f, 2.848f)
                lineToRelative(0.644f, 2.332f)
                lineToRelative(0.005f, 0.018f)
                curveToRelative(0.105f, 0.437f, -0.068f, 0.884f, -0.354f, 1.17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.078f, 0.064f)
                lineToRelative(-1.298f, 0.854f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.722f, -0.193f)
                lineTo(6.377f, 17.61f)
                lineToRelative(-3.159f, -1.574f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.195f, -0.722f)
                lineToRelative(0.855f, -1.298f)
                lineToRelative(0.064f, -0.078f)
                curveToRelative(0.286f, -0.286f, 0.733f, -0.459f, 1.17f, -0.354f)
                lineToRelative(0.018f, 0.005f)
                lineToRelative(2.331f, 0.643f)
                lineToRelative(2.848f, -3.237f)
                lineToRelative(-6.345f, -2.711f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.157f, -0.814f)
                lineToRelative(1.401f, -1.4f)
                curveToRelative(0.381f, -0.411f, 0.944f, -0.761f, 1.623f, -0.703f)
                lineToRelative(0.138f, 0.017f)
                lineToRelative(0.027f, 0.005f)
                lineToRelative(6.94f, 1.554f)
                lineToRelative(1.006f, -1.005f)
                curveToRelative(1.23f, -1.23f, 2.246f, -2.098f, 3.093f, -2.534f)
                curveToRelative(0.428f, -0.22f, 0.855f, -0.35f, 1.27f, -0.333f)
            }
        }.build()

        return _SiAirplaneAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiAirplaneAlt: ImageVector? = null
